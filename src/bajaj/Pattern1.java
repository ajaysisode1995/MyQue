package bajaj;

import java.util.ArrayList;
import java.util.List;

public class Pattern1 {
	public static void main(String[] args) {
		System.out.println("First way");
		for(int i=1;i<=4;i++) {
			System.out.printf("%d\s%d\s%d\s",i,i*i,i*i*i);
			System.out.println();
		}
		System.out.println("Second way");
		List list=new ArrayList<>();
		
		for(int i=1;i<=4;i++) {
			 list.add(i+" "+i*i+" "+i*i*i+" ");
			 
		}
		System.out.println(list);
	}
}
