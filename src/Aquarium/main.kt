package Aquarium

import SimpleSpice

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

//    Under the hood, this calls the get function.
    println("Volume: ${myAquarium.volume} liters")

    val simpleSpice = SimpleSpice()
    println("${simpleSpice.name} ${simpleSpice.heat}")

    val smallAquarium = Aquarium(length = 20, width = 15, height = 30)
    println("Small Aquarium: ${smallAquarium.volume} liters")

    val myAquarium2 = Aquarium(numberOfFish = 9)

    println("Small Aquarium 2: ${myAquarium2.volume} liters with "+
            "length ${myAquarium2.length} " +
            "width ${myAquarium2.width} " +
            "height ${myAquarium2.height} " )
}