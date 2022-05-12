package ex04;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

//list 구조를 이용하여 hash의 순서가 없는 정렬을 정렬시켜주는 문법
public class ex04 {

	public static void main(String[] args) {
		Set set = new HashSet();
		for(int i=0; set.size()<6;i++) {
			int num=(int)(Math.random()*45)+1;
			set.add(new Integer(num));
		}
		List list = new LinkedList(set);
		Collections.sort(list);
		System.out.println(list);
		
	}

}
