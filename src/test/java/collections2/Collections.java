package collections2;

import java.util.*;

public class Collections {

    public static void main(String[] args) {

       List collection = new ArrayList();
       Set collection2 = new HashSet();
       Queue collection3 = new PriorityQueue();
       Map map = new HashMap();


        System.out.println("======List=======");

        collection.add("1");
        collection.add("2");
        collection.add("3");
        collection.add("4");
        collection.remove("4");
        collection.set(2, "5");

        System.out.println(collection.get(1));

        for (int i = 0; i<collection.size(); i++) {
            System.out.println(collection.get(i));
        }

//
//        Iterator iterator = collection.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//
//        // == =>
//
//        for (Object o: collection) {
//            System.out.println(o);
//        }


        System.out.println("======Set=======");

        collection2.add("5");
        collection2.add("6");
        collection2.add("7");
        collection2.add("7");
        collection2.add("7");
        collection2.add("7");

        for (Object e: collection2) {
            System.out.println(e);
        }

        System.out.println("======Queue=======");

        collection3.offer("1");
        collection3.offer("2");
        collection3.offer("3");
        collection3.offer("4");

        Iterator iterator = collection3.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("num of elements: " + collection3.size());

        System.out.println("======Map=======");

        class Book {
            String autor;

            public Book (String autor) {
                this.autor = autor;
            }

            @Override
            public String toString() {
                return "Book{" +
                        "autor='" + autor + '\'' +
                        '}';
            }
        }

        map.put("8", new Book ("Brown"));
        map.put("9", "Ostin");
        map.put("10", "Rowling");

            System.out.println(map.get("8"));

            Set set = map.entrySet();
            for (Object o: set) {
                System.out.println(o);
            }



    }
}
