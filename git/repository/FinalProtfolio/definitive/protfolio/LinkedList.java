package definitive.protfolio;

public class LinkedList {
	
	class Node{
		Contact item;
		Node previous;
		Node next;
		
		Node(Contact d){
			this.item=d;
		}
	}
	Node head, tail=null;
	
	public void insert(Contact item){
		Node newNode =new Node(item);
		
		if(head==null) {
			head=tail=newNode;
			head.previous=null;
			tail.next=null;
		}
		else {
			tail.next=newNode;
			newNode.previous=tail;
			tail=newNode;
			tail.next=null;
		}
		
	}//End insert
	
	public void print()
	{
		Node current =head;
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		System.out.println(" Data lists are : ");
		while(current != null) {
			System.out.println(current.item + " ");
			current= current.next;
		}
	}	 

}//Linked list end
