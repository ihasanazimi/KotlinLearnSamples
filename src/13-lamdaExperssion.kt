/** lambda expersion :
 * yani un class tarif nashe ama ye experssion ro ijad mikone..
 *
 * be onvan mesal :


 * LAMBDA :
   view.setOnclickListener{  }

 * BEFORE :
   view.setonClickListener (object: View.OnclickListener{
   override fun onClick (v : View) {  }
   })


 dar kol lamda expersion dakhel {  }  shekl mighire...

 * */


// Sample :
fun tstFunction (){
    val arr = arrayListOf<String>()
    arr.forEach {

    }
    // in ye nemoone az lambda expression ast..
}


// in ham ye mesal az lambda k ye function neveshte shode k tarif nashode ama dare Int tarif mikone
var sum : (Int , Int) -> Int = {x : Int , y :Int -> x+y}



// SAMPLE :
val numbers = arrayOf(2, 4, 5, 6, 3, 1, 12)
val names = arrayOf("hasan" , "ali" , "mamad")
fun lambdaSamples() {

    //sample (first)
    numbers.first { it > 4 /* check ham mikone k index aval age az 4 bozorgtar bud return kone... */ }


    // sample (rediuc) acc + i yani jam hame index haa (acc yani in collection , i yani hamoon integeri k dare barmigharde)
    val ke = numbers.reduce { acc, i -> acc + i } // output : masalan 46


    // sample (fold)
    val je = numbers.fold(10){acc , i -> acc+i} // output : masalan 56
    // fargesh ba redius ine k ye megdar avaliye mighire...


    val le = numbers.fold("Element : ") {acc , i -> "${acc} , $i"} // output Element : 2,4,5,6,3,1,12


    // agar dar lamdaExpersion parametri bashe k azash estefade nashode mishe bejash _ gozasht.
    val ye = numbers.fold("Element : ") {_ , i -> "$i"}




    /** Anonymous function */
    val anonymousFun = fun (x : Int , y : Int) : Int {
        return x+y
    }
    // karbord :
//    val res = names.fold("ELEMENT :" , fun (x:String , y : String) : String {x+y})



}