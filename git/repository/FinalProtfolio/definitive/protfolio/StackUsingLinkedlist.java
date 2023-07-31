package definitive.protfolio;

public class StackUsingLinkedlist {
	// A linked list node
    private class Node {
 
        String data; // String data
        Node link; // reference variable Node type
    }
    // create global top reference variable global
    Node top;
    // Constructor
    StackUsingLinkedlist() { this.top = null; }
 
    // Utility function to add an element x in the stack
    public void push(String x) // insert at the beginning
    {
        // create new node temp and allocate memory
        Node temp = new Node();
 
        // check if stack (heap) is full. Then inserting an
        //  element would lead to stack overflow
        if (temp == null) {
            System.out.print("\nHeap Overflow");
            return;
        }
 
        // initialize data into temp data field
        temp.data = x;
 
        // put top reference into temp link
        temp.link = top;
 
        // update top reference
        top = temp;
    }
 
    // Utility function to check if the stack is empty or
    // not
    public boolean isEmpty() { return top == null; }
 
    // Utility function to return top element in a stack
    public String peek()
    {
        // check for empty stack
        if (!isEmpty()) {
            return top.data;
        }
        else {
            System.out.println("Stack is empty");
            return "empty";
        }
    }
 
    // Utility function to pop top element from the stack
    public void pop() // remove at the beginning
    {
        // check for stack underflow
        if (top == null) {
            System.out.print("\nStack Underflow");
            return;
        }
 
        // update the top pointer to point to the next node
        top = (top).link;
    }
 
    public void display()
    {
        // check for stack underflow
        if (top == null) {
            System.out.println("\nStack Underflow");
            
        }
        else {
            Node temp = top;
            while (temp != null) {
 
                // print node data
                System.out.println(temp.data);
 
                // assign temp link to temp
                temp = temp.link;
                if(temp != null)
                    System.out.print(" -> ");
            }
        }
    }
    // Driver
    public static void main(String[] args)
    {
        // create Object of Implementing class
        StackUsingLinkedlist obj
            = new StackUsingLinkedlist();
        // insert Stack value
        obj.push("Go to Shopping");
        obj.push(" Milk Running out");
        obj.push("Pay Hydrow bill");
        obj.push(" Motgage payment ballence running Low");
 
        // print Stack elements
        obj.display();
 
        // print Top element of Stack
        System.out.println("Top element is\n " + obj.peek());
 
        // Delete top element of Stack
        obj.pop();
        obj.pop();
 
        // print Stack elements
        obj.display();
 
        // print Top element of Stack
        System.out.println("Top element is " + obj.peek());
    }
}
