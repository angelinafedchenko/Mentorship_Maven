package aClass;

public abstract class Animal { // нельзя создать объект

    int age;

    public void eat() {
        System.out.println("I am eating..");
    }

    public abstract void makeSound();

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

}
