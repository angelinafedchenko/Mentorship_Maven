package recursion;

public class Recursion {
    public static void main(String[] args) {
        recursionFucn();
    }

    public static void recursionFucn() {
        System.out.println("Привет, JavaRush!");
        recursionFucn();
    }

}

