import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;


public class fmly {

	public String familyName(){
		String[] lastNList = {"Amazing","Rambunctios","Magic","Fabulous","Derry","Boyertown","Donegal","Letterkenny","Ireland","Playstation","Games","Development","Cool",
				 "Computer","Playing","Fun","Gaming","Levels","Keyboard","Bored","Party","Grape","Snow","Looking","Firefly","Firefly","DragonFly","Dragon",
				 "Castle","Age","Fighting","Melaugh","Ryan","Melissa","Sweets","Bonfire","Fancy","Driven","Speed","Breakdown","Rose",
				 "Black","Blue","Green","Forever","Sunshine","Happiness","Creative","Books","Book","Darling","Combat","Mortal",
				 "Warrior","Soldier","Insane","Insanity","Crisis","Bomb","War","Elves","Brutal","Trekon","Degoran","Story","Movie","Film","Playwright",
				 "Wright","Theatre","TallTales","Imagine","Imagination","Lords","Sliced","Build","Building","Craftwork","Future","Tower"};
		
		Random rnd = new Random();
		int strLast = rnd.nextInt(lastNList.length);
		int endLast = rnd.nextInt(lastNList.length);
		String strStringLast = null;
		String endStringLast = null;
		
		int chance1 = rnd.nextInt(2);
		if(lastNList[strLast].length()>=5 && chance1 == 1){
			strStringLast = lastNList[strLast].substring(0, 4);		
			}else{
				strStringLast = lastNList[strLast].substring(0,2);
			}
		chance1 = rnd.nextInt(2);
		if(lastNList[endLast].length()>=5 && chance1 == 1){
			endStringLast = lastNList[endLast].substring(lastNList[endLast].length()-4, lastNList[endLast].length());		
			}else{
				endStringLast = lastNList[endLast].substring(lastNList[endLast].length()-3,lastNList[endLast].length());
			}
		
		return  (strStringLast + endStringLast);
	}
	
	public void genKing(){
		String fName = familyName();
		Random rnd = new Random();
		//int branches = rnd.nextInt(5);
		//int Kbranch = rnd.nextInt(branches);
		//int Kgeneration = 2;
		
	}
	
	public void genLord(){
		
	}
	
	
	//test bed to generate a large number of families and save it to a file
	public void genAll(){
		File nFile = new File("./names.txt");
		if(nFile.exists()==false){
			try {
				nFile.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		BufferedWriter bw;
		try {
			bw = new BufferedWriter(new FileWriter(nFile));
		
		Random rnd = new Random();
		int KinSpac = rnd.nextInt(50);
		int LoSpac1 = rnd.nextInt(50);
		int LoSpac2 = rnd.nextInt(50);
		String[] nameList = new String[50];
		for(int i = 0;i< nameList.length;i++){
			nameList[i] = familyName();
			bw.write(nameList[i]);
			if(i == KinSpac){
				bw.write(", King");
				}else if(i == LoSpac1){
					bw.write(", Lord1");
				}else if(i == LoSpac2){
					bw.write(", Lord2");
				}
			bw.newLine();
			}
		bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
