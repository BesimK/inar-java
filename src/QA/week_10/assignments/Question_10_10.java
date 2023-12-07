package QA.week_10.assignments;

import QA.week_10.additionalClasses.Queue;

public class Question_10_10 {
    public static void main(String[] args) {
        Queue queue = new Queue();
        for (int i = 1; i <= 20; i++) {
            queue.enqueue(i);
        }
        System.out.println(queue.toString());
        System.out.println("Process of Dequeue :");
        while (!queue.empty()) {
            System.out.print(queue.dequeue() + " ");
        }
    }
}