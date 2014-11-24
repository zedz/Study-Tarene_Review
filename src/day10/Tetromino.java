package day10;

public class Tetromino {
	Cell[] cells;
	
	public Tetromino(){
		cells = new Cell[4];
	}
	
	public void drop(){
		for(int i=0;i<cells.length;i++){
			cells[i].row++;
		}
	}
	
	public void moveLeft(){
		for(int i=0;i<cells.length;i++){
			cells[i].row++;
		}
	}
	
	public void moveRight(){
		for(int i=0;i<cells.length;i++){
			cells[i].row++;
		}
	}
	
	public void print(){
		String str ="";
		for(int i=0;i<cells.length;i++){
			str += cells[i].getCellInfo();
		}
		System.out.println(str);
	}
}
