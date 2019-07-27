package patterns.creational;

public class SingletonDoubleCheckedLocking {

    private SingletonDoubleCheckedLocking() {

    }

    private static SingletonDoubleCheckedLocking instance;

    public static synchronized SingletonDoubleCheckedLocking getInstance() {
        if(instance == null) {
            instance = new SingletonDoubleCheckedLocking();
        }
        return instance;
    }
}
