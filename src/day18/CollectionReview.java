package day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionReview {

	public static void main(String[] args) {
		String[] str = {"9","1","8","3","4","5"};
		List<String> l = Arrays.asList(str);
		System.out.println(l);
		List<String> list = new ArrayList<String>(l);
		list.add(5, "6");
		list.remove(0);
		String s = list.get(3);
		list.set(0, "1+1");
		System.out.println(s);
		System.out.println(list);
		List<String> sublist = list.subList(2, 4);
		Iterator<String> it = sublist.iterator();
		while(it.hasNext()){
			String sub = it.next();
			System.out.print(sub);
			it.remove();
		}

		Collections.sort(list);
		System.out.println(list);
		String[] string = list.toArray(new String[]{});
		System.out.println(Arrays.toString(string));
		

	}

}
