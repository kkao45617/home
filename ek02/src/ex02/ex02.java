package ex02;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
//hash는 중복x 순서x
class car{
	private String model;
	private String color;
	private int price;
	public car(String model, String color,int price){
		this.model=model;
		this.color=color;
		this.price=price;
	}
	@Override
	public String toString() {
		return model+","+color+","+price+",";
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(model,color);
	}
	@Override
	public boolean equals(Object obj) {
		String m=((car)obj).model;
		String c=((car)obj).color;
		int p = ((car)obj).price;
		if(model.equals(m)&& color.equals(c)&&price==p)
			return true;
		else 
			return false;
	}
}
public class ex02 {

	public static void main(String[] args) {
		Set<car> set = new HashSet<car>();
		set.add(new car("robot","box",300));
		set.add(new car("y202","y205",200));
		set.add(new car("t323","h234",400));
		set.add(new car("u213","n865",200));
		set.add(new car("j234","k324",100));
		
		System.out.println("cnt:"+set.size());
		
		for(Iterator<car> itr=set.iterator(); itr.hasNext();) {
			System.out.println(itr.next());
		}
		System.out.println();
	}

}
