package Aquarium

//Object is a class with only one instance
object MobyDickWhale {

    val author = "Herman Melville"

    fun jump() {

    }
}

// One istance of every object
/*enum class Color(val rgb: Int) {
    RED( rgb: 0xFF0000),
    GREEN( rgb: 0x00FF00),
    BLUE( rgb: 0x0000FF)
}*/

// can be subclassed only inside a file in which it's declared
sealed class Seal

class SeaLion: Seal()
class Walrus: Seal()

/*
fun matchSeal(seal: seal): String {

    return when(seal) {
        is Walrus -> "walrus"
        is SeaLion -> "sea lion"
    }
}*/
