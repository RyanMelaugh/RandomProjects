package testSerialize;

public class Main {
	
	public static void main(String[] args){
		objTest test = new objTest(5, "test");
		SaveObject saveLoad = new SaveObject();
		
		saveLoad.saveFile(test);
		objTest test2 = saveLoad.loadFile();
		
		System.out.println(test2.getTestInt());
		System.out.println(test2.getTestString());
	}

}
