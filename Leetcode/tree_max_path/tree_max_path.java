package tree_max_path;

import datastructure.TreeNode;



public class tree_max_path {
	static int max=Integer.MIN_VALUE;
		public static void main(String args[]){
			
			TreeNode root=new TreeNode(-10);
			//root.left=new TreeNode(-22);
			//root.right=new TreeNode(-3);
			
			max_path(root);
			System.out.println("dfd"+max);
		}
		
		
		public static int max_path(TreeNode root){
			if(root==null)
	            return 0;
	        
	        
	        int left=max_path(root.left);
	        int right=max_path(root.right);
	        System.out.println(left);
	        int m=root.val;
	        if(left>=0)
	            m=m+left;
	        if(right>=0)
	            m=m+right;
	        
	        if(m>max)
	            max=m;
	        
	        return Math.max(left,right)>0?root.val+Math.max(left,right):root.val;
		}
}
