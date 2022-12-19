package bajaj;

public class MultiThredDemo {
	    int counter = 1;
	    static int N=100;

	    public static void main(String[] args) {
	       
	        MultiThredDemo demo = new MultiThredDemo();
	        Thread t1 = new Thread(new Runnable() {
	            public void run() {
	                demo.printEvenNumber();
	            }
	        });
	        Thread t2 = new Thread(new Runnable() {
	            public void run() {
	                demo.printOddNumber();
	            }
	        });
	        t1.start();
	        t2.start();
	    }

	    public void printOddNumber() {

	        synchronized (this) {
	            while (counter < N) {
	                while (counter % 2 == 0) {
	                    try {
	                        wait();
	                    } catch (InterruptedException e) {
	                        e.printStackTrace();
	                    }
	                }
	                System.out.print(counter + " ");
	                counter++;
	                notify();
	            }
	        }
	    }

	    public void printEvenNumber() {
	        synchronized (this) {
	            while (counter < N) {
	                while (counter % 2 == 1) {
	                    try {
	                        wait();
	                    } catch (InterruptedException e) {
	                        e.printStackTrace();
	                    }
	                }
	                System.out.print(counter + " ");
	                counter++;
	                notify();
	            }
	        }
	    }
	}
