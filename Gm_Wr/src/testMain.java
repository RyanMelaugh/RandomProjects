
public class testMain {

	public static void main(String[] args) {
		
		
		
		charGen newChar = new charGen("hello");
		
		fmly n1 = new fmly();
		System.out.println(newChar.getName() + " " + n1.familyName());
		n1.genAll();
	}

}
