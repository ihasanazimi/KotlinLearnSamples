/**Singleton Design Pattern */
// in design pattern baes mishe k dar tool project fagat va fagat yek object stable bemoone va hame ja az haamin
// yek object fagat estefade mishe...


    class AppDataBase{

    companion object{
        private var appDataBase : AppDataBase ? = null
    }

    fun getAppDataBase() :AppDataBase{
        if (appDataBase == null){
            appDataBase = AppDataBase()
        }
        return appDataBase as AppDataBase
    }
}