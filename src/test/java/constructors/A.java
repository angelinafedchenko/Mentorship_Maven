package constructors;

public class A {
    A() {
        System.out.println("Inside A constructor.");
    }
}

//Создать подкласс B, расширяющий класс A
class B extends A {
    B() {
        System.out.println("Inside B constructor.");
    }
}

//Создать класс (C), расширяющий класс В
class C extends B {

    private String name;

    C(String name) {
        System.out.println("Inside C constructor.");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Call {
    public static void main(String args[])
    {
        C c = new C("ddd");
        c.setName("df");
        System.out.println(c.getName());
    }
}