package demart;

public class SingleTonDemo {

	private static SingleTonDemo instance=null;

	private SingleTonDemo() {
				
	}
	private static SingleTonDemo getInsatnce() {
		if (instance==null) {
			return instance=new SingleTonDemo();
		}
		return instance;
	}
	public static void main(String[] args) {
		SingleTonDemo t=new SingleTonDemo();
		System.out.println(t.getInsatnce().hashCode());
		System.out.println("\n");
		//
		SingleTonDemo t2=new SingleTonDemo();
		System.out.println(t2.getInsatnce().hashCode());
		System.out.println("\n");
				//
		SingleTonDemo t3=new SingleTonDemo();
		System.out.println(t3.getInsatnce().hashCode());
	}
	
}
