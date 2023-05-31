package com.dsa;

import java.util.Scanner;

public class LinkedList {
	/*
	 * author : Saran 
	 * contact: https://www.getHelpFromSaran.in
	 */
	public  static class Node{
		int data;
		Node next;
	    public Node(int data) {
			// TODO Auto-generated constructor stub
	    	this.data=data;
		}	
	}
	
	public static Node head=null;
	public static Node tail=null;
	public static Node createNode(int data){
		Node newNode = new Node(data);
		newNode.next=null;
		return newNode;
	}
	
	public static void insertEnd(int data){
		Node newNode = createNode(data);
		if(head==null){
			head=tail=newNode;
		}
		else{
			tail.next=newNode;
			tail=newNode;
		}
	}
	
	public static void printList(){
		Node i;
		for(i=head;i!=null;i=i.next){
			System.out.print(i.data+" ");
		}
	}
	public static void rev(Node rev){
		if(rev==null){
			return;
		}
		rev(rev.next);
		System.out.print(rev.data+" ");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n>0){
			int val=sc.nextInt();
			insertEnd(val);
			n--;
		}
		printList();System.out.println();
		Node temp = head;
		rev(temp);
		sc.close();
	}
}
