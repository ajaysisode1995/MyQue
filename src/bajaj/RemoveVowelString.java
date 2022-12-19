package bajaj;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveVowelString {
	public static void main(String[] args) {
		String str1="Hi am learning spring auth2";
		
		
		 Map<Character,Long> collect = str1
		 .chars()
		 .mapToObj(x->(char)x)
		 .map(x->x)
		 .collect(Collectors
		.groupingBy(x->x,Collectors.counting()));
		 
		 collect.forEach((x,y)->{
			 if (x=='a' || x=='e' || x=='i'|| x=='o'||x=='u'||x==' ') {
				//System.out.println();
			}
			else {
				 System.out.println(x+":"+y);
			}
		 });

			
		
		
		
		
	}
}
