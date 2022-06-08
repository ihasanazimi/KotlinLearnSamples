import kotlin.properties.Delegates

/**
 *
 * Delegated Property : Lazy ,
 *
 * */


class SampleUser{

    val name : String by lazy {
        // code
        "Ali"
    }

    // tip : ma mitunim vase dasteresi sari tar be variable lazy az thread joda estefade konim - sample :
    // intori accessibility saree tari dashte mishim..
    // Type :   NONE  -  PUBLICATION  -  SYNCHRONIZED

    val name2 : String by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        "Ali"
    }
}




/** function Delegation */
//class DD {
//    var newNameee: String = " Ali"
//    var oldNameee: String by this::newNameee
//}




fun main() {



    val user = SampleUser() // in class init shode ama bayad bedunid k hanooz name init nashode
    // lazy fagat yek bar call mishe..va vagti call shod init mishe va meqdaresh hamun baqi mimune..

    println(user.name)
    // inja name init mishe va Ali ro barmighardune
    // nokte inke comment code fagat ye bar ejra mishe be in dalil k fagat lazy ye bar init mishe






    /** Observable Delegation */
    // inja migim k bia brgu chi be chi taqir karde...
    val nname: String by Delegates.observable("<no name>") { property, oldValue, newValue ->
        println("$oldValue  ->  $newValue")
        newValue.length > 1


        // age inja name ro init konim - meqdar az no name be masalan hasan taqir mikone..
        // dafe badi age init shod masalan be ali - change mishe be ali
        /* age bekhaym veto konim k age in taqir length<1 bud change nakon... kafiye shat bala ro dakhel block bezarim*/
    }


}
