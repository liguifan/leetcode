package perceptron;

import java.util.ArrayList;

public class PerceptronAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public ArrayList<Double> getWeightVector(ArrayList<ArrayList<Double>> data, ArrayList<Double> test) {
				int length=0;
				if(data==null)
					return null;
				else{
					length=data.get(0).size();
				}
				int bias=6;
				ArrayList<Double> weightVector = new ArrayList<Double>();   
		        for(int i = 0; i <= length-1; i++) {  
		            weightVector.add(1d);  
		        } 
		        int sign;
		        double lamda=0.5;
		        int T=100;
		        double result=0;
		        for(int iter=0;iter<=T-1;iter++){
		        	for(int m=0;m<=data.size()-1;m++){
		        		for(int j=0;j<=data.get(0).size()-1;j++){
		        			 result=(int) (data.get(m).get(j)*weightVector.get(j));
		        		}
		        			if(result>bias){
		        				sign=1;
		        			}else{
		        				sign=-1;
		        			}
		        		for(int k=0;k<=length-1; k++){
		        			weightVector.set(k,weightVector.get(k)+ lamda*(test.get(m)-sign)*data.get(m).get(k));			
		        		}
		        	}
		        }
		        return weightVector;
}
	
}
