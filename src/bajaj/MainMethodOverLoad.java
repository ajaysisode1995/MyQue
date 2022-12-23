package bajaj;

public class MainMethodOverLoad {
	public static int main(int[] args) {
		System.out.println("ajay");
		return 0;
	}
	public static void main(Integer[] args) {
		System.out.println(1+1);
		System.out.println("Sagar");
	}
	public static void main(String[] args) {
		System.out.println("main method overriding is not possible");
	}
}
