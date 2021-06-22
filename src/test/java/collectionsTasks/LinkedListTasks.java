package collectionsTasks;

import java.util.*;

public class LinkedListTasks {


    public LinkedList addToLinkedList() {

        LinkedList list1 = new LinkedList();
        list1.add("White");
        list1.add("Black");
        list1.add("Grey");
        list1.add("Green");
        list1.add("Red");
        list1.add("Yellow");
        return list1;
    }

    public void iterateLinkedList() {
        LinkedList list1 = addToLinkedList();
        for (Object l : list1) {
            System.out.println(l);
        }
    }

    public void iterateByIndexLinkedList() {
        LinkedList list1 = addToLinkedList();
        Iterator i = list1.listIterator(2);
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }

    public void iterateReverseLinkedList() {
        LinkedList list1 = addToLinkedList();
        System.out.println(list1);

        Iterator iReverse = list1.descendingIterator();

        System.out.println("Elements in Reverse Order:");
        while (iReverse.hasNext()) {
            System.out.println(iReverse.next());
        }
    }

    public LinkedList insertToListPosition() {
        LinkedList list2 = addToLinkedList();
        System.out.println("Original List 1: " + list2);

        list2.add(3,"Pink");
        System.out.println("Modified List 1 (added Pink): " + list2);
        return list2;
    }

    public LinkedList addFirstLastElements() {
        LinkedList list3 = addToLinkedList();
        System.out.println("Original List 3: " + list3);

        list3.addFirst("New_White");
        list3.addLast("New_Yellow");
        System.out.println("New List 3: " + list3);
        return list3;
    }

    public LinkedList offerFirstLastElements() {
        LinkedList list4 = addToLinkedList();
        System.out.println("Original List 4: " + list4);

        list4.offerFirst("New_White");
        list4.offerLast("New_Yellow");
        System.out.println("New List 4: " + list4);
        return list4;
    }

    public void addElementsToList() {
        LinkedList list5 = new LinkedList();
        list5.add("White");
        list5.add("Black");
        System.out.println("List 5: " + list5);

        LinkedList list6 = new LinkedList();
        list6.add("Grey");
        list6.add("Pink");
        System.out.println("list 6: " + list6);

        list5.addAll(2,list6);
        System.out.println("List 5 + List 6: " + list5);
    }

    public void firstLastElements() {
        LinkedList list6 = new LinkedList();
        list6.add("Grey");
        list6.add("White");
        list6.add("Black");
        System.out.println("List 6: " + list6);

        System.out.println("First element: " + list6.getFirst());
        System.out.println("Last element: " + list6.getLast());

        Object first_element = list6.getFirst();
        System.out.println("First Element is: "+ first_element);

        Object last_element = list6.getLast();
        System.out.println("Last Element is: "+ last_element);
    }

    public void getElementByIndex() {
        LinkedList list7 = new LinkedList();
        list7.add("Grey");
        list7.add("White");
        list7.add("Black");
        System.out.println("List 7: " + list7);

        for(int p = 0; p < list7.size(); p++)
        {
            System.out.println("Element at index "+ p +": "+list7.get(p));
        }
    }

    public LinkedList removeElementByIndex() {
        LinkedList list8 = new LinkedList();
        list8.add("Grey");
        list8.add("White");
        list8.add("Black");
        System.out.println("List 8: " + list8);
        list8.remove(0);
        System.out.println("List 8 (without first element: " + list8);
        return list8;
    }

    public void removeFirstLastElements() {
        LinkedList list9 = new LinkedList();
        list9.add("Grey");
        list9.add("White");
        list9.add("Black");
        System.out.println("Original List 9: " + list9);

        Object first_element = list9.removeFirst();
        System.out.println("Element removed: "+ first_element);

        Object last_element = list9.removeLast();
        System.out.println("Element removed: "+ last_element);

        System.out.println("List 9 (without first and last elements): " + list9);
    }

    public void removeAllElements() {
        LinkedList list10 = addToLinkedList();
        System.out.println("Original List 10: " + list10);

        list10.clear();
        System.out.println("Empty List 10: " + list10);
    }

