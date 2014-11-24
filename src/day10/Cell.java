package day10;

public class Cell {
	int row;
	int col;
	
	public Cell(int row,int col){
		this.row = row;
		this.col = col;
	}
	
	public void drop(){
		row++;
	}
	
	public void moveLeft(){
		col--;
	}
	
	public void moveRight(){
		col++;
	}
	
	public String getCellInfo(){
		return "("+row+", "+col+")";
	}
}
