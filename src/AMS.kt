import java.util.*

fun main(args: Array<String>) {
    println("Hello, ${args[0]}")
    feedTheFish()

}


//put arguments without defaults first
fun  shouldChangeWater (
    day: String,
    temperature: Int = 22,
    dirty: Int = 20) : Boolean{
    return true

}

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


