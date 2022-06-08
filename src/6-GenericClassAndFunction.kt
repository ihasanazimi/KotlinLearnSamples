
/**
 * Generic Classes And Generic Functions :
 * means : any type class or function input..
 * */



// Generic class
class Friend<T>(typeName : T){
    init {
        println(typeName.toString())
    }
}


// Generic Function
fun <T> printSample(sampleArray : Array<T>){
    sampleArray.forEach{
        println(it.toString())
    }
}



fun main() {

    // sample for generic class
    Friend("Example Type")
    Friend(25)
    Friend(true)


    println("----------------------------------")


    // sample for generic functions
    val arr = arrayOf("Ehsan" , 2 , true , 2.245F , 22L)
    printSample(arr)
}