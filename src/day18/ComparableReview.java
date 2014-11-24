package day18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableReview {

	public static void main(String[] args) {
		Emp emp1 = new Emp("Jamie",24,'f',10000);
		Emp emp2 = new Emp("Traci",24,'f',8000);		
		Emp emp3 = new Emp("Echo",24,'f',6000);
		
		List<Emp> c = new ArrayList<Emp>();
		c.add(emp1);
		c.add(emp2);
		c.add(emp3);
		System.out.println(c);
		Collections.sort(c);
		System.out.println(c);
	}

}
