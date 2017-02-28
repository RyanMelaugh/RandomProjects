package figures;

public class run {
	
	public static void main(String[] args){
		UK UK = new UK();
		UK.setUp("UK", 64.1);
		UK.setPop(47, 2, 13.5, 64.5);
		UK.setBI(6000, "full");
		System.out.println(UK.getTotal());
		System.out.println(UK.currentSpending(220, 31, 97, 40));
	}
	

}
