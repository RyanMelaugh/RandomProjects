package testSerialize;

import java.io.Serializable;

public class objTest implements Serializable {
	
	int test1;
	String test2;
	
	objTest(int x, String t){
		test1 = x;
		test2 = t;
	}
	
	public int getTestInt(){
		return test1;
	}
	
	public String getTestString(){
		return test2;
	}
	
	

}
