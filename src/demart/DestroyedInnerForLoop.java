package demart;

public class DestroyedInnerForLoop {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("ajay");
			
			for (int j = 0; j < arr.length; j++) {
				for (int j2 = 0; j2 < arr.length; j2++) {
					if (arr[j]==arr[j2] & i==0) {
						break;
					}
				}
			}
		}
		breakFromNestedLoop();
	}
	 public static void breakFromNestedLoop(){
	        for(int i=0; i<6; i++){
	            
	            for(int j=0; j<3; j++){                
	                int product = i*j;
	                
	                if(product > 4){
	                    System.out.println("breaking from nested loop using return");
	                    return;
	                }                
	            }
	        }
	        System.out.println("Done");
	    }
}
