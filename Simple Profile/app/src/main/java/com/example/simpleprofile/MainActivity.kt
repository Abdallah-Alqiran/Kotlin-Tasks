package com.example.simpleprofile

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var linkedInImage : ImageView
    private lateinit var githubImage : ImageView
    private lateinit var codeforcesImage : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        linkedInImage = findViewById(R.id.linked_in)
        githubImage = findViewById(R.id.git_hub)
        codeforcesImage = findViewById(R.id.codeforces)

        linkedInImage.setOnClickListener {
            Toast.makeText(this, "Opening linked in...", Toast.LENGTH_SHORT).show()
            openWebsite("https://www.linkedin.com/in/abdallah-alqiran/")
        }

        githubImage.setOnClickListener {
            Toast.makeText(this, "Opening github...", Toast.LENGTH_SHORT).show()
            openWebsite("https://github.com/Abdallah-Alqiran")
        }

        codeforcesImage.setOnClickListener {
            Toast.makeText(this, "Opening codeforces...", Toast.LENGTH_SHORT).show()
            openWebsite("https://codeforces.com/profile/Abdallah_Alqiran")
        }

    }

    // from chat-gpt
    private fun openWebsite(url:String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }

}