import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;



public class console {
	
	console(){
		
	}
	
	
	public void runConsole() throws IOException{
		int exit = 0;
		String read;
		while(exit == 0){
			System.out.println("Do you wish to write a memo(w), read a memo(r), or exit(e)");
			Scanner scn = new Scanner(System.in);
			read = scn.nextLine();
			
			if(read.equalsIgnoreCase("w")){
				System.out.println("Write out your memo");
				Scanner scnMemo = new Scanner(System.in);
				
				String inp = scnMemo.nextLine();
				
				Memo mem = new Memo();
				mem.writeMemo(inp);
				System.out.println("Please enter the name of the file");
				String fileName = scnMemo.nextLine();
				try {
					ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName + ".mem"));
					
					out.writeObject(mem);
					out.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			} else if (read.equalsIgnoreCase("r")){
				String current = new java.io.File( "." ).getCanonicalPath();
				File folder = new File(current);
				File[] listOfFiles = folder.listFiles();
				
				for (File file : listOfFiles) {
				    if (file.isFile()) {
				        System.out.println(file.getName());
				    }
				}
				
				System.out.println("write which memo you want opened");
				Scanner scnRead = new Scanner(System.in);
				String fileName = scnRead.nextLine();
				
				try {
					FileInputStream in = new FileInputStream(fileName);
					
					ObjectInputStream readObj = new ObjectInputStream(in);
					Memo memRead = (Memo) readObj.readObject();
					
					System.out.println(memRead.getMemo());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			} else if (read.equalsIgnoreCase("e")){
				exit = 1;
			} else {
				System.out.println("\n\nSorry, you entered incorrect, please try again.");
			}
		}
	}

}
