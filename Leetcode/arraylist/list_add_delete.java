package arraylist;
import datastructure.ListNode;


public class list_add_delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode p=new ListNode(Integer.MIN_VALUE);
		ListNode head=p;
		
		for(int i=0;i<7;i++){
			p.next=new ListNode(i);
			p=p.next;
		}
		p=head.next;
		while(p!=null){
			System.out.println(p.val);
			p=p.next;	
		}
		p=head.next;
		ListNode prev=null;
		//delete the suitble element;
		while(p!=null){
			if(p.val==4){
				if(prev==null)
					head=head.next;
				else
					prev.next=p.next;
				
				break;
			}
			else{
				prev=p;
				p=p.next;
			}
		}
		p=head.next;
		while(p!=null){
			System.out.println("new"+p.val);
			p=p.next;	
		}
		
		
		
	}

}
