package day20Review;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapCount {
	public static void main(String[] args) {
		String str = "good good study, day day up";
		str = str.replaceAll("\\W", "");
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for(int i=0;i<str.length();i++){
			char t = str.charAt(i);
			if(map.containsKey(t)){
				map.put(t, map.get(t)+1);
			}else {
				map.put(t, 1);
			}
		}
		System.out.println(map);
	}
}
