import java.io.IOException

/**
 *
 * Function Ha Be Ma komak mikonan k Code hamin ro Kholase Tar benivisim (Clean)
 * Be ma Komak mikonn k Masalan ma vazife ye tarif shode ei ro be function bedim va un task ro vase ma anjam bede
 * va dar akhar agar natije ei qarar bud barghardoone - return kone..
 * function ha mitunan type haye mokhtalefi dashte bashan

 - type function
 - inline function
 - extension function
 - scope function
 - top level variable OR top Level functions
 - high order function

 * */


// agar kharej az block function create konim behesh migan top level va hame ja estefade mishe va qavel royat hast
// masalan hame in function ha top levek hast...

// bazi vagta vase neveshtan ye expersion k fagat ye kari anjam mide va return type nadare mishe az = estefade kard.
fun sayHello(userName : String) = println("hellow $userName")


fun getFullName() : String{
    return "Hasan Azimi"
}


fun circleArea(r : Float) : Float{
    return r*r*3.14F
}


/** Generic Classes <T> */

fun <T>printAnyThing(arrayList: ArrayList<T>){
    arrayList.forEach{
        println(it.toString())
        "hi".wrapITryCatchBlock {
            // your code into try/Catch Block
        }
    }
}


// high order function sample by Extension function
// tip : code : () - in yani az function extend mikone va type un az noe function ast k mitune albate parameter ham dashte bashe
fun String.wrapITryCatchBlock(code: () -> Unit){
    try {
        code()
    }catch (e : IOException) {e.printStackTrace()}
}


/** scope functions  :

 * Function       Object reference              Return value       Is extension function
 * let                   it                    Lambda result       Yes
 * run                  this                   Lambda result       Yes
 * run                    -                    Lambda result       No: called without the context object
 * with                 this                   Lambda result       No: takes the context object as an argument.
 * apply                this                   Context Object      Yes
 * also                  it                    Context Object      Yes

  apply , also ->  return the context object.
  let, run, and with return the lambda result.

*/
/* samples ... */
const val fName = "Hasan"
fun at(){
    fName.let {  }
    fName.apply {  }
    fName.also {  }
    fName.run {  }
}




/** Anonymous function */
val anonymousFun = fun (x : Int , y : Int) : Int {
    return x+y
}



/** InLine functions */
/*inline function dav vage vazife ino dare k az object sazi alaki jelo ghiri kone
 rah halesh ine k beja inke code maro azash object beghire - barax har ba code maro miyad copy mikone tppye badane
 dar kole inline code maro copy paste mikone too method main...*/

inline fun printUserName (name : String){
    name.wrapITryCatchBlock {
        name.forEach {
            println(it)
        }
    }
}