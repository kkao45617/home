package ex03;
//date 이용하는 방법
import java.text.SimpleDateFormat;
import java.util.Date;
public class ex03 {

	public static void main(String[] args) {
		 Date today = new Date();
		 SimpleDateFormat date= new SimpleDateFormat("yyyy 년 MM월 dd일");
		 SimpleDateFormat time= new SimpleDateFormat("hh:mm:ss a");
		 System.out.println("날짜 : "+date.format(today));
		 System.out.println("시간 : "+time.format(today));
		 
		 test t= new test2();
		 t.func();
	}

}
abstract class test{
	int num=100;
	abstract void func();
	abstract void func2();
}

class test2 extends test{
	@Override
	void func() {
		System.out.println("asdfasdf"+num);
	}
	@Override
	void func2() {}
}
