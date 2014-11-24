package day19;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String [] args){
		Queue<Emp> q = new LinkedList<Emp>();
		q.offer(new Emp("Jamie",24,'f',10000));
		q.offer(new Emp("Cheer",24,'f',12000));
		q.offer(new Emp("Johnson",30,'m',6000));
		q.offer(new Emp("Whoever",35,'f',8000));
		System.out.println(q);
		
//		while(q.size()>0){
//			System.out.println(q.poll());
//		}
		
		for(Emp emp:q){
			Emp e = q.peek();
			System.out.println(emp);
		}
	}
}
