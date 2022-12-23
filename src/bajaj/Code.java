package bajaj;

public class Code {
	 public static void main(String[] args) {
	        int[] a = {2,4,1,5};
	        int[] result = new int[a.length];
	        int j=0;
	        for(int i=0;i<a.length;i++) {
	            System.out.print(a[i]+ " " );
	        }
	        while(j<a.length) {
	        	 int product = 1;
	            for(int i=0;i<a.length;i++) {
	                if(i==j)
	                    continue;
	                else {
	                    product *= a[i];
	                }
	            }
	            result[j] = product;
	            j++;
	        }
	        System.out.println();
	        for(int i=0;i<result.length;i++) {
	            System.out.print(result[i]+ " " );
	        }
	    }
}
