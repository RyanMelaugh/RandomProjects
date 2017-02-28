package evol;

import java.util.ArrayList;

public class run {
	int[][] grid;
	ArrayList<int[][]> gridList = new ArrayList<int[][]>();
	
	public static void main (String[] args){
		
		
	}
	
	
	
	public static void run(){
		
	}
	
	public void create(){
		grid = new int[10][10];
	}
	
	public void print(){
		for(int i =0;i<10;i++){
			System.out.println("/n");
			for(int c=0;c<10;c++){
				System.out.println(grid[i][c]);
			}
		}
	}
	
	public void fillInt(){
		for(int i=0;i<10;i++){
			for(int c=0;c<10;c++){
				grid[i][c] = 0;
			}
		}
	}
	
	public void seed(int pos1, int pos2){
		grid[pos1][pos2] = 1;
	}
	
	public void start(){
		int pos;
		for(int i=0;i<10;i++){
			for(int c=0;c<10;c++){
				if(grid[i][c] == 1){
					item it = new item(i,c,grid);
					gridList.add(it.getGrid());
				}
			}
		}
	}
	
	public int rid(int pos1, int pos2){
		int num = 0;
		for(int i = 0; i< gridList.size();i++){
			if(gridList.get(i)[pos2][pos1] == 1){
				num+=1;
			}
		}
		return num;
	}
	
	public void scan(){
		int col = 0;
		int row = 0;
		int num = 0;
		for(int i = 0;i<10;i++){
			row = 0;
			col+=1;
			for(int c = 0;c<10;c++){
				row+=1;
				num = rid(col, row);
				if(num>1){
					deleteCell(col,row);
					num = 0;
				}else{
					num = 0;
			}
		}
	}
	}
	
	public void deleteCell(int pos1, int pos2){
		for(int i = 0; i< gridList.size();i++){
			gridList.get(i)[pos2][pos1] = 0;
			}
		}
	
	

}
