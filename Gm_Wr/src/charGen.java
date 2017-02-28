import java.util.Random;


public class charGen extends charBase{
	
	private final String name;
	public String fName;
	
	public charGen(String fName){
		name = genName();
		this.fName = fName;
	}
	
	
	@Override
	/*Generate a random name that is returned**/	
	protected String genName() {
	String[] nameList = {"Amazing","Rambunctios","Magic","Fabulous","Derry","Boyertown","Donegal","Letterkenny","Ireland","Playstation","Games","Development","Cool",
			 "Computer","Playing","Fun","Gaming","Levels","Keyboard","Bored","Party","Grape","Snow","Looking","Firefly","Firefly","DragonFly","Dragon",
			 "Castle","Age","Fighting","Melaugh","Ryan","Melissa","Sweets","Bonfire","Fancy","Driven","Speed","Breakdown","Rose",
			 "Black","Blue","Green","Forever","Sunshine","Happiness","Creative","Books","Book","Darling","Combat","Mortal",
			 "Warrior","Soldier","Insane","Insanity","Crisis","Bomb","War","Elves","Brutal","Trekon","Degoran","Story","Movie","Film","Playwright",
			 "Wright","Theatre","TallTales","Imagine","Imagination","Lords","Sliced","Build","Building","Craftwork","Future","Tower",
			 "Space","Atmosphere","Universe","Galaxy","World","Internet","Connected","Working","Night","Nightmare","Dreamworld"};

	//Random Generator
	Random rnd = new Random();
	
	//int to hold random value. This will select the first part of the name.
	int str = rnd.nextInt(nameList.length);
	
	//int to hold random value. This will select the last part of the name.
	int end = rnd.nextInt(nameList.length);
	
	//We put the first part of the name in here
	String strString = null;
	
	//we will put the last part of the name here
	String endString = null;
	
	int chance = rnd.nextInt(2);
	if(nameList[str].length()>=5 && chance == 1){
		strString = nameList[str].substring(0, 4);		
		}else{
			strString = nameList[str].substring(0,2);
		}
	
	chance = rnd.nextInt(2);
	if(nameList[end].length()>=5 && chance == 1){
		endString = nameList[end].substring(nameList[end].length()-4, nameList[end].length());		
		}else{
			endString = nameList[end].substring(nameList[end].length()-3,nameList[end].length());
		}
	

	
	return  (strString + endString);
	
	}

	@Override
	public char getGender() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getName() {		
		return name;
	}


	
}
