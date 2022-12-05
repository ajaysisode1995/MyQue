package bajaj;

public class SquareCubePattern {
		public static void main(String[] args) {
			 int lines=5;  
			  int i=1;  
			  int j;  
			    for(i=1;i<=lines;i++){// this loop is used to print the lines  
			        for(j=1;j<=i;j++){// this loop is used to print lines  
			            System.out.print(i*j+" "); 
			            for (int j2 = 0; j2 <=j; j2++) {
							System.out.print(i*j*j2);
						}
			        }  
			         System.out.println("");  
			    }  
}
}