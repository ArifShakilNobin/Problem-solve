public class Singleton {
    static Singleton instance;

    private Singleton() {
        System.out.println("Singleton instance created");
    }

    public static synchronized Singleton getInstance() {

        //TODO: check if instance is null use for lazy initialization
//        if (instance == null) {
//            instance = new Singleton();
//        }

        //TODO: check if instance is null use for double check locking initialization
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }

            instance = new Singleton();
        }
        return instance;
    }

    public void getMessage() {
        System.out.println("singleton class");
    }


}
