package model
import model.Serie

interface Entregable {

    fun entregar(){}
    fun devolver(){}
    fun isEntregado():Boolean{
        return false
    }
}