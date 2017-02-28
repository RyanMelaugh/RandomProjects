package testSerialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SaveObject {
	
	SaveObject(){
		
	}
	
	public void saveFile(objTest testObj){
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("testFile.efd"));
			
			out.writeObject(testObj);
			out.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public objTest loadFile(){
		try {
			FileInputStream in = new FileInputStream("testFile.efd");
			
			ObjectInputStream read = new ObjectInputStream(in);
			return (objTest) read.readObject();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
