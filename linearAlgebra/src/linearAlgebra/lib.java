package linearAlgebra;

public class lib {
	
	double[] vect;
	
	lib(double[] vect){
		this.vect = vect;
	}
	
	public boolean eq(double[] nVect){
		return vect.equals(nVect);
	}
	
	public double[] add(double[] nVect){
		if(checkLengthEquals(nVect) == true){
			for(int i = 0; i < vect.length; i++){
				vect[i] = vect[i] + nVect[i];
			}
			return vect;
		} else {
			
		}
		return null;
	}
	
	public double[] sub(double[] nVect){
		if(checkLengthEquals(nVect) == true){
			for(int i = 0; i < vect.length; i++){
				vect[i] = vect[i] - nVect[i];
			}
			return vect;
		} else {
			
		}
		return null;
	}
	
	public double[] mult(double val){
			for(int i = 0; i < vect.length; i++){
				vect[i] = vect[i] * val;
			}
			return vect;
	}
	
	public boolean checkLengthEquals(double[] nVect){
		if(nVect.length == vect.length){
			return true;
		}
		return false;
	}
	
	public double[] getVect(){
		return vect;
	}
	
	public void print(){
		System.out.print("[ ");
		for(double val : vect){
			System.out.print(val + " ");
		}
		System.out.println("]\n");
	}

}
