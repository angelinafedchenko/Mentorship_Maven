package constructors;

public class ConstructorExample {

    int i;
    ConstructorExample(String hello, int iValue) {
        this.i = iValue;
        System.out.println("Run");
        System.out.println(hello);
        System.out.println(iValue);
    }

    ConstructorExample(String hello) {
        System.out.println("Run");
        System.out.println(hello);

    }

    ConstructorExample (int iValue) {
        this.i = iValue;
        System.out.println("Run");
    }

}

class Run {
    public static void main(String[] args) {
        ConstructorExample constructorExample = new ConstructorExample("Hello!!", 5);
        System.out.println(constructorExample.i);
    }
}