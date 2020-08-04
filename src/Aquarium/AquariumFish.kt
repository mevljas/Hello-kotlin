package Aquarium

// Abstract class
abstract class AquariumFish {
    abstract val color: String
}

//Subclases


class Shark: AquariumFish(){
    override val color = "Grey"
}


class Plecostomus: AquariumFish() {
    override val color = "gold"
}