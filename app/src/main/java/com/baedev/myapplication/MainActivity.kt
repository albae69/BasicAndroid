package com.baedev.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var name = "bae"

        val addContactDialog = AlertDialog.Builder(this)
            .setTitle("Add Contact")
            .setMessage("Do you want to add $name into your contact list?")
            .setIcon(R.drawable.ic_add_contact)
            .setPositiveButton("Yas") { _, _ ->
                Toast.makeText(this, "$name added to your contact list", Toast.LENGTH_SHORT).show()
            }.setNegativeButton("Nope") { _, _ ->
                Toast.makeText(this, "$name does'nt added to your contact list", Toast.LENGTH_SHORT)
                    .show()
            }.create()

        btnDialog1.setOnClickListener {
            addContactDialog.show()
        }

        val options = arrayOf("First Item", "Second Item", "Third Item")

        val singleChoiceDialog = AlertDialog.Builder(this)
            .setTitle("Choose one of these options")
            .setSingleChoiceItems(options, 0) { _, i ->
                Toast.makeText(this, "You clicked on ${options[i]}", Toast.LENGTH_SHORT).show()
            }
            .setPositiveButton("Accept") { _, i ->
                Toast.makeText(this, "You accepted singleDialogChoice", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Deny") { _, i ->
                Toast.makeText(this, "You denied singleDialogChoice", Toast.LENGTH_SHORT).show()
            }.create()


        btnDialog2.setOnClickListener {
            singleChoiceDialog.show()
        }

        val multiChoicesDialog = AlertDialog.Builder(this)
            .setTitle("Choose one of these options")
            .setMultiChoiceItems(options, booleanArrayOf(false, false, false)) { _, i, isChecked ->
                if (isChecked) {
                    Toast.makeText(this, "you checked ${options[i]}", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "you unchecked ${options[i]}", Toast.LENGTH_SHORT).show()

                }
            }
            .setPositiveButton("Accept") { _, i ->
                Toast.makeText(this, "You accepted multiDialogChoice", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Deny") { _, i ->
                Toast.makeText(this, "You denied multiDialogChoice", Toast.LENGTH_SHORT).show()
            }.create()

        btnDialog3.setOnClickListener {
            multiChoicesDialog.show()
        }

    }


}