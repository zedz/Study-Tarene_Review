package day10;

public class TetrominoTest {

	public static void main(String[] args) {
		T t = new T(3,3);
		printBlock(t);

	}
	
	public static void printBlock(Tetromino b){
		for(int i=0;i<20;i++){
			for(int j=0;j<10;j++){
				boolean flag = true;
				for(int k=0;k<b.cells.length;k++){
					if(i==b.cells[k].row&&j==b.cells[k].col){
						System.out.print("* ");
						flag = false;
						break;
					}
				}
				if (flag){
					System.out.print("- ");
				}
			}
			System.out.println();
		}
	}

}
