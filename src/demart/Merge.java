package demart;

import java.util.HashMap;

public class Merge {
	public static void main(String[] args) {
		HashMap<Integer, String> firstMap = new HashMap<>();
		firstMap.put(1, "A");
		firstMap.put(2, "B");
		firstMap.put(3, "C");
		firstMap.put(4, "D");

		//map 2
		HashMap<Integer, String> secondMap = new HashMap<>();
		secondMap.put(4, "F"); //It will replace D with F
		secondMap.put(5, "G"); //A new pair to be added
		
		HashMap<Integer, String> thirdMap = new HashMap<>();
		for(int i=0;i<=6;i++) {
			firstMap.containsValue(secondMap);
			
		}
		
		System.out.println(thirdMap);
	}
}
