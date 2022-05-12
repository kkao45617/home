package ex05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Set;

public class ex05 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("abc");
		set.add("abc");
		set.add(new person("david",10));
		set.add(new person("david",10));
		
		System.out.println(set);
	}

}

class person{
	String name;
	int age;
	
	person(String name, int age){
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return name+":"+age;
	}
	
	@Override
	public boolean equals(Object obj) {
		person tmp=(person)obj;
		return name.equals(tmp.name)&& age==tmp.age? true:false;
	}
	public int hashCode() {
		return Objects.hash(name,age);
	}
}