package demart;

import java.util.HashMap;
import java.util.Map;

public class ImmutableTest {

	public static void main(String[] args) {
		//creating map object to map reference to hashmap
		Map<String, String> map=new HashMap<>();
		map.put("11", "Ajay");
		map.put("12", "vijay");
		map.put("13", "akash");
		
		ImmutableDemo demo=new ImmutableDemo("Vaibhav", 101, map);
		
		// Calling the above methods 1,2,3 of class1
        // inside main() method in class2 and
        // executing the print statement over them
		
		System.out.println(demo.getMetadata());
		
		
	}
}
