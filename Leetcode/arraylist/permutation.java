package arraylist;

import java.util.ArrayList;

public class permutation {
public static void main(String[] args){
		
		Permu("","abc");
		System.out.println(list);
        
		
		ArrayList<ArrayList<Integer>> test=new ArrayList<ArrayList<Integer>>();
		
		
		int[] num={1,2,3};
		test=permute(num);
		System.out.println(test);
       
	}
	static ArrayList<String> list=new ArrayList<String>();
	public static void Permu(String prefix,String str){
        if(str.length()==0){
            list.add(prefix);
            //System.out.println(prefix);
        }
        
        for(int i=0;i<str.length();i++){
            
            Permu(prefix+str.charAt(i),str.substring(0,i)+str.substring(i+1,str.length())); 
        }
    }
	
	public static ArrayList<ArrayList<Integer>> permute(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        return permuteHelper(num, 0);
    }
    
    public static ArrayList<ArrayList<Integer>> permuteHelper(int num[], int index){
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(index == num.length - 1){
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(num[index]);
            result.add(list);
            return result;
        }else{
            ArrayList<ArrayList<Integer>> partial = permuteHelper(num, index + 1);
            for(ArrayList<Integer> list: partial){
                for(int i = 0; i <= list.size(); i++){
                    ArrayList<Integer> tmp = new ArrayList<Integer>(list);
                    tmp.add(i, num[index]);
                    result.add(tmp);
                }
            }
            return result;
        }
    }

}
