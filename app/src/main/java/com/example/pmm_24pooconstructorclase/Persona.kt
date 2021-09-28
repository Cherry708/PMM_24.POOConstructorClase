package com.example.pmm_24pooconstructorclase

class Persona(var nombre: String, var edad: Int) {

    //Métodos
    fun getDetails():String{
        return "${this.nombre}, ${this.edad}"
    }

    fun isOverAge(): Boolean{
        return this.edad!! >= 18
    }
}