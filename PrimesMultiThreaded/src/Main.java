
public class Main {
	public static int threadCount = 4;
	public static int stop = 800000;
	public static void main(String[] args){
		
		String host = "localhost";
		for(int i = 1; i <=1000; i++){
			PortThread t = new PortThread(host, i);
			t.start();
		}
		
	}
	
}
