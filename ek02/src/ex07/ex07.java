package ex07;

import java.util.Iterator;
import java.util.TreeSet;
//트리를 이용한 세팅을 하는 과정
class person implements Comparable<person>{
	String name;
	int age;
	public person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() {
		return name+":"+age;
	}
	@Override
	public int compareTo(person o) {
		return this.age-o.age;
	}
}
public class ex07 {

	public static void main(String[] args) {
		TreeSet<person> tree= new TreeSet<person>();
		tree.add(new person("kin",20));
		tree.add(new person("kse",20));
		tree.add(new person("ter",20));
		tree.add(new person("kaz",20));
		tree.add(new person("bfd",25));
		tree.add(new person("kin",80));
		tree.add(new person("ka",90));
		tree.add(new person("kin",40));
		
		
		for(person n:tree)
			System.out.println(n.toString());
		System.out.println("---------------------");
		Iterator<person> itr= tree.iterator();
		while(itr.hasNext()) {
			person n = itr.next();
			System.out.println(n.toString());
		}
	}

}
