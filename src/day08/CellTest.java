package day08;

public class CellTest {

	public static void main(String[] args) {
		Cell c = new Cell(3,3);
		printWall(c);
		System.out.println(c.info());
		c.drop();
		printWall(c);
		System.out.println(c.info());
		

	}
	public static void printWall(Cell c){
		for(int i=0;i<20;i++){
			for(int j=0;j<10;j++){
				if(i==c.row&&j==c.col){
					System.out.print("* ");
				}else{
					System.out.print("- ");
				}
			}
			System.out.println();
		}
	}

}
