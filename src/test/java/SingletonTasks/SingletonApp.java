package SingletonTasks;

public class SingletonApp {
    public static void main(String[] args) throws InterruptedException {

        final int SIZE = 100;
        Singleton arr[] = new Singleton[SIZE];

        for(int i = 0; i<SIZE; i++) {
            arr[i] = Singleton.getInstance();
        }
        System.out.println(Singleton.counter);
    }
}

class Singleton {
    public static int counter = 0;
    private static Singleton instance;

    private Singleton() {
        counter++;
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
