package readFiles2;

class SomeThread extends Thread {

    public void run() {
        for(int i = 0; i<10; i++)
            System.out.println("Number - " + i);

    }
}

public class Task6 {

    public static void main(String[] args) {

        SomeThread test = new SomeThread();
        test.run();

        SomeThread test1 = new SomeThread();
        test1.run();


    }
}
