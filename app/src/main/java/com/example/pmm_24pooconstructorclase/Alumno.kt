package com.example.pmm_24pooconstructorclase

class Alumno(var nombre: String, var nota: Double) {
    //Atributos

    //Constructor
    constructor(): this("", 0.0){}
    //Métodos
    fun getDetails():String{
        return "Nombre: ${this.nombre}, Nota: ${this.nota}"
    }

    fun mostrarEstado():String{
        if (this.nota!! >= 5)
            return "Aprobado"
        else
            return "Suspendido"
    }

    override fun toString(): String {
        return "Alumno: '$nombre', nota: $nota"
    }
}