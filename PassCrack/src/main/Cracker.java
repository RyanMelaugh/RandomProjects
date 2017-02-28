package main;

import java.util.ArrayList;

public class Cracker {
	
	private String[] ALL = {"A", "a", "B", "b", "C", "c", "D", "d", "E", "e", "F", "f", "G", "g", "H", "h", "I", "i",
	                        "J", "j", "K", "k", "L", "l", "M", "m", "N", "n", "O", "o", "P", "p", "Q", "q", "R", "r",
	                        "S", "s", "T", "t", "U", "u", "V", "v", "W", "w", "X", "x", "Y", "y", "Z", "z", "0", "1", 
	                        "2", "3", "4", "5", "6", "7", "8", "9"};
	private String password;
	private int passlength;
	private Boolean printpass;
	private String cracked;
	
	
	Cracker(String pass, int passlen, Boolean print){
		this.password = pass;
		this.passlength = passlen;
		this.printpass = print;
		this.cracked = "";
		
		//this sets up cracked to the initial AAAA up to the length of the password
		for(int i = 0; i < passlen; i++){
			this.cracked += "A";
		}
		
	}
	
	public void crackingList(){
		for(int i = 0; i < passlength; i++){
			
			for(int c = 0; c < ALL.length; c++){
				String letter = ALL[c];
				
				if(cracked.equals(password)){
					System.out.print("Your password was cracked: " + cracked);
					break;
				}
				
				if(this.printpass = true){
					System.out.println(cracked);
				}
				
				String hold = cracked;
				int crackl = cracked.length();
				cracked = "";
				for(int m = 0; m < crackl; m++){
					if(m==i){
						cracked += letter;
					}else{
						cracked += hold.charAt(m);
					}
				}
				
				if(cracked.equals(password)){
					break;
				}
			}
			
		}
		
	}
		
}
