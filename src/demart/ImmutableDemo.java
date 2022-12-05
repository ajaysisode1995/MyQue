package demart;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class ImmutableDemo {
	// member attribute of an immutable class 
	private final String name;
	private final int rollNo;
	private final Map<String, String > metadata;
	public ImmutableDemo(String name, int rollNo, Map<String, String> metadata) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		//creating, map of temp object
		Map<String, String> tempMap=new HashMap<>();
		
		for(Entry<String, String> entry:metadata.entrySet()) {
			tempMap.put(entry.getKey(), entry.getValue());
		}
		
		this.metadata=tempMap;
	}
	
	public String setName() {
		return name;
	}
	
	public int setRollNo() {
		return rollNo;
		
	}
	
	public Map<String, String> getMetadata(){
		//creating, map of temp object
				Map<String, String> tempMap=new HashMap<>();
				
				for(Entry<String, String> entry:this.metadata.entrySet()) {
					tempMap.put(entry.getKey(), entry.getValue());
				}
				
		return tempMap;
		
	}
	
	
	

	
	
	
	
}
