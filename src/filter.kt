//You can do the following filter exercise in REPL.
val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )

//Sorting curries by string length
//spices.filter { it.contains("curry") }.sortedBy { it.length }

//Filtering by those that start with 'c' and end with 'e'
//spices.filter{it.startsWith('c')}.filter{it.endsWith('e')}

//OR
//spices.filter { {it.startsWith('c') && it.endsWith('e') }

//Filtering the first 3 items by 'c'
//spices.take(3).filter{it.startsWith('c')}