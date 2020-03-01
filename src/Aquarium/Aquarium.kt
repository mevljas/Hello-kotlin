package Aquarium

//this is  the default constructor
class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40){

    //we dont need to do this, because we can specifiy default values on top.
//    var width: Int = width
//    var height: Int = heigh
//    var length: Int = length


    //overriding getter and setter
    var  volume : Int
        get() =  width * height * length / 1000
        // we also could set it to private
        set(value) {  height = (value * 1000) / (width * length)}

    var water = volume * 0.9

    //this is a custom cosntructor, which calls the default constructor.
    constructor(numberOfFish: Int): this(){
        val water: Int = numberOfFish * 2000 //cm3
        val tank: Double = water + water * 0.1
        height = ( tank / (length * width)).toInt()
    }

}