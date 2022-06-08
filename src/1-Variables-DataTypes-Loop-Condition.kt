/** DataType :

 * Long
 * Integer
 * String
 * Boolean
 * Character
 * Double
 * Float
 * Number
 * Object
 * Any (every types..)


 * how to cat variable to needed data type ? ... x.toInt() || x.toLong() || x.toFloat() * */


/** Value OR variable :

 * val can not be resigned!
 * var can be resigned!

 * Sample :
 * val x : Float = 0.0F
 * var x : String = "Hsn"
 */


// samples...

var name = "Hasan" // string
var family = "Azimi" // string
var age = 25 // integer default
var birthDay = 23L //september -> Long
var pi_1 = 3.14 // default double
var pi_2 = 3.14F // float
var pi_3 :Double = 3.14
var charecter = 'H' // character
var boolean = true // Boolean (true / false)
val obj : String ?= null /** can be null object by ? char */
lateinit var obj2 : String /** can be null object by laetitia var */



/** CONDITIONS :
 IF
 WHEN bejaye Switch java
 IF - ELSE / ElSE - IF
 WHEN */

fun checkIsNotEmpty(text : String) : Boolean {
    if (text.isNotEmpty()) println(text)
    else println("text in not exist..")
    return text.isNotEmpty()
}

val ageSample = 25
fun check(){
    val t = when (ageSample){
        in 10..15 -> { println("10..15 hast") }
        !in 10..15 -> { println("10..15 nist") }
        24 -> { println("24")}
        else -> {}
    }
}

/** Loops :
  FOREACH
  FOR
  FOR in
  For range
  While
  Do-While
 */

fun testFunction(arr : Array<Boolean>){

    // foreach by  lambda expression
    arr.forEach {
        if (it) println(it.toString())
    }

    // return mikone ham index ro ham value ro..
    arr.forEachIndexed{index: Int, b: Boolean ->
        println("index->" + index + "is $b")
    }


    // break and continue keyWord for while and for
    for (i in arr) {
        if (i) continue
        else break
    }

    // for in
    for (i in arr){
        if (i) println(i.toString())
    }

    // for range (indices returned index)
    for (i in arr.indices){
        if (arr[i]) println(arr[i].toString())
    }


    // for range arr.siz taaaa 0 ro return mikone
    for (i in arr.size downTo 0) println(i)


    // for range 2
    for (i in 0..25){
        if (arr[i]) println(arr[i].toString())
    }


    // while
    while (true){
        println("is true")
    }

    // do-while
    do {
        println("do first..")
    } while (true)
}

fun main() {}


