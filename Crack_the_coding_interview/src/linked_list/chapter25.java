package linked_list;

import datastructure.ListNode;

public class chapter25 {
	public static void main(String[] args) {
		ListNode a=new ListNode(Integer.MIN_VALUE);
		ListNode a_s=a;
		a.next=new ListNode(9);
		a=a.next;
		a.next=new ListNode(1);
		a=a.next;
		a.next=new ListNode(2);
		a=a.next;
		int result=linktoint(a_s.next);
		System.out.println(result);
		
	}
	
	public static int linktoint(ListNode head){
		int sum=0;
		ListNode p=new ListNode(Integer.MIN_VALUE);
		p.next=head;
		p=p.next;
		while(p!=null){
			sum=p.val+10*sum;
			p=p.next;
		}
		
		return sum;
		
	}
	
}
