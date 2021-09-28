package com.example.pmm_24pooconstructorclase

class Plano(var puntoX:Int, var puntoY:Int) {

    fun getCuadrante():String{
        if (this.puntoX > 0 && this.puntoY > 0)
            return "Primer cuadrante"
        else if (this.puntoX < 0 && this.puntoY > 0)
            return "Segundo cuadrante"
        else if (this.puntoX < 0 && this.puntoY < 0)
            return "Tercer cuadrante"
        else if (this.puntoX > 0 && this.puntoY < 0)
            return "Cuarto cuadrante"
        else
            return "El punto se encuentra en un eje"
    }

}