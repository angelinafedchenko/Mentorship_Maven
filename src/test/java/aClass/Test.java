package aClass;

public class Test {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.makeSound();
        dog.makeSound();
        cat.eat();
        dog.eat();
        cat.setAge(12);
        System.out.println("Cat's age: " + cat.getAge());

        Animal fish = new Animal() {
            @Override
            public void makeSound() {

            }
        };

        fish.setAge(15);
        System.out.println("Fish's age: " + fish.getAge());




    }

//    public void sleep() {
//        Animal fish = new Animal() {
//
//
//            @Override
//            public void makeSound() {
//
//            }
//        };
//
//        fish.eat();
//        fish.getAge();
//        fish.setAge(188);
//    }
}
