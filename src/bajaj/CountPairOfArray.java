package bajaj;

public class CountPairOfArray {
	
	public static void main(String[] args){
		int[] a={1,2,8,9,11,12};
		  int pair=0;
		  
		  for(int i=0;i<a.length;i++){
		  	for(int j=0;j<a.length;j++){
		  		if(a[i]+a[j]==10){
				 pair++;
				 System.out.println(a[i]);
				}
		    }
		 }
		   System.out.println(pair);
		}
	}

