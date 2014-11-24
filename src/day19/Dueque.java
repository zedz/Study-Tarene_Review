package day19;

import java.util.Deque;
import java.util.LinkedList;

public class Dueque {

	public static void main(String[] args) {
		Deque<Emp> d = new LinkedList<Emp>();
		d.push(new Emp("Jamie",24,'f',10000));
		System.out.println(d);
		Emp e = d.pop();
		System.out.println(e);
		System.out.println(d);

	}

}
