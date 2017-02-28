package eckalpse;

import java.util.Random;


//CHANGE TO INTERFACE
public class ActivityFULL {
	
	public ActivityFULL(){
		
	}
	
	/** A Generic sleep class, override for specific.*/	 
	public String genSleep(){
		String[] responses = {"Sl_1","Sl_2","Sl_3","Sl_4","Sl_5"};
		return genActivity(responses);
	}
	
	/** A Generic Hunger class. override for specific.*/
	public String genHunger(){
		String[] responses = {"re_1","re_2","re_3","re_4","re_5"};
		return genActivity(responses);
	}
	
	/** A Generic Entertainment class, override for specific.*/
	public String genEntertainment(){
		String[] responses = {"En_1","En_2","En_3","En_4","En_5"};
		return genActivity(responses);
	}
	
	public String genNSleep(){
		String[] responses = {"Sleeping soundly","Dreaming","Turning in sleep", "Softly snooring","Sleeping in bed"};
		return genActivity(responses);
	}

	
	/** Print method */
	public String genActivity(String[] responses){
		Random rnd = new Random();
		int choice = rnd.nextInt(responses.length);
		//System.out.println(responses[choice]);
		return responses[choice];
	}
	

}
