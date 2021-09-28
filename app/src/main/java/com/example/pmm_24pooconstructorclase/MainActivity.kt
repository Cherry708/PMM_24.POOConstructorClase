package com.example.pmm_24pooconstructorclase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvResult = findViewById<TextView>(R.id.tvResult10)

        val persona = Persona("Juan", 20)
        tvResult.text = persona.getDetails().plus( ", mayor de edad: ${persona.isOverAge()}")
    }
}