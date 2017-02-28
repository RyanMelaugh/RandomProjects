import java.util.Random;


public class generate {
	
	String[] nameSetA = {"Popping","ig","Mars","Sky","Qwerty","Robo","80s","Rock","Hunting","",
			"","Book","Devo","Comp","Token","","Vox","Arches","101","Barren","Clone","AC","Bits",
			"Memory","Pizza","","Lucky","90s","Biscuit","Risk","Watch","Light","Sea","Letter","Duck",
			"Ry","",};
	
	String[] nameSetB = {"Man","Robo","Computer","Comp","Generator","Writer","_Done_","Complete",
			"","Wires","Wired","Op","Luck","Scholar","Robot","Season","Top","Crunch","Breaker",
			"B","Ry","Reacher","Guard","Guardian","Screech","Boat","Yacht","Programmer","Program",
			"Scripter","Coder","Dancer","Fighter","StepidyStep","Watcher","Timer","Researcher",
			"Goer",""};
	
	Random rnd = new Random();
	
	generate(){
		
	}
	
	public void generateNames(int num){
		for(int i = 0; i < num; i++){
			System.out.println(nameSetA[rnd.nextInt(nameSetA.length)] + nameSetB[rnd.nextInt(nameSetB.length)] + rnd.nextInt(1000));
		}
	}

}
