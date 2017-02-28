package main;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int length = 0;
		int truelength = 1;
		String pass = "";
		
		while(length != truelength){
			System.out.print("Input password: ");
			pass = in.next();
			truelength = pass.length();
		
			System.out.print("Input password length: ");
			length = in.nextInt();
			
			if(length != truelength){
				System.out.println("Password length incorrect. Please try again. \n");
			}
		}
		
		System.out.print("Would you like the system to show you all the passwords it tries? (Y/N)");
		String ans = in.next();
		
		System.out.println("\n");
		
		boolean print = false;
		
		if(ans.equalsIgnoreCase("Y") || ans.equalsIgnoreCase("yes")){
			print = true;
		}
		
		Cracker c = new Cracker (pass, length, print);
		c.crackingList();
		
		in.close();
		
	}

}
