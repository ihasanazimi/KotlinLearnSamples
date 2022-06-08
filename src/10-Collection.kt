/**
 this is collection ->
 arrayListOf<String>()
 arrayOf()
 List()
 Array(size=5)
 MutableList()
 */

fun main() {

    // samples.. (arrays):

    //varArg yani har chegad mikhay argument bede besh
    val nameList = arrayListOf<String>("a","b","c")
    val aveScores = arrayOf(20,"",85,100,98)
    val list : List<String> = arrayListOf()
    val arrayList : ArrayList<String> = arrayListOf()
    val mutableList : MutableList<String> = arrayListOf()


    /** HashMap - hashMapOf  -> key / value
     * insert -> put()
     * remove -> remove()
     */

    val hashMap = HashMap<String , String>() // this package is for Java
    hashMap.put("name" , "Hasan")
    hashMap.put("family" , "azimi")

    val hashMapOf = hashMapOf<String , String>() // this package is for Kotlin
    val hashMapOfOtherSample = hashMapOf<String , String>("name" to "Hasan" , "family" to "azimi" ) // this package is for Kotlin
    hashMapOf.put("name" , "Hasan")
    hashMapOf.put("family" , "azimi")

    val mapOf = mapOf<String , String>("name" to "Hasan" , "family" to "Azimi")
    val name = mapOf["Name"]
    println(name)


    hashMapOf.entries // -> return keys / values
    hashMapOf.values // -> return just values
    hashMapOf.keys // -> return just keys

    mapOf.values // collection of arrayListOf<T>
    mapOf.entries // -> return keys / values





}