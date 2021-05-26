import java.util.Scanner;

public class TestCustomer {

	public static void main(String[] args) {
		Customer C1=new Customer();
		C1.acceptInfo();
		C1.displayInfo();
		Customer C2=new Customer();
		C2.acceptInfo();
		C2.displayInfo();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter new credit limit:");
		double c=sc.nextDouble();
		C2.setCreditLimit(c);
		//C2.displayInfo();
		System.out.println("new credit limit:"+C2.getCreditLimit());
		

	}

}
