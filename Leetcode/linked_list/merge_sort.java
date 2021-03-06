package linked_list;

import java.util.Arrays;

import datastructure.ListNode;

public class merge_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1=new ListNode(Integer.MIN_VALUE);
		ListNode l2=new ListNode(Integer.MIN_VALUE);
		ListNode l3=new ListNode(Integer.MIN_VALUE);
		ListNode l1_start=l1;
		ListNode l2_start=l2;
		ListNode l3_start=l3;
		// l1={ 1,3,5,7,9} l2={2,4,6,8,10,15,17}
		l1.next=new ListNode(1);
		l1=l1.next;
		l1.next=new ListNode(3);
		l1=l1.next;
		l1.next=new ListNode(5);
		l1=l1.next;
		l1.next=new ListNode(7);
		l1=l1.next;
		l1.next=new ListNode(9);
		l1=l1.next;
		l1=l1_start;
		
		
		l2.next=new ListNode(2);
		l2=l2.next;
		l2.next=new ListNode(4);
		l2=l2.next;
		l2.next=new ListNode(6);
		l2=l2.next;
		l2.next=new ListNode(8);
		l2=l2.next;
		l2.next=new ListNode(10);
		l2=l2.next;
		l2.next=new ListNode(15);
		l2=l2.next;
		l2.next=new ListNode(17);
		l2=l2_start;
		
		ListNode result=merge(l1.next, l2.next);
		while(result!=null){
			System.out.println(result.val);
			result=result.next;
		}
		
		
		String[] str={"231","213","132","123"};
		Arrays.sort(str);
		for(String x:str){
		System.out.println(x);
		}
		
		
		
		l3.next=new ListNode(4);
		l3=l3.next;
		l3.next=new ListNode(2);
		l3=l3.next;
		l3.next=new ListNode(5);
		l3=l3.next;
		l3.next=new ListNode(1);
		l3=l3.next;
		l3.next=new ListNode(8);
		l3=l3.next;
		l3.next=new ListNode(6);
		l3=l3.next;
		l3.next=new ListNode(0);
		l3=l3.next;
		l3.next=new ListNode(-2);
		l3=l3.next;
		l3=l3_start;
		
		ListNode result2=MergeSort(l3.next);
		while(result2!=null){
			System.out.println("sorting "+result2.val);
			result2=result2.next;
		}
		
	}
	
	public static ListNode MergeSort(ListNode head){
		if((head==null)||(head.next==null)){
            return head;
        }
		
		ListNode start=new ListNode(Integer.MIN_VALUE);
		start.next=head;
		ListNode slow=head;
		ListNode fast=head.next;
		
		while(fast.next!=null){
			slow=slow.next;	
			fast=fast.next;
			if(fast.next!=null){
				fast=fast.next;
			}
		}
		/*
		while(fast!=null && fast.next!=null){
			slow=slow.next;	
			fast=(fast.next).next;
		}*/
		ListNode right=slow.next;
		slow.next=null;
		ListNode left=head;
		
		return merge(MergeSort(left),MergeSort(right));
		
		
		
	}

	public static ListNode merge(ListNode a, ListNode b){
		
		ListNode list=new ListNode(Integer.MIN_VALUE);
		ListNode head=list;
		
		while(a!=null && b!=null){
			
			if(a.val<=b.val){
				
				list.next=new ListNode(a.val);
				a=a.next;
				list=list.next;
			}
			else{
				
				list.next=new ListNode(b.val);
				b=b.next;
				list=list.next;
			}
		}
		
		if(a==null)
			list.next=b;
		else
			list.next=a;
		
		
		return head.next;
	}
}
