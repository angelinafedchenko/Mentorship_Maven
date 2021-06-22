package collectionsTasks;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTasks {

    public void createTreeMap() {

        TreeMap<Integer, String> map1 = new TreeMap<Integer, String>();
        map1.put(1, "White");
        map1.put(2, "Black");
        map1.put(3, "Grey");

        for (Map.Entry o : map1.entrySet()) {
            System.out.println(o.getKey() + " " + o.getValue());
        }
    }

    public void findByKey() {

        TreeMap<String, String> map2 = new TreeMap<String, String>();

        map2.put("C1", "Red");
        map2.put("C2", "Green");
        map2.put("C3", "Black");
        map2.put("C4", "White");

        System.out.println(map2);

        if (map2.containsKey("C1")) {
            System.out.println("The Tree Map contains key C1");
        } else {
            System.out.println("The Tree Map does not contain key C1");
        }

        if (map2.containsKey("C5")) {
            System.out.println("The Tree Map contains key C5");
        } else {
            System.out.println("The TreeMap does not contain key C5");
        }
    }

    public void findByValue() {

        TreeMap<String, String> map2 = new TreeMap<String, String>();

        map2.put("C1", "Red");
        map2.put("C2", "Green");
        map2.put("C3", "Black");
        map2.put("C4", "White");

        System.out.println(map2);

        if (map2.containsValue("Green")) {
            System.out.println("The Tree Map contains Green");
        } else {
            System.out.println("The Tree Map does not contain Green");
        }

        if (map2.containsValue("Yellow")) {
            System.out.println("The Tree Map contains Yellow");
        } else {
            System.out.println("The TreeMap does not contain Yellow");
        }
    }

    public void sortTreeMap() {
        TreeMap map1 = new TreeMap();
        map1.put("A3", "White");
        map1.put("A4", "Black");
        map1.put("A3", "Grey");
        map1.put("A1", "Pink");
        map1.put("A2", "Yellow");

        System.out.println(map1);
    }

    class sort_key implements Comparator<String> {
        @Override
        public int compare(String str1, String str2) {
            return str1.compareTo(str2);
        }

    }

    public void getFirstLast() {
        TreeMap map1 = new TreeMap();
        map1.put("A3", "White");
        map1.put("A4", "Black");
        map1.put("A1", "Pink");
        map1.put("A2", "Yellow");

        System.out.println("Map 1: " + map1);
        System.out.println("Greatest key: " + map1.firstKey());
        System.out.println("Least key: " + map1.lastKey());
    }

}






