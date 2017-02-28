package test;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PrintText {
	public void printToTextFile() {
		 FileWriter fstream;
		try {
			fstream = new FileWriter("data.txt");
			 BufferedWriter out = new BufferedWriter(fstream);
			 out.write("Hello, This is what I've written");
			 out.newLine();
			 out.write("Its a test!");
			 out.flush();
			 out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
