import model.Serie
import model.Videojuego

fun main(args: Array<String>) {

    var series = arrayOf<Serie>()
    var videjuegos = arrayOf<Videojuego>()

    val serie1 = Serie("The Crown",5,"Biografia","Peter Morgan")
    val serie2= Serie("Alexa y Katie",4,"Enfermedad","Heather Wordham")
    val serie3= Serie("Euphoria",4,"Drogas","Sam Levinson")
    val serie4= Serie("Riverdale",6,"Ciencia Ficción","Roberto Aguirre-Sacasa")
    val serie5= Serie("Juego del Calamar",1,"Ciencia Ficción","Hwang Dong-hyuk")

    val video1 = Videojuego("Mario Bros",8,"Accion","Nintendo EAD")
    val video2 = Videojuego("Fifa",10,"Deportes","FIFA")
    val video3 = Videojuego("Kirby",6,"Ficción","Kirby Company")
    val video4 = Videojuego("Pokemón",60,"RPG","The Pokémon Company")
    val video5 = Videojuego("Just Dance",2,"Todo","Wii")


    series = series.plus(serie1)
    series = series.plus(serie2)
    series = series.plus(serie3)
    series = series.plus(serie4)
    series = series.plus(serie5)


    videjuegos = videjuegos.plus(video1)
    videjuegos = videjuegos.plus(video2)
    videjuegos = videjuegos.plus(video3)
    videjuegos = videjuegos.plus(video4)
    videjuegos = videjuegos.plus(video5)


    series[1].entregar()
    series[4].entregar()

    videjuegos[2].entregar()
    videjuegos[3].entregar()


    var cantSeries:Int=0
    var cantVideojuegos:Int=0


    for (i in series.indices){
        if(series[i].entregado==true){
            cantSeries++
        }
    }
    println("Cantidad de series entregadas:" + cantSeries)


    for (i in videjuegos.indices){
        if(videjuegos[i].entregado==true){
            cantVideojuegos++
        }
    }
    println("Cantidad de videojuegos entregados:" + cantVideojuegos)


    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}