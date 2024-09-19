package com.example.lab2

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.EditText
import android.widget.Toast
import java.lang.Math.pow
import kotlin.math.pow

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


    val editTextNumber = findViewById<EditText>(R.id.editTextNumber)
    val editTextNumber2 = findViewById<EditText>(R.id.editTextNumber2)
    val buttonCalculate = findViewById<Button>(R.id.button)

    buttonCalculate.setOnClickListener{
        val x = editTextNumber.text.toString().toDoubleOrNull()
        val n = editTextNumber2.text.toString().toIntOrNull()
        var i: Int = 1
        var res:Double = 0.0

        if (x != null && n != null)
        {
            for (i in 1..n)
            {
                res = res + (x/(pow(4.0, i.toDouble())+pow(5.0,i.toDouble()+2.0)))
            }
            Toast.makeText(this, "Результат: $res", Toast.LENGTH_LONG).show()

        }
        else{

        }


        }
    }
}