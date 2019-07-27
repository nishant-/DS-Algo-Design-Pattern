package patterns.creational;

public class SingletonDoubleCheckedLocking {

    private SingletonDoubleCheckedLocking() {

    }

    private static volatile SingletonDoubleCheckedLocking instance;

    public static  SingletonDoubleCheckedLocking getInstance() {
        if(instance == null) {
            synchronized (SingletonDoubleCheckedLocking.class) {
                if (instance == null) {
                    instance = new SingletonDoubleCheckedLocking();
                }
            }
        }
        return instance;
    }
}
