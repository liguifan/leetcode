package linked_list;

import datastructure.ListNode;

public class add_two_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a=new ListNode(Integer.MIN_VALUE);
		ListNode b=new ListNode(Integer.MIN_VALUE);
		ListNode h1=a;
		ListNode h2=b;
		a.next=new ListNode(2);
		a=a.next;
		a.next=new ListNode(4);
		a=a.next;	
		a.next=new ListNode(3);
		a=a.next;
		
		b.next=new ListNode(5);
		b=b.next;
		b.next=new ListNode(6);
		b=b.next;
		b.next=new ListNode(4);
		b=b.next;

		
		
		ListNode re=add_two(h1.next, h2.next);
		
		while(re!=null){
			System.out.println(re.val);
			re=re.next;
		}
	}
	
	
	public static ListNode add_two(ListNode a,ListNode b){
		ListNode p1=a;
		ListNode p2=b;
		ListNode p3=new ListNode(Integer.MIN_VALUE);
		ListNode head=p3;
		
		while(p1.next!=null && p2.next!=null){
			p3.next=new ListNode(p1.val+p2.val);
			p3=p3.next;
			p1=p1.next;
			p2=p2.next;
		}
		
		// because here we use p1.next and p2.next. so the while loop will not account for the last
		// node of p1 and p2
		p3.next=new ListNode(p1.val+p2.val);
		p3=head.next;
		
		
		
		if(p1.next==null){
			p1.next=p2.next;
		}
		if(p2.next==null){
			p2.next=p1.next;
		}
		
		p3=head.next;
		while(p3!=null){
			if(p3.val>=10){
				p3.val=p3.val-10;
				if(p3.next!=null){
					p3.next.val=p3.next.val+1;
				}
				else{
					p3.next=new ListNode(1);
				}
			}
			p3=p3.next;
		}
		
		return head.next;
		
		
	}

}
