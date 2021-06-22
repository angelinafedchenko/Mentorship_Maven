package collectionsTasks;

public class RunArraylist {

    public static void main(String[] args) {

        ArrayListTasks homework = new ArrayListTasks();

        System.out.println("=1=");
        System.out.println("First collection: " + homework.createFirstCollection());

        System.out.println("=2=");
        homework.iterateFirstCollection();

        System.out.println("=3=");
        System.out.println("Second collection (updated first collection): " + homework.insertElement());

        System.out.println("=4=");
        homework.retrieveElement();

        System.out.println("=5=");
        System.out.println("Third collection (updated first collection): " + homework.updateElement());

        System.out.println("=6=");
        homework.removeElement();

        System.out.println("=7=");
        homework.searchElement();

        System.out.println("=8=");
        System.out.println(homework.sortCollection() + " Second collection has been sorted.");

        System.out.println("=9=");
        homework.copyListToAnother();

        System.out.println("=10=");
        System.out.println(homework.shuffleCollection() + " - Collection 1 after shuffling.");

        System.out.println("=11=");
        System.out.println(homework.reverseCollection() + " - Collection 1 after reversing.");

        System.out.println("=12=");
        homework.extractPortionCollection();

        System.out.println("=13=");
        homework.compareCollection();

        System.out.println("=14=");
        homework.swapElements();

        System.out.println("=15=");
        homework.joinedCollections();

        System.out.println("=16=");
        System.out.println("Cloned array list (NEW Collection 9: " + homework.clonedArray());

        System.out.println("=17=");
        System.out.println("Empty Collection 10: " + homework.emptyArray());

        System.out.println("=18=");
        homework.emptyOrNotArray();


        System.out.println("=19=");
        homework.trimArray();

        System.out.println("=20=");
        homework.increaseArray();

        System.out.println("=21=");
        homework.replaceWithNewElement();

        System.out.println("=22=");
        homework.printByIndex();
    }

    
}
