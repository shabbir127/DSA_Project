package com.SinglyLinkedList;

public class SinglyLinkedListExp {
	
	private ListNode head;
	
	
	private static class ListNode
	{
		private int data;
		private ListNode next;
		
		public ListNode(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	
	public void display()
	{
		ListNode current =head;
		while(current != null)
		{
			System.out.print(current.data + " --> ");
			current=current.next;
		}
		System.out.print("null");
		
	}
	
	
	public void listCount()
	{
		int count=0;
		if (head==null) {
			System.out.println("List length is "+ count);
		}
		ListNode current=head;
		
		while(current != null)
		{
			count++;
			System.out.print(current.data + " --> ");
			current=current.next;
		}
		System.out.print("null");
		System.out.println();
		System.out.println("List length is "+ count);
		
	}
	
	public void insertFirst(int value)
	{
		ListNode newNode=new ListNode(value);
		newNode.next=head;
		head=newNode;
	}
	
	
	public void insertLast(int value)
	{
		ListNode newNode=new ListNode(value);
		if (head == null) {
			head=newNode;
			return;
		}
		
		ListNode current =head;
		while(null != current.next)
		{
			current =current.next;
			
		}
		current.next=newNode;
	}
	
	public void insert(int position,int value)
	{
		//1->4->5->
		//1->6->4->5
		ListNode node=new ListNode(value);
		if(position == 1)
		{
			node.next=head;
			head=node;
		}
		else {
			ListNode previous=head;
			int count=0;
			while(count < position-1)
			{
				previous =previous.next;
				count++;
			}
			ListNode current=previous.next;
			previous.next=node;
			node.next=current;
		}
	}
	
	
	public ListNode deleteFirstNode()
	{
		if(head ==  null)
		{
			return null;
		}
		
		ListNode temp=head;
		head=head.next;
		temp.next=null;
		return temp;
		
		
		
	}
	
	public ListNode deleteLastNode()
	{
		if(head == null || head.next == null)
		{
			return null;
		}
		ListNode current=head;
		ListNode pervious=null;
		while(current.next !=null)
		{
			pervious=current;
			current=current.next;
		}
		
		pervious.next=null;
		return current;
	}
	
	

	public static void main(String[] args) {
		SinglyLinkedListExp sll=new SinglyLinkedListExp();
		sll.head=new ListNode(10);
		ListNode second=new ListNode(1);
		ListNode third=new ListNode(8);
		ListNode forth=new ListNode(11);
		
		
		sll.head.next=second;
		second.next=third;
		third.next=forth;
		
//		sll.insertFirst(24);
//		sll.insertFirst(8);
//		sll.listCount();
//		sll.insertLast(12);
//		sll.display();
		
		
		//sll.insert(1, 3);
		//sll.display();
		
//		sll.insert(2, 5);
//		sll.display();
		
//		sll.display();
//		System.out.println();
//		System.out.println("After deleteing frist Node"+sll.deleteFirstNode().data);
//		sll.deleteFirstNode();
//		System.out.println();
//		sll.display();
		
		
//		System.out.println("Display the listNode");
//		sll.display();
//		System.out.println();
//		sll.deleteLastNode();
//		System.out.println("Deleted the LastNode");
//		
//		sll.display();
		
		
		
		
	    
		
		
		
		
		
	}
}
