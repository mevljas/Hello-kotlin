package Aquarium

// Abstract class
abstract class AquariumFish {
    abstract val color: String
}

//Subclases


class Shark: AquariumFish(), FishAction{
    override val color = "Grey"

    override fun eat() {
        println("hunt and eat fish")
    }
}


class Plecostomus: AquariumFish(), FishAction {
    override val color = "gold"

    override fun eat() {
        println("much on algae")
    }
}

interface FishAction {
    fun eat()
}