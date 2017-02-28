package evol;

public class item {
	int[][] grid;
	int pos1;
	int pos2;
	
	public item(int pos1, int pos2, int[][] grid){
		this.grid = grid;
		this.pos1 = pos1;
		this.pos2 = pos2;
	}
	
	public void delete(){
		grid[pos1][pos2] = 0;
	}
	
	public void produce(){
		grid[pos1+1][pos2] = 1;
		grid[pos1-1][pos2] = 1;
		grid[pos1][pos2+1] = 1;
		grid[pos1][pos2-1] = 1;
	}
	
	public int[][] getGrid(){
		return grid;
	}

}
