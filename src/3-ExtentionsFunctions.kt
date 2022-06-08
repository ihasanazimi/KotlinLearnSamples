
/** EXTENSIONS FUNCTIONS :
 * inja masaln mikhaym vase in k az ye code chand ja estefade konim
 * miyaym code ro tazriq mikonim be ye class va un ro hame ja estefade mikonim..*/

// sample : inja ye code be class string ezade mikonim
fun String.removeFirstAndLastCharacter() : String {
    return this.substring(1 , this.length -1)
}

fun Float.masahatDayere(): Float {
    return this*this*3.14F
}

fun Int.tavan2() : Int {
    return this*this
}


fun main() {

    val sampleText = "hasanazimi"

    println(sampleText.removeFirstAndLastCharacter())
    println(2.2F.masahatDayere())
    println(8.tavan2())
}