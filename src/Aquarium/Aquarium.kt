package Aquarium

class Aquarium{

    var width: Int = 20
    var height: Int = 40
    var length: Int = 100

    //overriding getter
    val  volume : Int
        get(){
            return width * height * length / 1000
        }

    //one-liner declaration
//    fun volume() = width * height * length / 1000
}