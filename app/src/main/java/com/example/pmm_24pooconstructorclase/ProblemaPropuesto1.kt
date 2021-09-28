package com.example.pmm_24pooconstructorclase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ProblemaPropuesto1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema_propuesto1)

        val tvResult = findViewById<TextView>(R.id.tvResult40)

        val alumno = Alumno("Álex", 8.6)

        val result = alumno.toString()
        tvResult.text = result
    }
}