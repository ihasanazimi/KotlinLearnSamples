/**
 * Enum (Enumeration) classes means : (Enumeration be Maniye Shomaresh mibashad)
 * har vaqt k ma be onvan mesal niyazz be chnd noe shart dashtim k masalan true ya false javan nabood
 * bayad az enum ha estefade konim..
 * masalan baraye check kardan online budan net karbar 3 state vujud dare..
 * ONLINE - OFFLINE - NO_INTERNET
 * pas mitunim ba in 3 ta state vaziyat network user ro fix konim..
 * */


enum class NetworkState{
    ONLINE , OFFLINE , NO_INTERNET
}


// masalan inka milhaym moshakhas konim tooye kudum ruz az hafte hastim..
enum class WeekDay{
SAT , SUN , MON , TRU , WES , TUE , FRI
}




/** Enum Class  VS  Sealed Class */
enum class AgePeriod1{
    Kid , Young , Old
}



/** SEALED Class Sample..
 * Sealed class ha ye jur class abstract hastand k mishe be onvan object azashun estefade kard va noskhe advanced enum haa hastand */
sealed class SealedAge(){
    constructor(ageRange : Int) : this()
    class KID(a: Int) : SealedAge(a) { /* your code */ }
    object YOUNG : SealedAge()
    object OLD : SealedAge()
}






fun main() {


    // enum sample
    val networkState = NetworkState.ONLINE // set default state
    when(networkState) {

        NetworkState.ONLINE -> {
            println("USER IS ONLINE")
        }


        NetworkState.OFFLINE ->{
            println("USER IS OFFLINE")
        }


        NetworkState.NO_INTERNET -> {
            println("USER NO ACCESS TO INTERNET")
        }
    }




    val age : SealedAge = SealedAge.YOUNG
    when(age) {

        SealedAge.KID(6) -> {
            println("KID")
        }


        SealedAge.OLD  ->{
            println("OLD")
        }


        SealedAge.YOUNG  -> {
            println("YOUNG")
        }
    }

}

