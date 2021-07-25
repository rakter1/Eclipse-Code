
public class ThreadingABC extends Thread{
	
	
	public void Run() {
		System.out.println("It is override method ");
		
	}
	
	
	
	public static void main(String[] args) {
		ThreadingABC abc = new ThreadingABC();
		abc.start();
	}
	
	

}
