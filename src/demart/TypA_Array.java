package demart;

public class TypA_Array {
	 public static void main(String[] args) {
	        
	        int [] array= {1,2,3,4,6,5,6,7,8};
	        
	        int temp=0;
	       // System.out.println(array.length/2);
	        for(int i=1;i<array.length/2;i=i+2) {
	           // System.out.println(array[i]);
	            temp=array[i];
	            System.out.println(array[array.length-i]);
	           // array[i]=array[array.length-i];
	            
	       
	        // temp =array[array.length-i];
	        // System.out.println(temp);
	          }
	        
//	        for(Integer a1:array) {
//	        	System.out.print(a1+" ");
//	        }
        }
}