    public LinkedList swapElements() {
        LinkedList list11 = addToLinkedList();
        System.out.println("Original List 11: " + list11);

        Collections.swap(list11, 0, 5);
        System.out.println("Swapping 1st(index 0, White) element with the last (index 5, Yellow) element: " + list11);
        return list11;
    }

    public LinkedList shuffledList () {
        LinkedList list12 = addToLinkedList();
        System.out.println("Original List 12: " + list12);
        Collections.shuffle(list12);
        System.out.println("Shuffled List 12: " + list12);
        return list12;
    }

    public void joinListToList() {
        LinkedList list13 = new LinkedList();
        list13.add("White");
        list13.add("Black");
        System.out.println("List 13: " + list13);

        LinkedList list14 = new LinkedList();
        list14.add("Grey");
        list14.add("Pink");
        System.out.println("list 14: " + list14);

        LinkedList joinedList = new LinkedList();
        joinedList.addAll(list13);
        joinedList.addAll(list14);
        System.out.println("List 13 + List 14: " + joinedList);
    }

    public void clonedList() {
        LinkedList list15 = new LinkedList();
        list15.add("White");
        list15.add("Black");
        System.out.println("List 15: " + list15);

        LinkedList list16 = new LinkedList();
        list16 = (LinkedList) list15.clone();

        System.out.println("Cloned linked list: " + list16);
    }

    public LinkedList popElementFromList () {
        LinkedList list17 = addToLinkedList();
        System.out.println("Original List 17: " + list17);
        System.out.println("Removed element: " + list17.pop());
        System.out.println("New List 17: " + list17);
        return list17;
    }

    public void retrieveElementsFromList () {
        LinkedList list17 = addToLinkedList();
        System.out.println("Original List 17: " + list17);

        String first_element = (String) list17.peekFirst();
        String last_element = (String) list17.peekLast();
        System.out.println("First element: " + first_element);
        System.out.println("Last element: " + last_element);

        System.out.println("List 17: " + list17);
    }

    public void checkPresenceOnList() {
        LinkedList list17 = addToLinkedList();
        System.out.println("Original List 17: " + list17);

        if (list17.contains("White")) {
            System.out.println("White is present in the List 17.");
        } else {
            System.out.println("White is not present in the List 17.");
        }

        if (list17.contains("Light blue")) {
            System.out.println("Light blue is present in the List 17.");
        } else {
            System.out.println("Light blue is not present in the List 17.");
        }

    }

    public void convertLinkedToArray() {
        LinkedList list18 = new LinkedList();
        list18.add("White");
        list18.add("Black");
        System.out.println("List 18: " + list18);

        List list18_New = new ArrayList(list18);

        for (Object o : list18) {
            System.out.println(o);
        }
    }

    public void compareLinkedLists() {
        LinkedList list19 = new LinkedList();
        list19.add("Pink");
        list19.add("Black");
        list19.add("White");
        System.out.println("List 19: " + list19);

        LinkedList list20 = new LinkedList();
        list20.add("White");
        list20.add("Pink");
        System.out.println("list 20: " + list20);

        LinkedList list21 = new LinkedList();
        for (Object e : list19)
            list21.add(list20.contains(e) ? "Yes" : "No");

        System.out.println(list21);
    }

    public void emptyOrNotLinkedList() {
        LinkedList list19 = new LinkedList();
        list19.add("Pink");
        list19.add("Black");
        list19.add("White");
        System.out.println("List 19: " + list19);

        System.out.println("Does the List 19 is empty? " + list19.isEmpty());

        list19.removeAll(list19);
        System.out.println("Empty List 19: " + list19);
        System.out.println("Does the List 19 is empty? " + list19.isEmpty());
    }

    public void replaceElementOnLinkedList() {
        LinkedList list19 = new LinkedList();
        list19.add("Pink");
        list19.add("Black");
        list19.add("White");
        System.out.println("List 19: " + list19);

        list19.set(2, "New_White");
        System.out.println("New List 19: " + list19);
    }


}
