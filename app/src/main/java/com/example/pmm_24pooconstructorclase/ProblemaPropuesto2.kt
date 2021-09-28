package com.example.pmm_24pooconstructorclase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ProblemaPropuesto2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema_propuesto2)

        val tvResult = findViewById<TextView>(R.id.tvResult50)
        val plano = Plano(4,-2)
        tvResult.text = plano.getCuadrante()
    }
}