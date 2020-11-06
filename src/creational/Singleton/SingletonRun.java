package creational.Singleton;

public class SingletonRun {
    public static void main(String[] args) {
        SingletonSingleThread st = SingletonSingleThread.getInstance("TEST");
        System.out.println(st.value);
    }
}