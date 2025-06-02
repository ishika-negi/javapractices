public class queuearray {
    static class QueueArray {
        int arr[];
        int size;
        int rear;

        public QueueArray(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        // check if queue is empty
        public boolean isEmpty() {
            return rear == -1;
        }

        // add (enqueue)
        public void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }

        // remove (dequeue)
        public int remove() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }
            int front = arr[0];
            // shift elements to the left
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        // peek
        public int peek() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        QueueArray q = new QueueArray(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
           
        }
    }
}
