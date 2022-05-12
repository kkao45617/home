package ex08;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

class agedesc implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2-o1;
	}
	
}

public class ex08 {

	public static void main(String[] args) {
		//HashMap<Integer, String> map=new HashMap<Integer, String>();
		TreeMap<Integer, String> map=new TreeMap<Integer, String>(new agedesc());
		
		map.put(3, "kim");
		map.put(4, "ling");
		map.put(5, "log");
		map.put(4, "kism");
		map.put(6, "kim");
		map.put(20, "kim");
		map.put(15, "kim");
		

		System.out.println(map);
		System.out.println(map.get(4));
		
		Set<Integer> set= map.keySet();
		for(Integer n:set) {//key출력
			System.out.println(n);
		}
		for(Integer n:set) {// value 값출력
			System.out.println(map.get(n));
		}
		System.out.println("------------------");
		Iterator<Integer> itr= set.iterator();
		
		while(itr.hasNext())
			System.out.println(map.get(itr.next()));

	}

}
