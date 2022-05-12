package ek02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


class num{
	private int num;
	public num(int num) {
		this.num=num;
	}
	@Override
	public String toString() {
		return "num:"+String.valueOf(num) ;
	}
	@Override
	public int hashCode() {
		return num%3;
	}
	@Override
	public boolean equals(Object obj) {
		if(this.num==((num)obj).num)
			return true;
		else
			return false;
	}
}
//중복,순서 x
public class ex01 {

	public static void main(String[] args) {
		Set<num> set = new HashSet<num>();
		set.add(new num(4));
		set.add(new num(1));
		set.add(new num(6));
		set.add(new num(2));
		set.add(new num(1));
		
		System.out.println("cnt:"+set.size());
		
		for(Iterator<num> itr=set.iterator(); itr.hasNext();) {
			System.out.println(itr.next());
		}
		System.out.println();
	}

}
