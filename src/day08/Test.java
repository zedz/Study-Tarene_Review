package day08;

public class Test {

	public static void main(String[] args) {
		Tetromino t = new T(0,4);
		printBlock(t);
		t.drop();
		System.out.println("drop one row");
		printBlock(t);

	}

	public static void printBlock(Tetromino block){
		for(int i=0;i<20;i++){
			for(int j=0;j<10;j++){
				boolean isInCell = false;
				for(int k=0;k<block.cells.length;k++){
					if(i==block.cells[k].row&&j==block.cells[k].col){
						System.out.print("* ");
						isInCell = true;
						break;
					}
				}
				if(!isInCell){
					System.out.print("- ");
				}
			}
			System.out.println();
		}
	}
}
