package others;

public class gas_station {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] a={1,0};
		int[] b={2,1};
		int result=canCompleteCircuit(a,b);
		System.out.println(result);
	}
	
	public static int canCompleteCircuit(int[] gas, int[] cost) {
        int j;
        int flag;
        int begin=0;
        if(gas.length==1){
            if(gas[0]-cost[0]>=0)
                return 0;
            else
                return -1;
        }
                
        for(int i=0;i<gas.length;i++){
            int gas_left=0;
            begin=i;
            flag=1;
            for(j=i;(j+1)%gas.length!=i;j++){
                j=j%gas.length;
              
                gas_left+=gas[j];
                gas_left-=cost[j];
                if(gas_left<0)
                    flag=-1;
            }
            if(flag==1)
                return begin;
        }
        return -1;
        //return total_sum>=0?position+1:-1;
    }
	
	public static int canCompleteCircuit2(int[] gas, int[] cost) {
	       int temp_sum=0;
	       int total_sum=0;
	       int position=-1;
	       
	       for(int i=0;i<gas.length;i++){
	           temp_sum+=gas[i]-cost[i];
	           total_sum+=gas[i]-cost[i];
	           
	           if(temp_sum<0){
	               position=i;
	               temp_sum=0;
	           }
	           
	       }
	       
	       return total_sum>=0?position+1:-1;
	    }
}
