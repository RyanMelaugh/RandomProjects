import java.util.ArrayList;


public class Main {
	
	public static void main(String[] args){
		
		ParseSite ps = new ParseSite("http://www.fmylife.com");
		ArrayList<String> list = ps.getLinks();
		
		int c = 1;
		for(int i = 0; i < list.size(); i ++){
			if(i == 0 || i % 3 == 0){
				System.out.println("\t" + c + ": ");
				int space = 0;
				for(int e = 0; e < list.get(i).length(); e++){
					if(list.get(i).charAt(e) == ' ' && space==11){
						space=0;
						System.out.print("\n");
					} else if (list.get(i).charAt(e) == ' ' && space<11){
						System.out.print(list.get(i).charAt(e));
						space++;
					} else {
						System.out.print(list.get(i).charAt(e));
					}
				}
				//System.out.println("\t" + c + ": " + list.get(i) + "\n");
				c++;
			} else if(list.get(i).contains("I agree, your life sucks")){
				System.out.println(list.get(i) + "\n-----------------------------------------------------------------------------------");
			} else {
				System.out.println(list.get(i) + "\n");
			}
			
		}
	}

}
