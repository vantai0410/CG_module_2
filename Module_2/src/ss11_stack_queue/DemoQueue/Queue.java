//package ss11_stack_queue.DemoQueue;
//
//class Node {
//        int data;
//        Node link;
//
//    public Node(int data) {
//        this.data = data;
//        this.link = null;
//    }
//}
//    class Queue {
//        Node front, rear;
//
//        public Queue() {
//            this.front = this.rear = null;
//        }
//
//        void enQueue(int value) {
//            Node newNode = new Node(value);
//            if (front == null) {
//                front = rear = newNode;
//                rear.link = front;
//            } else {
//                rear.link = newNode;
//                rear = newNode;
//                rear.link = front;
//            }
//        }
//        int deQueue() {
//            if (front == null) {
//                System.out.println("Hàng đợi trống");
//                return -1;
//            }
//
//            int value;
//            // Nếu chỉ có một phần tử trong hàng đợi
//            if (front == rear) {
//                value = front.data;
//                front = rear = null; // Làm rỗng hàng đợi
//            } else {
//                value = front.data;
//                front = front.link;
//                rear.link = front; // Cập nhật rear để liên kết với front
//            }
//
//            return value;
//        }
//        void displayQueue() {
//            if (front == null) {
//                System.out.println("Hàng đợi trống");
//                return;
//            }
//
//            Node temp = front;
//            System.out.print("Hàng đợi: ");
//            while (temp.link != front) {
//                System.out.print(temp.data + " ");
//                temp = temp.link;
//            }
//            System.out.println(temp.data); // In ra phần tử cuối cùng
//        }
//    }
//public class CircularQueue {
//    public static void main(String[] args) {
//        Queue q = new Queue();
//
//        q.enQueue(14);
//        q.enQueue(22);
//        q.enQueue(6);
//        q.displayQueue();
//
//        System.out.println("Phần tử được lấy ra: " + q.deQueue());
//        q.displayQueue();
//
//        q.enQueue(9);
//        q.enQueue(20);
//        q.displayQueue();
//    }
//}
//
//
//
