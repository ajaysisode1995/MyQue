package demart;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MergeHashMeapTest {
	public static void main(String[] args) {
		Map<String, String> f = new HashMap <String, String> (); 
        f.put("FN", "FIRSTNAME");
        f.put("MN", "MIDDLENAME");
        f.put("LN", "LASTNAME");
        f.put("CT", "CITYNAME");
        f.put("ST", "STATENAME");
        
        Map<String, String> d  = new HashMap <String, String> ();
   
        d.put("FN", "QUIN");
        d.put("LN", "STREET");
        d.put("CT", "PUNE");
        
        
        Map<String, String> map3=new HashMap<>(f);
        map3.putAll(d);
        Set<Entry<String,String>> entrySet = map3.entrySet();
        Iterator<Entry<String, String>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
			
			
			
		}
        	
        }
	}

