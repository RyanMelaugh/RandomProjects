package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StrngBuilder {

	StringBuilder sb = new StringBuilder();
	String a = "ab";
	String b = "cd";
	
	StrngBuilder(){
		sb.append(a);
		sb.append(b);
		System.out.println(sb.toString());
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		
		int a = 1;
	}
	
}
