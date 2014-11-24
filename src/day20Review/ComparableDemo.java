package day20Review;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableDemo {
	public static void main(String[] args) {
		List<Emp> list = new ArrayList<Emp>();
		list.add(new Emp("Jamie",24,'f',12000));
		list.add(new Emp("Lilei",28,'m',6000));
		list.add(new Emp("Hanmeimei",29,'f',8000));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Comparator<Emp> c = new Comparator<Emp>() {

			@Override
			public int compare(Emp o1, Emp o2) {
				return o1.age-o2.age;
			}
			
		};
		Collections.sort(list, c);
		System.out.println(list);
	}

}
