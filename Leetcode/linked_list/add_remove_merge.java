package linked_list;

import datastructure.ListNode;

public class add_remove_merge {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head=new ListNode(Integer.MIN_VALUE);
		ListNode start=head;
		for(int i=0;i<5;i++){
			head.next=new ListNode(i+1);
			head=head.next;
			
		}
		head=start;
		head=head.next;
		while(head!=null){
			System.out.println(head.val);
			head=head.next;
		}
		head=start;
		ListNode result=removeLast(head.next);
		
		while(result!=null){
			System.out.println("result "+result.val);
			result=result.next;
		}
	}
	
	// Remove last has some bug because of head=null is not correct ?
	public static ListNode removeLast(ListNode head){
		ListNode prev=null;
		ListNode start=new ListNode(Integer.MIN_VALUE);
		start.next=head;
		if(head==null)
			return null;
		if(head.next==null)
			return null;
		else
		{
			while(head.next!=null){
				prev=head;
				head=head.next;
			}
		}
		prev.next=null;
		return start.next;
	}
	
	public static ListNode addLast(ListNode head,int x){
		ListNode start=new ListNode(Integer.MIN_VALUE);
		start.next=head;
		head=start;
		while(head.next!=null){
			head=head.next;
		}
		System.out.println("test value "+head.val);
		head.next=new ListNode(x);
		return start.next;
	}
}
