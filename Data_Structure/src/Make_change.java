
public class Make_change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=makechange(10);
		System.out.println(x);
		
		
	}
	// Agile Bank of American
	//Quartz platform 
	
	
	public static int makechange(int x){
		if(x<0) return 0;
//		if(x==0) return 0;
		if(x==1) return 1;
		return makechange(x-5)+makechange(x-2)+makechange(x-1);
	}
	
	
	public static int fac(int x){
		if(x==1) return 1;
		return x*fac(x-1);
	}

}
