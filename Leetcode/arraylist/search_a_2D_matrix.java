package arraylist;

public class search_a_2D_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr={1,2,3,4,5,6,7};
		
		boolean result=binary_search(arr, 8, 0, arr.length-1);
		
		System.out.println(result);
	}
	
	
	public static boolean search_matrix(int[][] matrix){
		
		for(int i=0;i<=matrix.length-1;i++){
			
		}
		
		
		
		
		return 
	}
	
	
	public static boolean binary_search(int[] arr,int key, int a, int b){
		int mid=(a+b)/2;
		
//		System.out.println("len is "+len+" n is "+n);
		
		if(a>b){
			return false;
		}
		else if (key==arr[mid]) {
			return true;
		}
		
		else if(key<=arr[mid]){
			return binary_search(arr, key, a, mid-1);
		}
		else{
			return binary_search(arr, key, mid+1, b);
		}	
		
	}

}
