
/**
 * INNER Class
 *
 * inner class ha :
 * biya ba mesal bet tozih bedam...
 * inner class ha be class balayi khodesh yani be variable hash kamelan accessibility darand...ama nested class accessibility nadarand.
 *
 * */

class Outer {

    val outerClassVariable = "outerClassVariable"

    inner class Inner(){
        var innerClassVariable = "innerClassVariable"
        fun printVariable(){
            println(innerClassVariable)
        }
    }

}



class Outer2 {

    val outerClassVariable = "outerClassVariable"

     class Nested(){
        var innerClassVariable = "innerClassVariable"
        fun printVariable(){
            println(innerClassVariable)
        }
    }

}





// sample of class
class myTestCls(){

    init {
        println("test1")
    }

    init {
        println("test1")
    }


    init {
        println("test1")
    }
    // ye class mitune chand ta init block dashte bashe..


    // intori ham mishe constructor besazim..
    constructor(n : String) : this()
    constructor(n : Int) : this()

    // hame class ha az class any extend karde an..
}




// how to check classes state?
class TestClass{}
val t = TestClass::class
fun f(){
    if (t.isAbstract){}
    if (t.isOpen){}
    if (t.isCompanion){}
    if (t.isData){}
    if (t.isSealed){}
    /* get class name -> */ val s = t.simpleName /* ,.....*/
}



/** Data Class :
 * bayad qabl az key word class az key word data estefade beshe..
 * bayad hatman ye property dashte bashan..
 * nemitunan az type sealed class bashan
 * nemitunan inner bashan
 * nemitunan open bashan
 * mitunan interface impl konan..
 * */

// how to check 2 object of class?
// injast k mifahmim karbord data class chiye

/*data */data class User(val id : Int, val name : String)
fun checkTwoObject(){
    val u1 = User(1,"hasnazimi")
    val u2 = User(1,"hasanazimi")

    if (u1.equals(u2)){
        println("equal")
    }else println("not equal")

    // khob qatAn ina ba ham barabar hastan ama compiler nemitune tashkhis bede
    // dar nahayat bayad ye kari konim befahme..
    // pass data class dorost mikonim
    // posht key word class . data mizarim va moshkel halle.
}

/** data class ha mitunan copy beshan va masalan ye chizaei ro change konim..
 * sample :
 */

val user1 = User(1,"hasan")
val user2 = user1.copy(id = 76,name = "ali") // masalan inja id va name ro taqir midim - mirizim too user2




/** Destructing Declarations */
// yani shekastan ye object be variable -> masalan :
data class Hsn(var name : String , var family : String)
fun checkkkk(){
    val h = Hsn("hasan" , "azimi")
//    val sss (name) = h
}



fun main() {

    val outer = Outer()

    println(outer.outerClassVariable)
    println(outer.Inner().innerClassVariable)
    outer.Inner().printVariable()


    // nested class  // accessibility mesle static
    Outer2.Nested()

}