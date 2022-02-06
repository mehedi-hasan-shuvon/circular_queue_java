
public class Main {
    public static void main(String[] args) {
        CircularQueue newq = new CircularQueue(3);
        System.out.println(newq.isEmpty());
        System.out.println(newq.isFull());
        newq.enqueue(5);
        newq.enqueue(6);
        newq.enqueue(7);
        int result = newq.dequeue();
        int result2 = newq.dequeue();
        newq.enqueue(9);
        newq.enqueue(10);
        int result3 = newq.dequeue();
        int result4 = newq.dequeue();
        // int result5 = newq.dequeue();
        newq.peek();
        newq.deletequeue();

    }
}