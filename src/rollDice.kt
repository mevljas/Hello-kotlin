import java.util.*

//val rollDice = { Random().nextInt(12) + 1}
val rollDice = { sides: Int ->
    Random().nextInt(sides) + 1
}
val rollDice0 = { sides: Int ->
    if (sides == 0) 0
    else Random().nextInt(sides) + 1
}
val rollDice2: (Int) -> Int = { sides ->
    if (sides == 0) 0
    else Random().nextInt(sides) + 1
}