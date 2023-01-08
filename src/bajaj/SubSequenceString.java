package bajaj;

public class SubSequenceString {
	public static void main(String[] args) {
		String str1="abababababababa";
        String  str2 = "ab";
        
        int lastIndex = 0;
        int count = 0;
        //count subsequence
        System.out.println(str1.split(str2, -1).length-1);
        
        //count
        while(lastIndex!=-1) {
        	lastIndex=str1.indexOf(str2, lastIndex);
        	if (lastIndex!=-1) {
        		
				count++;
				lastIndex+=str2.length();
			}
        }
        System.out.println(count);
	}
}
