package Aquarium

fun main ( Args: Array<String>) {
    buildAquarium()
}
fun buildAquarium(){
    val myAquarium = Aquarium()

    //Kotlin automatically creates getters.
    println("Length: ${myAquarium.length} " +
    "Width: ${myAquarium.width} " +
    "Height: ${myAquarium.height}")

    myAquarium.height = 80

    println("Height: ${myAquarium.height} cm")
}