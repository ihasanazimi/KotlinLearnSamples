import java.awt.Color

/** Inheriance || Verasat :

 * yani in k agar ye seri attribute dakhel ye class bashe va agar ye class dg bekhad inha ro be Ers bebare
   pas daqiqan hamoon atrr haro az class pedar be ers mibare pas bayad tooye class farzand in atrr ha override beshe
   hatta class farzand mitune atrr haro yekam ezafe bar sazman taqir bede


 * class A : B {}
   class A -> Farzand hast..
   open class B -> Valed hast..
    Nokte : (class B bayad open bashe ta extend beshe / hamintor function ha agar qarar bashe extend beshe pas bayad open baashe)

 * */


open class Car(open var hoursPower : Int){

    var carColor = Color.RED
    open var carName = ""
    open fun carSpeed(){
        println("this car is speed 120KM/H")
    }
    fun carHorsePower(){
        println("this car is Horse Power 120KM/H")
    }
}


class Benz(override var hoursPower: Int) : Car(hoursPower){

    override var carName: String
        get() = super.carName
        set(value) {}


    override fun carSpeed() {
        super.carSpeed() //  in be block code valed dare eshare mikone..k ejra mishe..
        println("taqir az class farzand")
    }
}

fun main() {
    val benz = Benz(150)
    benz.carName = "sls 500"
    benz.carHorsePower()
    benz.carSpeed()
}