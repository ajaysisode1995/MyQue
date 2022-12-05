package bajaj;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayQue {
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(2,4,1,5);
		
		List<Integer> collect = asList.stream().skip(1).sorted().collect(Collectors.toList());
		collect.forEach(x->System.out.println(x));
	}
}
