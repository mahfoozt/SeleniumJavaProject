package learnAbstractClass;

public class Test {

	public static void main(String[] args) {
		
		MobileUser mu1;
		mu1= new Karim();
		mu1.sendmessage();
		mu1.call();
		
		mu1=new Rahim();
		mu1.sendmessage();
		mu1.call();
		
		

	}

}
