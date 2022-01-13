package com.hugorafaelcosta.agendabootcamp

import android.content.Intent
import android.os.Bundle
import android.provider.CalendarContract
import android.provider.CalendarContract.CONTENT_URI
import android.provider.ContactsContract.CommonDataKinds.Organization.TITLE
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.provider.CalendarContract.Events.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSetEvent = findViewById(R.id.set_event) as Button
        btnSetEvent.setOnClickListener {

            val intent = Intent(Intent.ACTION_INSERT)
                .setData(CONTENT_URI)
                .putExtra(TITLE, "Bpptcamp everis")
                .putExtra(EVENT_LOCATION, "on line")
                .putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, System.currentTimeMillis())
                .putExtra(CalendarContract.EXTRA_EVENT_END_TIME,System.currentTimeMillis() + (60*60*1000))

            startActivity(intent)
        }
    }
}