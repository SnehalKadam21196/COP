import java.util.Scanner;

public class Customer {
	private int age;
	private String name,email;
    private double creditlimit;
    
    
    public void acceptInfo()
    {  System.out.println("------------------");
    	System.out.println("Enter Customer details:");
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Name:");
    	name=sc.next();
    	System.out.println("Age:");
    	age=sc.nextInt();
    	System.out.println("Email:");
    	email=sc.next();
    	System.out.println("credit limit:");
    	creditlimit=sc.nextDouble();
    	
    }
    
    public void setCreditLimit(double limit)
    {
    	this.creditlimit=limit;
    	
    }
    
    public double getCreditLimit()
    {
    	return creditlimit;
    }
    public void displayInfo()
    {   System.out.println("---------------------------------");
      
    System.out.println("Display Customer details:");
    	System.out.println("Name:"+name);
    //	System.out.println("Age:"+age);
    //	System.out.println("Email:"+email);
    	System.out.println("Credit limit:"+creditlimit);
    }
    
    
    
}
