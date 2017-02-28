import java.net.*;
public class PortThread extends Thread{
	
private String host;
private int port;
	

	@Override
	public void run() {
		try{
			Socket socket = new Socket(host, port);
			System.out.println("Port " + port + " is open...!");
			socket.close();
			return;
		} catch (Exception e) {
			System.out.println("Port " + port + " is closed...!");
		}
		
	}
	
	
	public PortThread(String host, int port){
		this.host = host;
		this.port = port;
	}
	

}
