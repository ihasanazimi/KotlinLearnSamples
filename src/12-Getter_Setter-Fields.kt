import java.lang.AssertionError

/**Getter And Setters
 * var haaaa setter darand ama val ha fagat getter darand..
  Mesal... : */

class KotlinTestCls{

    // Getter And Setter
    var name : String = "Hasan"
        get() = field.toLowerCase() // masalan mishe inja taqurat emal kard.
        set(value) { // setter vagti call mishe ke name taqir kone va chizi joz hasan set beshe
            field = value
        }

    // Getter
    val family : String = "Azimi"
        get() = field


    // Getter And Setter
    var age = 25
        get() = field
        private set(value) { // mishe behesh modifier ham set kard
            field = value
        }







    /** computed property
     * variable eee k mohasebat anjam mide va ye chi return mikone...
     * */
    val getFullName = "$name $family"
        get() = field






    /** backing property */
    var _table  : HashMap<String,String> ? = null // in ye backing properties hast
    var table = hashMapOf<String,String>()
        get() {
            if ( _table == null ){
                _table = hashMapOf()
            }
            return _table ?: throw AssertionError("set null null another thread")
        } // intori age table ro call konim hich vagt null nemide...




    /** Constants in Kotlin */
    // bayad ya top level bashan ya ozvi az Companion Object bashan..
    val fullName = "HasanAzimi" // top level
    companion object{
        const val FULL_NAME = "Hasan Azimi"
    }






}