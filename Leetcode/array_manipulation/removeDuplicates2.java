package array_manipulation;

public class removeDuplicates2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] a={1,1,};
			int result=remove_dup(a);
			System.out.println(result);
	}
	
	public static int remove_dup(int a[]){
		int m=0;
		int s=1;
		int count=0;
		while(s<=a.length-1){
			if(a[m]==a[s]){
				count=1;
				m++;
				a[m]=a[s];
			}
			while(s<=a.length-1 ){
				if(a[s]==a[m]){
					s++;
				}
				else
					break;
			}
			if(m+1<=a.length-1 && s<=a.length-1){
			a[m+1]=a[s];
			m++;
			s++;
			count=0;
			}			
		}
		return m+1;
}
	public static int removeDuplicates(int A[], int n) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        if(n <= 2)
            return n;
        int cur = 1;
        for(int i = 2; i < n; i++)
        {
            if(!(A[i] == A[cur] && A[i] == A[cur - 1]))
                A[++cur] = A[i];
        }
        return cur+1;
    }
	}
