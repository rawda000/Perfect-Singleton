package Singleton_eager_instantiation;

/**
 * Not Thread Safe
 */
public final class CaptainSingleton {
    private static CaptainSingleton instance = new CaptainSingleton();

    private CaptainSingleton() {
        System.out.println("A new Captain has been created");
    }

    public static CaptainSingleton getInstance() {
        return instance;
    }

    public static void dummyMethod() {
        System.out.println("Inside dummy method");
    }
}