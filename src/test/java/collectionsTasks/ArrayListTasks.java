package collectionsTasks;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTasks {

    public List createFirstCollection() {
        List col1 = new ArrayList();
        col1.add("Black");
        col1.add("White");
        col1.add("Red");
        col1.add("Green");
        col1.add("Blue");
        return col1;
    }

    public void iterateFirstCollection() {
        List col1 = createFirstCollection();
        for (Object o: col1) {
            System.out.println(o);
        }
    }

    public List insertElement() {
        List col2 = createFirstCollection();
        col2.add(0, "Yellow");
        return col2;
    }

    public void retrieveElement() {
        List col1 = createFirstCollection();
        String fourth = (String) col1.get(3);
        System.out.println("Fourth element of First collection is: " + fourth);
    }

    public List updateElement() {
        List col3 = createFirstCollection();
        col3.set(4, "Light blue");
        return col3;
    }

    public void removeElement() {
        List col4 = insertElement();
        System.out.println("Fourth collection (updated second collection): " + col4.remove(2) + " (third element) was removed.");
        System.out.println(col4);
    }

    public void searchElement() {
        List col1 = createFirstCollection();
        List col3 = updateElement();

        Switch:
        col1:
        if(col1.contains("Light blue")) {
            System.out.println("Light blue is founded in First collection");
        } else {
            System.out.println("Let's search in another list.");
        }

        col3:
        if(col3.contains("Light blue")) {
            System.out.println("Light blue is founded in Third");
        } else {
            System.out.println("Let's search in another list.");
        }
    }

    public List sortCollection() {
        List col2 = insertElement();
        System.out.println("Second collection before sort: " + col2);
        Collections.sort(col2);
        return col2;
    }

    public void copyListToAnother() {
        List col1 = createFirstCollection();
        List col3 = updateElement();
        System.out.println("Collection 1: " + col1);
        System.out.println("Collection 3: " + col3);
        Collections.copy(col1, col3);
        System.out.println("Collection 1 after copy: " + col1);
        System.out.println("Collection 3 after copy: " + col3);
    }

    public List shuffleCollection() {
        List col1 = createFirstCollection();
        System.out.println("Collection 1 before shuffling - " + col1);
        Collections.shuffle(col1);
        return col1;
    }

    public List reverseCollection() {
        List col1 = createFirstCollection();
        System.out.println("Collection 1 before reversing - " + col1);
        Collections.reverse(col1);
        return col1;
    }

    public void extractPortionCollection() {
        List col1 = createFirstCollection();
        System.out.println("Collection 1 before extraction - " + col1);
        List col5 = col1.subList(0,2);
        System.out.println("List of first two elements: " + col5);
    }

    public void compareCollection() {
        List col1 = createFirstCollection();
        List col3 = updateElement();
        ArrayList col6 = new ArrayList();
        for (Object e : col1)
            col6.add(col3.contains(e) ? "Yes" : "No");
        System.out.println(col1);
        System.out.println(col3);
        System.out.println(col6);
    }

    public void swapElements() {
        List col2 = insertElement();
        System.out.println("Collection 2 before Swap: ");
        for (Object a : col2) {
            System.out.println(a);
        }
        Collections.swap(col2, 0, 4);
        System.out.println("Collection 2 after Swap (1->5): ");
        for (Object b: col2) {
            System.out.println(b);
        }
    }

    public void joinedCollections() {
        ArrayList col7 = new ArrayList();
        col7.add("White");
        col7.add("Black");
        System.out.println("List of first array: " + col7);

        ArrayList col8 = new ArrayList();
        col8.add("Yellow");
        col8.add("Green");
        System.out.println("List of second array: " + col8);

        ArrayList joinedLists = new ArrayList();
        joinedLists.add(col7);
        joinedLists.add(col8);
        System.out.println("New array (List 1 + List 2: " +joinedLists);
    }

    public ArrayList clonedArray() {
        ArrayList col9 = new ArrayList();
        col9.add("Pink");
        col9.add("Light blue");
        System.out.println("Original array list Collection 9: " + col9);

        ArrayList newCol9 = (ArrayList)col9.clone();
        return newCol9;
    }

    public ArrayList emptyArray() {
        ArrayList col10 = new ArrayList();
        col10.add("Green");
        col10.add("Black");
        System.out.println("Original array list Collection 10: " + col10);

        col10.removeAll(col10);
        return col10;
    }

    public void emptyOrNotArray() {
        ArrayList col11 = new ArrayList();
        col11.add("White");
        col11.add("Black");
        System.out.println("Original array list Collection 11: " + col11);
        System.out.println("Does the Collection 11 is empty? " + col11.isEmpty());

        col11.removeAll(col11);
        System.out.println("Empty array list Collection 11: " + col11);
        System.out.println("Does the Collection 11 is empty? " + col11.isEmpty());
    }

    public void trimArray() {
        ArrayList col12 = new ArrayList();
        col12.add("White");
        col12.add("Grey");
        System.out.println("Original array list Collection 12: " + col12);

        col12.trimToSize();
        System.out.println("Collection 12 is trimmed to size: " + col12);
    }

    public void increaseArray() {
        ArrayList col13 = new ArrayList();
        col13.add("White");
        col13.add("Grey");
        col13.add("Black");
        System.out.println("Original array list Collection 13: " + col13);

        col13.ensureCapacity(4);
        col13.add("Red");
        System.out.println("Collection 13 with increased size (4): " + col13);
    }

    public void replaceWithNewElement() {
        ArrayList col14 = new ArrayList();
        col14.add("White");
        col14.add("Grey");
        System.out.println("Original array list Collection 14: " + col14);

        String newColor = "Black";
        col14.set(1, newColor);
        System.out.println("Collection 14 with New color (Black): " + col14);

//        int num = col14.size();
//        System.out.println("Collection 14 with New color (Black): ");
//        for (int i = 0; i<num; i++)
//            System.out.println(col14.get(i));
    }

    public void printByIndex() {
        ArrayList col15 = new ArrayList();
        col15.add("White");
        col15.add("Black");
        col15.add("Red");
        col15.add("Green");
        System.out.println("Collection 15: " + col15);

        System.out.println("Print by index of element: ");
        int numOfElement = col15.size();
        for (int index = 0; index<numOfElement; index++) {
            System.out.println(col15.get(index));
        }
    }


}
