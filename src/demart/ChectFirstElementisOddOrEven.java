package demart;

import java.util.Arrays;
import java.util.List;

public class ChectFirstElementisOddOrEven {
	public static void main(String[] args) {
		
		List<Integer> asList = Arrays.asList(17,2,3,4,5,6,7);
		
		asList.stream().findFirst().filter(x->{
			if (x%2==0) {
				System.out.println("number is even::"+x);
			}
			else {
				System.out.println("number is odd::"+x);
				return true;
			}
			return false;
		});
	}
}
