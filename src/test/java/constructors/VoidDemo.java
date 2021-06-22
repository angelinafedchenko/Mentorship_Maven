package constructors;

public class VoidDemo {
    /**
     * Это конструктор
     */
    VoidDemo() {
        System.out.println("Constructor");
    }

    /**
     * А это уже обычный метод, даже не смотря на сходство с
     * именем класса, поскольку имеется возвращаемый тип void
     */
    public void voidDemo() {
        System.out.println("Method");
    }

    public static void main(String s[]) {
        VoidDemo m = new VoidDemo();
        m.voidDemo();
    }



}