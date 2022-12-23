package demart;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MaxOccuringElement {
	public static void main(String[] args) {


List<String> list = 
	Arrays.asList
	("pineapple", "orange", "pineapple", "guava", "apple", "orange", "apple", "apple");
	
	
	
	
	
	
    
//  
   Set<String> collect = list.stream()
   .collect(Collectors.groupingBy(Function.identity()
           , Collectors.counting()))    
   .entrySet().stream()                
   .filter(m -> m.getValue()>2)       
   .map(Map.Entry::getKey)
   .collect(Collectors.toSet());
   
   collect.forEach(x->System.out.println(x));

//Set<String> collect1 = list
//.stream()
//.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
//.entrySet()
//.stream()
//.filter(entry->{
//	if (entry.setValue(entry.)) {
//		
//	}
//	return true;
//})
//.map(Map.Entry::getKey)
//.collect(Collectors.toSet());
//
//
//
//collect1.forEach(x->System.out.println(x));
	}
}
