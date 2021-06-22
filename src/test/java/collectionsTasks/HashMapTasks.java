package collectionsTasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTasks {

    public void createHashMap() {

        HashMap <Integer, String> map1 = new HashMap();
        map1.put(1, "White");
        map1.put(2,"Black");
        map1.put(3,"Grey");

        for (Map.Entry o: map1.entrySet()) {
            System.out.println(o.getKey()+" "+o.getValue());
        }
    }

    public void sizeOfHashMap() {
        HashMap<Integer, String> map1 = new HashMap();
        map1.put(1, "White");
        map1.put(2, "Black");
        map1.put(3, "Grey");

        System.out.println("Size of the hash map: " + map1.size());

    }

    public void copyHashMap() {
        HashMap<Integer, String> map1 = new HashMap();
        map1.put(1, "White");
        map1.put(2, "Black");
        map1.put(3, "Grey");
        System.out.println("Hash map 1: " + map1);

        HashMap<Integer, String> map2 = new HashMap();
        map2.put(4, "Pink");
        map2.put(5, "Blue");
        map2.put(6, "Grey");
        System.out.println("Hash map 2: " + map2);

        map1.putAll(map2);
        System.out.println("Hash map 1 + Hash map 2: " + map1);
    }

    public void clearHashMap() {
        HashMap<Integer, String> map1 = new HashMap();
        map1.put(1, "White");
        map1.put(2, "Black");
        map1.put(3, "Grey");
        map1.put(4, "Pink");
        System.out.println("Hash map 1: " + map1);
        map1.clear();
        System.out.println("Hash map 1: " + map1);
    }

    public void clearOrNotHashMap() {
        HashMap<Integer, String> map1 = new HashMap();
        map1.put(1, "White");
        map1.put(2, "Black");
        map1.put(3, "Grey");
        map1.put(4, "Pink");
        System.out.println("Hash map 1: " + map1);
        boolean result = map1.isEmpty();
        System.out.println("Is hash map empty: " + result);
        map1.clear();
        result = map1.isEmpty();
        System.out.println("Hash map 1: " + map1);
        System.out.println("Is hash map empty: " + result);
    }

    public void cloneHashMap() {
        HashMap map1 = new HashMap();
        map1.put(1, "White");
        map1.put(2, "Black");
        map1.put(3, "Grey");
        map1.put(4, "Pink");

        System.out.println("Hash map 1: " + map1);
        HashMap map3 = new HashMap();
        map3 = (HashMap) map1.clone();
        System.out.println("Cloned map: " + map3);
    }

    public void checkKeyOnHashMap() {
        HashMap <String, Integer> map1 = new HashMap <String, Integer> ();
        map1.put("White", 1);
        map1.put("Black", 2);
        map1.put("Grey", 3);
        map1.put("Pink", 4);
        System.out.println("Hash map 1: " + map1);
        System.out.println("Is key 'Green' exists?");
        if (map1.containsKey("Green")) {
            System.out.println("yes! - " + map1.get("Green"));
        } else {
            System.out.println("no!");
        }

        System.out.println("\nIs key 'White' exists?");
        if (map1.containsKey("White")) {
            System.out.println("yes! - " + map1.get("White"));
        } else {
            System.out.println("no!");
        }
    }

    public void checkValueOnHashMap() {
        HashMap map1 = new HashMap ();
        map1.put(1, "White");
        map1.put(2, "Black");
        map1.put(3, "Grey");
        map1.put(4, "Pink");
        System.out.println("Hash map 1: " + map1);
        System.out.println("Is value 'Green' exists?");
        if (map1.containsValue("Green")) {
            System.out.println("yes!");
        } else {
            System.out.println("no!");
        }

        System.out.println("\nIs value 'Grey' exists?");
        if (map1.containsValue("Grey")) {
            System.out.println("yes!");
        } else {
            System.out.println("no!");
        }
    }

    public void setViewHashMap() {
        HashMap map1 = new HashMap ();
        map1.put(1, "White");
        map1.put(2, "Black");
        map1.put(3, "Grey");
        map1.put(4, "Pink");

        Set setView = map1.entrySet();
        System.out.println("Set values: " + setView);
    }

    public void findValueByKeyHashMap() {
        HashMap map1 = new HashMap ();
        map1.put(1, "White");
        map1.put(2, "Black");
        map1.put(3, "Grey");
        map1.put(4, "Pink");

        String val = (String)map1.get(3);
        System.out.println("Value for key 3 is: " + val);
    }

    public void getSetKeysHashMap() {
        HashMap map1 = new HashMap ();
        map1.put(1, "White");
        map1.put(2, "Black");
        map1.put(3, "Grey");
        map1.put(4, "Pink");

        Set keySet = map1.keySet();
        System.out.println("Key set values are: " + keySet);
    }

    public void getValuesHashMap() {
        HashMap map1 = new HashMap ();
        map1.put(1, "White");
        map1.put(2, "Black");
        map1.put(3, "Grey");
        map1.put(4, "Pink");

        System.out.println("Values of map 1 are: " + map1.values());
    }



}

