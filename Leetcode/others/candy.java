package others;

public class candy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={2,2};
		
		int x=candy_count(a);
		System.out.println(x);
	}
	
	
	
	public static int candy_count(int[] rate){
		
		if(rate.length==0) return 0;
		if(rate.length==1) return 1;
		
		int[] candy=new int[rate.length];
		candy[0]=1;
		for(int i=0;i<=rate.length-2;i++){
			if(rate[i]<rate[i+1]){
				candy[i+1]=candy[i]+1;
			}else
				candy[i+1]=1;
		}
		
		for(int i=rate.length-2;i>=0;i--){
			if(rate[i]>rate[i+1]){
				candy[i]=Math.max(candy[i], candy[i+1]+1);
			}
		}
		
		int sum=0;
		for(int i=0;i<rate.length;i++){
			sum+=candy[i];
		}
		
		
		return sum;
	}

}
