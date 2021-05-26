import java.util.Scanner;

public class Date {
	private int day,month,year;
	
	
	public void acceptInfo()
	{  Scanner sc=new Scanner(System.in);
		System.out.println("enter day:");
		day=sc.nextInt();
		System.out.println("enter month:");
		month=sc.nextInt();
		System.out.println("enter year:");
		year=sc.nextInt();
		
	}
	public void displayInfo()
	{  System.out.println("-------------------");
		System.out.println("day/month/year");
		System.out.println(+day+"/"+month+"/"+year);
	}

}
