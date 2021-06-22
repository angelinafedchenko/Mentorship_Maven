package collectionsTasks;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTasks {

    public TreeSet createTreeSet() {
        TreeSet set1 = new TreeSet();
        set1.add("White");
        set1.add("Black");
        set1.add("Grey");

        for (Object o: set1) {
            System.out.println(o);
        }
        return set1;
    }

    public void addAllToSet() {
        TreeSet set1 = new TreeSet();
        set1.add("White");
        set1.add("Black");
        set1.add("Grey");
        System.out.println("Tree set 1: " + set1);

        TreeSet set2 = new TreeSet();
        set2.add("Pink");
        System.out.println("Tree set 2: " + set2);

        set1.addAll(set2);
        System.out.println("Tree set 1 + Tree set 2:" + set1);
    }

    public void reverseSet() {
        TreeSet set1 = createTreeSet();

        Iterator i = set1.descendingIterator();
        System.out.println("Tree set 1 in reverse order: ");
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }

    public void findElementsLess() {

        TreeSet set3 = new TreeSet();
        TreeSet treeheadset = new TreeSet();

        set3.add(1);
        set3.add(2);
        set3.add(3);
        set3.add(5);
        set3.add(6);
        set3.add(7);
        set3.add(8);
        set3.add(9);
        set3.add(10);

        treeheadset = (TreeSet)set3.headSet(7);

        Iterator iterator;
        iterator = treeheadset.iterator();

        System.out.println("Tree set data < 7: ");
        while (iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }
    }

    public void greaterEqualElement() {
        TreeSet set4 = new TreeSet();

        set4.add(22);
        set4.add(2);
        set4.add(34);
        set4.add(5);
        set4.add(50);
        set4.add(67);

        System.out.println("Greater than or equal to 5 : "+set4.ceiling(15));
        System.out.println("Greater than or equal to 50 : "+set4.ceiling(50));
    }
}

