package model
import model.Entregable

class Serie :Entregable  {

    var titulo: String = " "
    var numTempordas: Int = 3
    var entregado: Boolean = false
    var genero: String = " "
    var creador: String = " "

    constructor()

    constructor(tit: String, numTem: Int, gen: String, crea: String){
        this.titulo = tit
        this.numTempordas = numTem
        this.genero = gen
        this.creador = crea
    }

    constructor(tit: String, crea: String) {
        this.titulo = tit
        this.creador = crea
    }

    override fun entregar() {
        this.entregado=true
    }

    override fun devolver() {
        this.entregado=false
    }

    override fun isEntregado():Boolean{
        return this.entregado
    }
}