import java.io.IOException;


public class Main {
	
	public static void main(String[] args){
		console con = new console();
		
		try {
			con.runConsole();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
