package bajaj;

public class LoopTest {
	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a.length; j++) {
				
				for (int j2 = 0; j2 < a.length; j2++) {
					
					if (a[j]*a[j2]==a[0]) {
						break;
					}
					
				}
				
			}
			
		}
	}
}

