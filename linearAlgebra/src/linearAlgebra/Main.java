package linearAlgebra;

public class Main {

	public static void main(String[] args){
		run();
	}
	
	public static void run(){
		lib vect = new lib(new double[]{8.218,-9.341});
		lib vect2 = new lib(new double[]{-1.129,2.111});
		vect.add(vect2.getVect());
		vect.print();
		
		lib vect3 = new lib(new double[]{7.119,8.215});
		lib vect4 = new lib(new double[]{-8.223,0.878});
		vect3.sub(vect4.getVect());
		vect3.print();
		
		lib vect5 = new lib(new double[]{1.671,-1.012,-0.318});
		vect5.mult(7.41);
		vect5.print();
		
		
	}
	
}
