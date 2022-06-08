

/**
 * INTERFACE :
 * interface yani ye qrar dad.. yani inke masalan ye brand az ye gushi bayad az qavanin class phone peyravi kone
 * pas samsung bayad az phone extend kone k masalan ye gushi bayad send sms dashte bashe.. call .. microphone.. speaker..
 *
 *
 * Description :
 * interface ha fagat mitunan function haye abstract dashte bashand va nemitavanand variable dashte bashand
 * - fagat mitunan ye sabet(final value) dashte bashand.
 * interface in verasat chand gane hemayat mikone. -> interface E extends C, D {}
 * be har tedad interface digar k bekhad mitune extend beghire..
 *
 * */


interface Phone{
    /** QararDad */
    fun getGps()
    fun contacts()
    fun sendSMS()
    fun calling()
    fun speaker()
    fun turnOnMicrodot()
}


class Sumsung : Phone{
    override fun getGps() {
        println("user Location")
    }

    override fun contacts() {
        println("show contacts")
    }

    override fun sendSMS() {
        println("send Sms")
    }

    override fun calling() {
        println("calling")
    }

    override fun speaker() {
        println("speaker")    }

    override fun turnOnMicrodot() {
        println("turn on microphone")    }
}




/** Abstract Class :
 * class haei hastand k nemishe azashun object ghereft!
 * class haye abstract mitune function haye abstract va Non Abstract dashte bashad..
 * class haye abstract verasat haye chand gane ra suport nemikonad
 * mitavand variable haye final va non final va .. dashte bashad ama interface nemitavanad.
 * class haye abstract mitavand be interface inplement shavad
 * class abstract mitavand ye class digar abstract digar ra extend konad. (fagat ye class)
 *
 *
 * */


abstract class Animal {

    /** vagti estefade mishe k bekhaym in attr ro khodemun fill konim! */
    abstract val animalName : String

    /** vagti az in estefaade mikonim k bekhaym kolaan block code ro khodemun tarif konim */
    abstract fun eat()

    /** vagti az in estefade mikonim k mikhaym alave bar kar khodemun ye block code k inja behesh midim ham anjam bede */
    open fun sleep(){
        println("animals needed sleep")
    }
}

class Hours : Animal() {

    override val animalName: String
        get() = "اسب"


    // kelasi k chon key word abstract dare bayad pas override beshe
    override fun eat() {

    }


    // kelassi k open hast va be ekhtiyar khodete k override beshe ya na
    override fun sleep() {
        super.sleep()
        println("in ye test mibashad...")
    }


}


fun main() {
    val hours = Hours()
    hours.eat()
    hours.sleep()
}