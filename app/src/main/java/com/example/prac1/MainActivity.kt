package com.example.prac1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    //onCreate = main()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Create UI
        //R = resources
        setContentView(R.layout.activity_main)
        //TODO work
        val buttonHelloWorld : Button = findViewById(R.id.buttonHelloWorld)
        buttonHelloWorld.setOnClickListener { showMessage() }
        val buttonReset : Button = findViewById(R.id.reset)
        buttonReset.setOnClickListener { resetMessage() }

    }

    private fun showMessage() {

        val textViewMessage : TextView= findViewById(R.id.textViewMessage);
        textViewMessage.setText("hello CMF")

    }

    private fun resetMessage() {

        val textViewMessage : TextView= findViewById(R.id.textViewMessage);
        textViewMessage.setText(getString(R.string.hello))

    }
}
