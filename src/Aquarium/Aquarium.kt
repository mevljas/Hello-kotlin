package Aquarium

class Aquarium(var length: Int, var width: Int, var height: Int){

    //we dont need to do this, because we can specifiy default values on top.
//    var width: Int = width
//    var height: Int = heigh
//    var length: Int = length


    //overriding getter and setter
    var  volume : Int
        get() =  width * height * length / 1000
        // we also could set it to private
        set(value) {  height = (value * 1000) / (width * length)}





}