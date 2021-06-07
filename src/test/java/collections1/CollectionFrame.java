package collections1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionFrame {

    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();

        //LinkedList<Person> list = new LinkedList<>();

        Person person1 = new Person("Harry");
        Person person2 = new Person("Potter");
        Person person3 = new Person("Third");


        list.add(person1);
        list.add(person2);

        Person person1FromCollection = list.get(0);
        Person person2FromCollection = list.get(1);

        System.out.println(person1FromCollection);
        System.out.println(person2FromCollection);

        System.out.println("============");

        list.remove(person1);

        Person person = list.get(0);
        System.out.println(person);
        System.out.println(list.size());

        list.add(person2);
        System.out.println(list.size());

        System.out.println("=======");

        System.out.println(list.contains(person3));

        System.out.println("=========");

        Iterator<Person>iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
            System.out.println(list.size());
        }

//        for (Person person: list) {
//            list.remove(person);
//        }

    }
}
