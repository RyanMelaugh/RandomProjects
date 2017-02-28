package eckalpse;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		String[][] test = new String[48][6];
		for(int i = 0; i<48;i++){
			for(int c = 0;c<6;c++){
				test[i][c]= "empty";
			}
		}
		
		test[25][0] = "6";
		test[25][1] = "Primary";
		test[25][2] = "Second";
		test[25][3] = "Third";
		test[25][4] = "Forth";
		test[25][5] = "Fifth";
		
		TimeManager tm = new TimeManager();
		tm.importTimeSlot(test);
		tm.getPrimaryAction(52);
		System.out.println(tm.getRandomActionFromRow(25));
		System.out.println(tm.getStatBasedGrid(3, 3, 3, 25));
		
		ActivityFULL act = new ActivityFULL();
		act.genEntertainment();act.genHunger();act.genSleep();
		
		//Test override class to test overriding genH
		System.out.println("\n\t--Overrided class start --");
		TestOverride to = new TestOverride();
		//to.genHunger();to.genEntertainment();to.genSleep();
		//CHANGE ACTIVIY TO INTERFACE
		System.out.println("fg");
		Indiv i = new Indiv(to);
		

	}
	
}
