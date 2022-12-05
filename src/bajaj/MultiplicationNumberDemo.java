package bajaj;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultiplicationNumberDemo {
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> collect = asList.stream().map(x->{
			x=x*2;
			return x;
		}).collect(Collectors.toList());
		
		collect.forEach(x->System.out.println(x));
	}
}
