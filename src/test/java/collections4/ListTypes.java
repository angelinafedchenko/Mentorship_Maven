package collections4;

import java.util.*;

public class ListTypes {

    public static void main(String[] args) {

        Collection col1 = createFirstCollection();
        Collection col2 = createSecondCollection();

        System.out.println("============= Проход по коллекции");
        for(Object o : col1) {
            System.out.println("Item:" + o);
        }

        System.out.println("============= Проход по коллекции через итератор");
        for (Iterator it = col1.iterator(); it.hasNext(); ) {
            String s = (String)it.next();
            System.out.println("Item:" + s);
        }

        col1 = createFirstCollection();
        col1.remove("1");
        System.out.println("============= Удаляем элемент '1' - его не будет в списке");
        for(Object o : col1) {
            System.out.println("Item:" + o);
        }
    }



    public static Collection createFirstCollection() {
        Collection col = new ArrayList();

        col.add("1");
        col.add("2");
        col.add("3");
        col.add("4");
        col.add("5");
        col.add("6");
        col.add("7");
        return col;
    }

    private static Collection createSecondCollection() {
        Collection col2 = new ArrayList();

        col2.add("1");
        col2.add("2");
        col2.add("3");
        return col2;
    }


}