package com.example.test4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var userInput: EditText? = null
    private var button: Button? = null
    private var textView: TextView? = null
    private var numTimesClicked = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userInput = findViewById<EditText>(R.id.editText2)
        button = findViewById<Button>(R.id.bottom)
        textView = findViewById<TextView>(R.id.textView2)

        button?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                numTimesClicked += 1
                textView?.append("\nThe button get tapped $numTimesClicked time")

            }
        })

    }
}
