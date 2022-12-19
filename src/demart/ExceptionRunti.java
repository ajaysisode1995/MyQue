package demart;

public class ExceptionRunti {
	public void m1() throws ArithmeticException {
		int x=10;
		System.out.println(x);
		System.out.println(10/0);
	}
	public static void main(String[] args) {
		ExceptionRunti e1=new ExceptionRunti();
		e1.m1();
	}
}
