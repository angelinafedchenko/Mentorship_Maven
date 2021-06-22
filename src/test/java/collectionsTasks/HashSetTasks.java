package collectionsTasks;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetTasks {

    public HashSet createHashset() {
        HashSet set1 = new HashSet();
        set1.add("White");
        set1.add("Black");
        set1.add("Grey");

        System.out.println("HashSet 1: " + set1);
        return set1;
    }

    public void hashsetSize() {
        HashSet set1 = createHashset();
        System.out.println("Size of Hash Set: " + set1.size());
    }

    public void cloneHashset() {
        HashSet set1 = createHashset();
        HashSet set2 = new HashSet();
        set2 = (HashSet) set1.clone();

        System.out.println("Cloned Hash Set: " + set2);
    }

    public void compareHashset() {
        HashSet set1 = createHashset();
        HashSet set2 = new HashSet();
        set2.add("Pink");
        set2.add("Yellow");
        set2.add("White");
        System.out.println("HashSet 2: " + set2);

        HashSet compareSets = new HashSet();
        for (Object e: set1) {
            System.out.println(set2.contains(e) ? "Yes" : "No");
        }
    }

    public void convertSet() {
        HashSet set1 = createHashset();
        Set tree_set = new TreeSet(set1);

        for (Object o: tree_set) {
            System.out.println(o);
        }
    }

}
