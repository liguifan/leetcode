package arraylist;

import java.util.ArrayList;
import java.util.Stack;

import datastructure.ListNode;

public class Reverse_array {
	public static void main(String[] args) {
		//ArrayList<Integer> list=new ArrayList<Integer>();
		ArrayList<Integer> arraylist=new ArrayList<Integer>();
		arraylist.add(1);
		arraylist.add(2);
		arraylist.add(3);
		
		//permutation(list,arraylist);
		
			
			
			
		int[] array={1,2,3,4,5};
		//array={1,2,3,4,5};
		for(int x:array){
		//System.out.println(x);
		}
		
		Stack<Integer> s=new Stack<Integer>();
		s.push(2);
		s.push(4);
		s.push(6);
		
		ListNode list=new ListNode(0);
		ListNode list_p=list;
		for(int i=1;i<6;i++){
			list.next=new ListNode(i);
			list=list.next;
		}
		
		list=list_p;
		while(list!=null){
			//System.out.println("test linklist"+list.val);
			list=list.next;
		}
		
		list=list_p;
		ListNode result=reverseList(list);
		
		
		//ListNode result=reverseBetween(list, 1, 6);
		while(result!=null){
			System.out.println("reverse "+result.val);
			result=result.next;
		}
		}

	
	
	
	
	public static ListNode reverseList(ListNode head){
		ListNode start=new ListNode(0);
		start.next=head;
		
		ListNode prev=null;
		ListNode curr=head;
		ListNode next=curr.next;
		while(curr!=null){
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		
		return prev;
	}
	
}
