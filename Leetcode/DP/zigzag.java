package DP;

public class zigzag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] test={  13, 2, 99, 2, 80, 79, 81, 80, 100, 19,   7, 5, 1000};
	int result=zigzag_find(test);
	System.out.println(result);
		
	}
	
	
	public static int zigzag_find(int a[]){
		if(a.length==1)
			return 1;
		int len=0;
		int[] d=new int[a.length];
		int flag=0;
		if(a[0]-a[1]>0)	flag=1;
		else	flag=-1;
		d[0]=1;
		d[1]=2;
		
		for(int i=1;i<a.length;i++){
			for(int j=0;j<i;j++){
				
				System.out.println("i is "+i+" j is "+j);
				
				System.out.println(" d["+i+"]="+d[i]+" d["+j+"]+1="+(d[j]+1));
				if((a[i-1]-a[i])*flag<0 && d[i]<d[j]+1){
					d[i]=d[j]+1;
				}
				if(d[i]>len) len=d[i];
			}
			if(a[i-1]-a[i]>0)	flag=1;
			else	flag=-1;
			
		}
		return len;

	}
		
}