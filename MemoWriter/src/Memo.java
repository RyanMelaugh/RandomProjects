import java.io.Serializable;


public class Memo implements Serializable{
	
	String memoStr;
	
	Memo(){
		
	}
	
	public void writeMemo(String inputStr){
		memoStr = inputStr;
	}
	
	public String getMemo(){
		return memoStr;
	}

}
