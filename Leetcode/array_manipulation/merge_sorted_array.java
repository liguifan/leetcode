package array_manipulation;

public class merge_sorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,3,5,7,9,0,0,0,0,0,0,0,0};
		int[] b={2,4,6,8,10,11,12,13};
		merge(a, 5, b, b.length);
		//System.out.println(b[4]);
		for(int x:a){
			System.out.println(x);
		}
	}
	
	
	public static void merge(int A[], int m, int B[], int n) {
		//This can be optimized greatly
        int[] C=new int[m+n];
		int i=0;
		int j=0;
		int k=0;
		
		if(A.length==0){
		    A=B;
		    return;
		    
		    }
		if(B.length==0){
		    //Do nothing;
                return;
		}
		while(j<m && k<n){
			
			if(A[j]<=B[k]){
				C[i++]=A[j++];
	
			}else
			{
		
				C[i++]=B[k++];
				
			}
		}
		while(j<m){
			C[i++]=A[j++];
		}
		while(k<n)
		{
			C[i++]=B[k++];
			System.out.println("liguifan");
		}
		
		A=C;
		for(int x:C){
			System.out.println("new "+x);
		}
    }
	
	public static void merge2(int A[], int m, int B[], int n) 
	{
	        int curi = m + n - 1;
	        int ia = m - 1;
	        int ib = n - 1;
	        while(ia >= 0 && ib >= 0) {
	                if(A[ia] >= B[ib]) {
	                        A[curi--] = A[ia--];
	                } else {
	                        A[curi--] = B[ib--];
	                }
	        }
	        while (ib >= 0) {
	                A[curi--] = B[ib--];
	        }
	}

}
