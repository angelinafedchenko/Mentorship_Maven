package aClassVSInterface2;

public class First extends MyClass implements MyInterface, MyInterface.MyInterface2 {

    public static void main(String[] args) {

        First test = new First();
        test.bye();

        test.yourAge();
        test.yourName();

        System.out.println(MyInterface2.b);
    }

    @Override
    void bye(){
        System.out.println("Bye!");
    }

    @Override
    public void yourName() {
        System.out.println("interfaceMethod");
    }

}



