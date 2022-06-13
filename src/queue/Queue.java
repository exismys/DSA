package queue;

public class Queue {
    private int[] arr;
    private int front;
    private int back;

    Queue () {
        arr = new int[100];
        front = -1;
        back = -1;
    }

    public void enqueue(int val) {
        if (front == -1) {
            arr[++back] = val;
            front++;
            return;
        }
        if (back != arr.length - 1) {
            arr[++back] = val;
        } else{
            System.out.println("Queue is full!");
        }
    }

    public int dequeue() {
        if (front != -1 && front <= back) {
            int val = arr[front++];
            return val;
        } else {
            System.out.println("Queue is empty!");
            return -1;
        }
    }

    public int front() {
        if (front != -1 && front <= back) {
            return arr[front];
        } else {
            System.out.println("Queue is empty!");
            return -1;
        }
    }

    public int back() {
        if (front != -1 && front <= back) {
            return arr[back];
        } else {
            System.out.println("Queue is empty!");
            return -1;
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.dequeue();
        System.out.println(queue.front());
        System.out.println(queue.back());
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
    }
}
