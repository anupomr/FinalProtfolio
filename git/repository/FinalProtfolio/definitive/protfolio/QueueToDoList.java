package definitive.protfolio;

import java.util.Queue;
import java.util.LinkedList;

public class QueueToDoList {
	public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
 
        // add elements to the queue
        queue.add("Complate outstanding work");
        queue.add("Prepare for Final Exam");
        queue.add("Take a doctor appoinment");
        queue.add("Build time table for next sem");
        // print the queue
        System.out.println("Queue: " + queue);
 
        // remove the element at the front of the queue
        String front = queue.remove();
        System.out.println("Removed element: " + front);
 
        // print the updated queue
        System.out.println("Queue after removal: " + queue);
 
        // add another element to the queue
        queue.add("Book a hotel for vacation stayover ");
 
        // peek at the element at the front of the queue
        String peeked = queue.peek();
        System.out.println("Peeked element: " + peeked);
 
        // print the updated queue
        System.out.println("Queue after peek: " + queue);
    }
}
