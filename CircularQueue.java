import javax.lang.model.util.ElementScanner6;
import javax.swing.text.StyledEditorKit.BoldAction;
import javax.swing.text.html.HTMLDocument.RunElement;

public class CircularQueue {
    int arr[];
    int topOfQueue;
    int beginnigOfQueue;
    int size;

    // creating queue
    public CircularQueue(int size) {
        this.arr = new int[size];
        this.size = size;
        this.topOfQueue = -1;
        this.beginnigOfQueue = -1;
        System.out.println("This circular queue is successfully created with size of: " + this.size);
    }

    // isEmpty
    public boolean isEmpty() {
        if (topOfQueue == -1) {
            return true;
        } else {
            return false;
        }
    }

    // isFull
    public boolean isFull() {
        if (((topOfQueue + 1) % size) == beginnigOfQueue) {
            return true;
        } else {
            return false;
        }
    }

    // enqueue
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("the queue is alreay full");
        } else if (isEmpty()) {
            beginnigOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("the value has been successfully : " + value);
        } else {
            topOfQueue = (topOfQueue + 1) % size;
            arr[topOfQueue] = value;
            System.out.println("the value has been successfully : " + value);
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("the queue is empty");
            return -1;
        } else {
            int result = arr[beginnigOfQueue];
            arr[beginnigOfQueue] = 0;
            System.out.println("the value " + result + " is removed");
            if (beginnigOfQueue == topOfQueue) {
                beginnigOfQueue = -1;
                topOfQueue = -1;
            } else {
                beginnigOfQueue = (beginnigOfQueue + 1) % size;
            }

            return result;

        }
    }

    // peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("the queue is empty");
            return -1;
        } else {
            int result = arr[beginnigOfQueue];
            System.out.println("the beginning of the queue is " + result);
            return result;
        }
    }

    // deleting queue
    public void deletequeue() {
        arr = null;
        System.out.println("the queue is succesffuly deleted");
    }
}
