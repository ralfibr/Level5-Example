package com.example.reminderapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.reminderapp.Data.Reminder
import kotlinx.android.synthetic.main.activity_add.*
import kotlinx.android.synthetic.main.content_add.*
const val EXTRA_REMINDER = "EXTRA_REMINDER"

class AddActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)
        setSupportActionBar(toolbar)
// call onSaveClick
        fab.setOnClickListener { view ->
            onSaveClick()
        }

    }
    // save a reminder and get intent to the main activity
    private fun onSaveClick() {
        if (etAddReminder.text.toString().isNotBlank()) {
            val reminder = Reminder(etAddReminder.text.toString())
            val resultIntent = Intent()
            resultIntent.putExtra(EXTRA_REMINDER, reminder)
            setResult(Activity.RESULT_OK, resultIntent)
            finish()
            Toast.makeText(this,"The reminder is added "
                , Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this,"The reminder cannot be empty"
                , Toast.LENGTH_SHORT).show()


        }


}}
