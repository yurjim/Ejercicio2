package model

class Videojuego: Entregable{

    var titulo: String = " "
    var horasEstimadas: Int = 10
    var entregado: Boolean = false
    var genero: String = " "
    var compannia: String = " "

    constructor()

    constructor(tit: String, horasE: Int, gen: String, compa: String){
        this.titulo = tit
        this.horasEstimadas = horasE
        this.genero = gen
        this.compannia = compa
    }

    constructor(tit: String, horasE: Int){
        this.titulo = tit
        this.horasEstimadas = horasE
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