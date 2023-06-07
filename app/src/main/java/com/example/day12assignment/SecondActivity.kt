package com.example.day12assignment

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Phone
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val btnpage1 = findViewById<Button>(R.id.button1)
        val btnpage2 = findViewById<Button>(R.id.button2)
        val btnpage3 = findViewById<Button>(R.id.button3)
        val btnpage4 = findViewById<Button>(R.id.button4)
        val btnpage5 = findViewById<Button>(R.id.button5)
        val btnpage6 = findViewById<Button>(R.id.button6)

        btnpage1.setOnClickListener {
            //Open a New Activity
            intent = Intent(applicationContext,AndroidDevPage::class.java)
            startActivity(intent)
        }
        btnpage2.setOnClickListener {
            //Open a New Activity
            intent = Intent(applicationContext,Webdevpage::class.java)
            startActivity(intent)
        }
        btnpage3.setOnClickListener {
            //Open a New Activity
            intent = Intent(applicationContext,Ioswebpage::class.java)
            startActivity(intent)
        }
        btnpage4.setOnClickListener {
            //Open a New Activity
            intent = Intent(applicationContext,MLpage::class.java)
            startActivity(intent)
        }
        btnpage5.setOnClickListener {
            //Open a New Activity
            intent = Intent(applicationContext,AiPage::class.java)
            startActivity(intent)
        }
        btnpage6.setOnClickListener {
            //Open a New Activity
            intent = Intent(applicationContext,Blockchain::class.java)
            startActivity(intent)
        }
        val Contact= findViewById<Button>(R.id.btncontactme)

        Contact.setOnClickListener {
            val intent=Intent(Intent.ACTION_DIAL)
            val phoneNumber="8287255274"
            intent.setData(Uri.parse("tel:" + phoneNumber))
            startActivity(intent)
        }
    }
}