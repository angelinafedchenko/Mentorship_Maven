package collectionsTasks;

import java.util.PriorityQueue;

public class PriorityQueueTasks {

    public PriorityQueue createQueue() {
        PriorityQueue queue1 = new PriorityQueue();
        queue1.add("White");
        queue1.add("Black");
        queue1.add("Grey");

        for (Object o: queue1) {
            System.out.println(o);
        }
        return queue1;
    }

    public void addAllToQueue() {
        PriorityQueue queue1 = new PriorityQueue();
        queue1.add("White");
        queue1.add("Black");
        queue1.add("Grey");
        System.out.println("Queue 1: " + queue1);

        PriorityQueue queue2 = new PriorityQueue();
        queue2.add("Pink");
        System.out.println("Queue 2: " + queue2);

        queue1.addAll(queue2);
        System.out.println("Queue 1 + Queue 2: " + queue1);
    }

    public void compareQueues() {
        PriorityQueue queue1 = new PriorityQueue();
        queue1.add("White");
        queue1.add("Pink");
        queue1.add("Grey");
        System.out.println("Queue 1: " + queue1);

        PriorityQueue queue2 = new PriorityQueue();
        queue2.add("Pink");
        System.out.println("Queue 2: " + queue2);

        for (Object o : queue1) {
            System.out.println(queue2.contains(o) ? "Yes" : "No");
        }
    }

        public void firstOfQueue() {
            PriorityQueue queue1 = new PriorityQueue();
            queue1.add("White");
            queue1.add("Pink");
            queue1.add("Grey");
            System.out.println("Queue 1: " + queue1);
            System.out.println("The first element of the Queue 1: " + queue1.peek());
        }
        public void removeFirstOfQueue() {
        PriorityQueue queue1 = new PriorityQueue();
        queue1.add("White");
        queue1.add("Pink");
        queue1.add("Grey");
        System.out.println("Queue 1: " + queue1);
        System.out.println("Removes the first element of the Queue 1: " + queue1.poll());
        System.out.println("Queue 1 after removing first element: " + queue1);
    }


}
