package bajaj;

public class StringTest {
	public static void main(String[] args) {
		String  str="abababababa";
		int l = str.length();
		
		int countOccurrences = countOccurrences(str, l);
		System.out.println(countOccurrences);
//		String[] s = str.split("");
//		for (int i = 0; i < s.length; i++) {
//			int count=0;
//			for (int j = 0; j < s.length; j++) {
//				if (s[i].equals(s[j])) {
//					count++;
//					s[j]="0";
//				}
//			}
//			if (count>1 && s[i]!="0" ) {
//				System.out.println(s[i]+"::"+count);
//			}
//		}
		
	}
	static int countOccurrences(String s, int K)
    {
        int n = s.length();
        int C = 0, c1 = 0, c2 = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'a')
                c1++; // Count of 'a's
            if (s.charAt(i) == 'b') {
                c2++; // Count of 'b's
 
                // occurrence of "ab"s
                // in string S
                C += c1;
            }
        }
 
        // Add following two :
        // 1) K * (Occurrences of "ab" in single string)
        // 2) a is from one string and b is from other.
        return C * K + (K * (K - 1) / 2) * c1 * c2;
    }
 
}
