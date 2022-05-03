package lgsamsung;

public class beanfactory {

	public Object getbean(String beanname) {
		if(beanname.equals("samsung")) {
			return new samsungtv();
		}else if(beanname.equals("lgtv")) {
			return new lgtv();
		}
		return null;
	}
}
