package edu.temple.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        // TODO Step 3: Extract transferred value and use for lyricsDisplayView text size
        val textSize = intent.getIntExtra("textSize", 0)
        with (findViewById<TextView>(R.id.lyricsDisplayTextView)) {
            val lyricsDisplayView = findViewById<TextView>(R.id.lyricsDisplayTextView)
            lyricsDisplayView.textSize = textSize.toFloat()
        }


    }
}
