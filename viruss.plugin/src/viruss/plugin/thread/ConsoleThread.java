package viruss.plugin.thread;

public class ConsoleThread implements Runnable {

	
	@Override
	public void run() {
		System.out.println("thread " + this + " working");
	}
	
	
	
	

}
