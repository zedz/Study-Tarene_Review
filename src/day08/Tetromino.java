package day08;

public class Tetromino {
	Cell[] cells;
	
	public Tetromino(){
		cells = new Cell[4];
	}
	
	public void info(){
		for(int i=0;i<cells.length;i++){
			System.out.println(cells[i].info()+" ");
		}
	}
	
	public void drop(){
		for(int i=0;i<cells.length;i++){
			cells[i].row++;
		}
	}
	
	public void moveLeft(){
		for(int i=0;i<cells.length;i++){
			cells[i].col--;
		}
	}
	
	public void moveRight(){
		for(int i=0;i<cells.length;i++){
			cells[i].col++;
		}
	}
}
