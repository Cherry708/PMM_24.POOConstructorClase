package com.example.pmm_24pooconstructorclase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Problema2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema2)

        val resultTextView = findViewById<TextView>(R.id.resultTextView)

        val triangulo = Triangulo()

        val result = "Lado mayor: ${triangulo.ladoMayor()}, es equilatero: ${triangulo.esEquilatero()}"
        resultTextView.text = result
    }
}