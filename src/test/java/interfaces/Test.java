package interfaces;

public class Test {

    public static void main(String[] args) {

        Animal animal1 = new Animal(12);
        Person person1 = new Person("Bob");

        outputInfo(animal1);
        outputInfo(person1);

        Info info1 = new Animal(1);
        Info info2 = new Person("Dag");

        animal1.sleep();
        person1.sayHello();

        info1.showInfo();
        info2.showInfo();
    }

    public static void outputInfo (Info info) {
        info.showInfo();
    }
}
