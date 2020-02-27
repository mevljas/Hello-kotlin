import java.util.*

fun main(args: Array<String>) {
    println("Hello, ${args[0]}")
    feedTheFish()

    var bubbles = 0
    while (bubbles < 30){
        bubbles ++
    }

    // you can't assign loops to a variable.

    //repeat (function from a standard Library)
    repeat(2) {
        println("A fish is swimming")
    }

}

fun getDirtySensorReading() = 20


//put arguments without defaults first
fun  shouldChangeWater (
    day: String,
    temperature: Int = 22,
    //we can use function's return value as a default value.
    //Dont use expensive functions. They are called at runTime.
    dirty: Int = getDirtySensorReading()) : Boolean{

    val isTooHot = temperature > 30
    val isDirty = dirty > 30
    val isSunday  = day == "sunday"
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true

        else -> false
    }

}

fun makeNewAquarium() = println("Builidng a new aquariium.....")

//example of a expensive function.
//any can hold any type of a object.
fun aquariumStatusReport( aquarium: Any = makeNewAquarium()){

}

//name of the fucntion gives a hint 2 the reader about the expected return value
//we can do that, when functions have a single expression in their body
fun isTooHot(temperature: Int) = temperature > 30

fun isDirty(dirty: Int) = dirty > 30

fun isSunday(day: String) = day == "sunday"

fun  shouldChangeWater2 (
    temperature: Int = 22,
    dirty: Int = 20,
    day: String){

}



fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")

    swim( 50, speed = "slow")

    shouldChangeWater(day, 20, 50)
    shouldChangeWater(day)
    shouldChangeWater(day, dirty = 50)
    shouldChangeWater2(day = "Monday")

    if (shouldChangeWater(day)){
        println("change the water today")
    }
}



fun randomDay() : String {
    val week = listOf ("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week [Random().nextInt(7)]  // 0 - 6
}

fun fishFood(day : String) : String {

    var food = "fasting"
    //return the last picked value.
    return when (day) {
        "Monday" ->  "flakes"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Sunday" -> "plankton"
        else -> "fasting"
    }
}

fun swim(time: Int, speed: String = "fast"){
    println("Swimming $speed")
}


