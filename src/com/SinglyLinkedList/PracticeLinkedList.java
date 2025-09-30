package com.SinglyLinkedList;

public class PracticeLinkedList {

	private ListNode head;
	 
	 private static class ListNode{
		 private int data;
		 private ListNode next;
		   
		 public ListNode(int data)
		 {
			 this.data=data;
			 this.next=null;
		 } 		 
   
	 }
	 
	 public void  display()
		{
			ListNode current=head;
			while(current != null)
			{
				System.out.print(current.data + " --> ");
				current=current.next;
			}
			System.out.print("null");
		}
	 
	 public void InsertNodeFirst(int value)
	 {
		 ListNode newNode=new ListNode(value);
		 newNode.next=head;
		 head=newNode;
		 display();
	 }
	 
	 public void InsertNodeLast(int value)
	 {
		 ListNode newNode = new ListNode(value);
		 if (head == null) {
			head = newNode;
			return;
		}
		 ListNode current =head;
		 while(null != current.next)
		 {
			 current =current.next;
		 }
		 current.next=newNode;
	 }
	 
	 public void displayLinkedlistLength()
	 {
		 ListNode current = head;
		 int count =0;
		 while(current != null)
		 {
			 count ++;
			 current=current.next;
		 }
		 System.out.println("\n Length of linked List is :- " + count);
	 }
	 
	 public static void main(String[] args) {
		
		 PracticeLinkedList pll=new PracticeLinkedList();
		 pll.head=new ListNode(10);
		 ListNode second=new ListNode(20);
		 ListNode third=new ListNode(30);
		 ListNode fourth=new ListNode(40);
		 
		
		 //now we will connect them together to from a chain.
		 pll.head.next=second; //10 -->20
		 second.next=third;    //10-->20 -->30
		 third.next=fourth;    //10 -->20 -->30 -->40
		 
		 pll.display();
		 pll.displayLinkedlistLength();
		 pll.InsertNodeFirst(9);
		 
	}
}
