package Aquarium

class Fish(val friendly: Boolean = true, volumeNeeded: Int){
    val size: Int

    //it is bets to just use default constructor.
    //you cna use init box liek you'd use a constructor in Java.
    init {
        println("first init block")
    }

    //secondary constructor
    //if you have a secondary cosntructor, you must call the main constructor.
    constructor() : this(true, 9){
        println("running secondary constructor")
    }
    init {
        if (friendly){
            size = volumeNeeded
        }
        else{
            size = volumeNeeded * 2
        }
    }

    //init block always run before any secondary cosntructors

    init {
        println("constructed fish of size ${volumeNeeded} final size ${this.size}")
    }

    init {
        println("last init block")
    }
}

//instead of mkain a secondary constructor, you cna make a  helper method.
fun makeDefaultFish() = Fish(true, 50)

fun fishExample(){
    val fish = Fish(true, 20)
    println("Is the fish friendly? ${fish.friendly}. It need volume ${fish.size}")
}