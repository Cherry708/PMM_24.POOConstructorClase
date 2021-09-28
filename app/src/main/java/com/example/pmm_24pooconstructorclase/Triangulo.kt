package com.example.pmm_24pooconstructorclase

class Triangulo(var lado0: Double, var lado1: Double, var lado2: Double) {

    //Constructor secundario
    constructor(): this(0.0,0.0,0.0){}
    //Métodos
    fun ladoMayor():Double{
        if (this.lado0 > this.lado1 && this.lado0 > this.lado2)
            return this.lado0
        else if(this.lado1 > this.lado2)
            return this.lado1
        else
            return this.lado2
    }

    fun esEquilatero():Boolean{
        return lado0 == lado1 && lado1 == lado2
    }

}