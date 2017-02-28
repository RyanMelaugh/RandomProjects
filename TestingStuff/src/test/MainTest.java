package test;

import java.io.IOException;

public class MainTest {

	public static void main(String[] args) throws IOException{
		//PrintText p = new PrintText();
		//p.printToTextFile();
		PythonHomework p = new PythonHomework();
		System.out.println("Case 1 (true)");
		p.test(p.correct);
		
		System.out.println("\nCase 2 (false)");
		p.test(p.incorrect0);
		
		System.out.println("\nCase 3 (false)");
		p.test(p.incorrect1);
		
		System.out.println("\nCase 4 (false)");
		p.test(p.incorrect2);
		
		System.out.println("\nCase 5 (false)");
		p.test(p.incorrect3);
		
	}

}
