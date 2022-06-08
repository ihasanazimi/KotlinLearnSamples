
/** Coroutines */
// coroutines ye thread sabok vazn hast...k mitune task haro hamzaman ya qeyr hamzaman done kone..
// suspend mishe function haei k toosh az corotines estefade mishe..va har function suspendi eee dakhel ye suspend function ejra mishe..
// global scope yani az aval ta akhat application damane hayat corotines ro moshakhas mikone..
// sequentional hast yani in k task ha be tartib anjam mishe..

/* KEY WORDS */ /*
- Global Scope -> Coroutines Scopes - ex : viewLifeCycle.launchWhenCreated{} , ...
- Suspend
- Dispatcher.MAIN/DEFAULT/IO (coroutines context) ->
- RunBlocking{} -> baraye unit testing estefade mishe...
- Job -> result of coroutines scopes
- Async
- CoroutinesExceptionHandler
- Yield()
- isActive

coroutines context : yani sefati k inja moshkhas mikonim ba che type thread qarare function surat beghire..
  mishe vase corotinesContext name ham set kard
  dar kol darbare corotines ye seri tozihat mide..

*/

suspend fun main() {

    // sample :
    /*
    hame ina rooye yek single thread joda anjam mishe
    GlobalScope.launch(Dispatcher.IO){
        val post = ApiService.getPost()
        AppDataBase.savePost(post)
        updateUi(post)
    }
    */



    // tip : lazem be zek hast k globalScope yek object Job barmighardune...
    /** Job */
    /* hala ba Job chikar mitunim konim ?   mitunim job ro cancel konim..
    ya inke sabr konim hame task ha anjam beshe k ba job.join() mishe inkaro kard k bayad begham k join() yek suspend fun hast ke
    bayad dakhel ye suspend fun call beshe.. */


    /** Run Blocking */
    // mamoolan runblocking vagti estefade mishe k bekhaym chand ta job ro be ham merge konim..

    /*
    runBlocking(job + Dispatcher.MAIN){

    }
    */



    /** async  / await */ // sample :

    /*
    suspend fun tst(){
        hame ina rooye yek single thread joda anjam mishe

        GlobalScope.launch(Dispatcher.IO){
            val post = async { ApiService.getPost() }
            AppDataBase.savePost( post.await() )
            updateUi( post.await() )
        } */


        /* async await karesh ine k request haro hamzaman ersal mikone ba thread haye mokhatalef
        dar nahayat vagti har 2 request ready shod va responce ha dar dastres budand
        mide bede saveInDB va update ui
        in 2 function montazer mimoonan dar vage..
    }
*/



    /** Exception Handling */
    /* mishe az try/catch ham estefade kard va code ro qarar bedim dakhel block try */
    /* ama mishe az Coroutines exception handling */

    /*

    // age exception eee rokh bede in block code call mishe - age ex rokh bede hame child haye coroutines cancel mishe...
    val coroutinesExceptionHandling = CoroutinesExceptionHandler { corotineContext , throwable ->
        println(throwable.message)
    }

       GlobalScope.launch( Dispatcher.IO  +  coroutinesExceptionHandling  ){
           val post = async { ApiService.getPost() }
           AppDataBase.savePost( post.await() )
           updateUi( post.await() )
       }

           */


    /** Yield() OR isActive */
    /* age bekhaym corotines ro cancel konim va block code ejra nashe..bayad be block code ham befahmoonim k aqaaa job cancel shode
       pas baraye check kardan in k coroutines cancel shode ya na bayad az YIELD() ya isActive estefade kard
    */




    /**
     * Baqiye Corotines dg Androidi mishe va bayad tooye Android Donbalesh koni...

     * Example :
     - ViewModel Scope ...
     - LiveDataScope ...
     * */
}

