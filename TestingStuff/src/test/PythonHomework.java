package test;

public class PythonHomework {
	private void ryan(){
		int[][] x = new int[4][4];
		for(int i = 0; i < x.length; i++)
		   for(int c = 0 ; c < x[i].length; c++){
			   
		   }
	}
	
	
	public int[][] correct = {
				{1,2,3},
				{2,3,1},
				{3,1,2}
	};
	
	public int[][] incorrect0 = {
			{1,2,3,4},
			{1,2,3,4}
	};
		
		
	public int[][] incorrect1 = {
				{1,2,3,4},
				{2,3,1,3},
				{3,1,2,3},
				{4,4,4,4}
	};
	
	public int[][] incorrect2 = {
			{1,2,3,4},
            {2,3,1,4},
            {4,1,2,3},
            {3,4,1,2}
	};
	
	public int[][] incorrect3 = {
			{1,2,3,4,5},
            {2,3,1,5,6},
            {4,5,2,1,3},
            {3,4,5,2,1},
            {5,6,4,3,2}	
	};
	
	public void test(int[][] input){	
		
		//Check that the input is square
		if(input.length != input[0].length){
			System.out.println("False");
		}else{
			String tf = "True";
			
			for(int i = 0; i < input.length; i++){
				for(int c = 0; c < input.length; c++){
					//Check that it goes from 1 to n without skipping numbers
					if(input[i][c] > input.length){
						tf = "False";
						break;
					}
					
					//Check that no number repeats in the row.
					for(int in = 0; in < input.length; in++){
						if(i != in){
							if(input[i][c] == input[in][c]){
								tf = "False";
								break;
							}
						}
						if(c != in){
							if(input[i][c] == input[i][in]){
								tf = "False";
								break;
							}
						}
					}
					
				}
				
				
				if(tf.equalsIgnoreCase("False")){
					break;
				}
			}
			System.out.println(tf);
		}
	}
}
