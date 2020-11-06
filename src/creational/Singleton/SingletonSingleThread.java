package creational.Singleton;

public final class SingletonSingleThread {
    private static SingletonSingleThread instance;
    public String value;

    private SingletonSingleThread(String value) {
        // The following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
          ex.printStackTrace();
        }
        this.value = value;
    }

    public static SingletonSingleThread getInstance(String value) {
        if (instance == null) {
            return new SingletonSingleThread(value);
        } else {
            return instance;
        }
    }
}
