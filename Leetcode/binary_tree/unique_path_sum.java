package binary_tree;

public class unique_path_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=14,n=10;
		 int sum=factorial(5);
	    System.out.println((factorial(36)));
	}
	
	public static int pathcal(int m,int n,int x,int y){
        if(x==m && y==n)
            return 1;
       
        if(x==m)
            return pathcal(m,n,x,y+1);
            
        if(y==n)
            return  pathcal(m,n,x+1,y);
            
        else
            return pathcal(m,n,x+1,y)+pathcal(m,n,x,y+1);
    }
	
	 public static int factorial(int n){
         int fac=1;
     for(int i=1;i<n+1;i++){
         fac=fac*i;
     }
     return fac;
 }

}
