package ex09;

public class ex09 {

	public static void main(String[] args) {
		buyer b= new buyer();
		b.buy(new tv());
		b.buy(new computer());
		b.buy(new tv());
		b.buy(new audio());
		b.buy(new computer());
		b.buy(new computer());
		b.buy(new computer());
		
		b.summary();
		

	}

}
class buyer{
	int money = 1000;
	product[] cart = new product[3];
	int i=0;
	void buy(product p) {
		product pro=p;
		if(money<pro.price)return;
		money-=pro.price;
		System.out.println(money);
		add(pro);
	}
	void add (product p) {
		cart[i++]=p;
		if(i>=cart.length) {
			product[]tmp = new product[cart.length*2];
			for(int j=0; j<cart.length; j++)
				tmp[j]=cart[j];
			cart = tmp;
		}
		System.out.println("cart :"+cart[i].toString());
		
	}
	void summary() {
		
	}
}


class product{
	int price;
	product(int price){
		this.price=price;
	}
}


class tv extends product{
	tv(){super(100);}
	public String tostring() {return "tv";}
	
}
class computer extends product{
	computer(){super(200);}
	public String tostring(){return "computer";}
}

class audio extends product{
	audio(){super(50);}
	public String tostring() {return "audio";}
}