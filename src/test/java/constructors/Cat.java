package constructors;

public class Cat {

    String name;
    int age;

    //для первого кота
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //для второго кота
    public Cat(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        Cat barsik = new Cat("Barsik", 5);
        Cat streetCatNamedBob = new Cat("Bob");

    }

}
