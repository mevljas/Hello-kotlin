package Aquarium

interface AquariumAction {
    fun eat()
    fun jump()
    fun clean()
    fun catchFish()
    fun swim(){
        println("swim")
    }
}

interface FishAction {
    fun eat()
}

abstract class AquariumFish: FishAction {
    abstract val color: String
    override fun eat() = print("yum")
}

// composition
fun main(args: Array<String>) {
    delegate()
}


fun delegate() {
    val pleco = Plecostomus()
    println("Fish has color ${pleco.color}")
    pleco.eat()
}

interface  FishAction {
    fun eat()
}

interface FishColor {
    val color: String
}

/*class Plecostomus: FishAction, FishColor {
    override  fun eat(){
        println("eat algae")
    }

    override  val color: String
        get() = "gold"
}*/

// declares a class and make one instance of it
object GoldColor: FishColor {
    override  val color = "gold"
}


// Actually calls GoldColor
/*class Plecostomus: FishAction, FishColor by GoldColor {
    override  fun eat(){
        println("eat algae")
    }

    override  val color: String
        get() = "gold"
}*/


object RedColor: FishColor {

    override val color = "red"
}


class PrintingFishAction(val food: String): FishAction {
    override fun eat() {
        println(food)
    }
}


class Plecostomus( fishColor: FishColor = GoldColor):
    FishAction by PrintingFishAction("a lot of algae"), FishColor by fishColor

