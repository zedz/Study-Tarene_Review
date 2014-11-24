package day17;

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
	
	public String toString(){
		return "("+row+", "+col+")";
	}
	
	public boolean equals(Object obj){
		if(obj==null){
			return false;
		}
		if(obj==this){
			return true;
		}
		if(obj instanceof Cell){
			Cell c = (Cell)obj;
			return c.row==this.row&&c.col==this.col;
		}
		return false;
	}
}
