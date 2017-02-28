package binary;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class Test {
	
	Test(){
		
	}
	
	public void calc(){
		int n = 3;
		while( n > 0 ){
			System.out.println("n = " + n + "\n\t" + Integer.toBinaryString(n));
			n = n << 2;
		}
		System.out.println("n is now: " + n + "\n\t" + Integer.toBinaryString(n));
		
	}

}
