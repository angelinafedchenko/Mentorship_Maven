package readFiles2;

class Some implements Runnable {

    @Override
    public void run() {
        for(int i = 0; i<10; i++)
            System.out.println("Number - " + i);
    }
}

public class Task7 {

    public static void main(String[] args) {

        Thread new_one = new Thread(new Some());
        Thread new_two = new Thread(new Some());

        new_one.run();
        new_two.run();
    }
}
