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
		 
		 
		 
		 
	}
}
