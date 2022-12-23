package bajaj;

import java.util.ArrayList;
import java.util.List;

public class RepeatedSubSequence {
	public static void main(String[] args) {
		 String str1="abababababababa";
         String  str2 = "ab";
         
         int lastIndex = 0;
         int count = 0;
        
     // First Way
//         System.out.println(lastIndex != -1);//true
//         while (lastIndex != -1) {
//             
//             lastIndex = str1.indexOf(str2, lastIndex);
            
//             System.out.println(lastIndex);
//
//             if (lastIndex != -1) {
//                 count++;
//                 lastIndex += str2.length();
//             }
//         }
        // System.out.println(count);
         
         //Second Way
       System.out.println("Count of occurrences of a substring recursively are: "+subsrting_rec(str1, str2));
    }
    static int subsrting_rec(String str1, String str2){
       if (str1.contains(str2)){
          return 1 + subsrting_rec(str1.replaceFirst(str2, ""), str2);
       }
       return 0;
//         
         //Third Way
         
          // System.out.println(str1.split(str2, -1).length-1);
           
           // Fourth Way
           
//           List<Integer> indices=new ArrayList<>();
//            while ((lastIndex= str1.indexOf(str2, lastIndex)) != -1 ){
//                count++;
//                indices.add(lastIndex);
//                lastIndex++;
//            }
//            System.out.println("Total occurrences of a substring in the given string: " + count);
//            System.out.println("Indices of substring are: "+indices);
            
            
            
        }
    
	}
         
    
    

