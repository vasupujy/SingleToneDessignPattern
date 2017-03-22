# SingleToneDessignPattern
A singleton in Java is a class for which only one instance can be created. It provides a global point of access this instance. The singleton pattern describe how this can be archived.

Singletons are useful to provide a unique source of data or functionality to other Java Objects. For example you may use a singleton to access your data model from within your application or to define logger which the rest of the application can use.

in this example i have a use singleton design pattern in create only one instance

   private static final SingleTonPatWithConst instance = new SingleTonPatWithConst();

    //private constructor to avoid client applications to use constructor
    private SingleTonPatWithConst(){}

    public static SingleTonPatWithConst getInstance(){
        return instance;
    }
    
    I have use this pattern in dialog create in application and use this dialog as a instance and when create a dialog using instance and whole
    application have a only one instance.
    
    
    you can use this way
    
    /*
    SingleTonPatWithConst.getInstance()./*Your singleton method name*/;
    */
