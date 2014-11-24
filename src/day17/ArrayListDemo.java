package day17;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListDemo {

	public static void main(String[] args) {
		Collection<Cell> c = new ArrayList<Cell>();
		c.add(new Cell(1,2));
		c.add(new Cell(2,3));
		
		Cell cell = new Cell(2,3);
		
		System.out.println(c.contains(cell));

	}

}
