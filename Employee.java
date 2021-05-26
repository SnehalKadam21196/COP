import java.util.Scanner;

public class Employee {
	private int employee_id;
	private String  empName;
	private double hra;
	private double medical;
	private double basic_sal,net_sal,Gross_sal;
	private double pf,pt;
	
	public void acceptInfo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Emplyoee ID:");
		employee_id=sc.nextInt();
		System.out.println("employee Name:");
		empName=sc.next();
		System.out.println("Basic Salary:");
		basic_sal=sc.nextDouble();
		System.out.println("Medical fund:");
		medical=sc.nextDouble();
		
	
		
		
	}
	public void calSalary()
	{
		hra=(basic_sal*50)/100;
		pt=200;
		pf=(basic_sal*12)/100;
		Gross_sal=hra+medical+basic_sal;
		net_sal=Gross_sal-(pt+pf);
	}
	public void displayInfo()
	{    calSalary();
		System.out.println("------------------------");
		System.out.println("Emplyoee ID:"+employee_id);
		System.out.println("employee Name:"+empName);
		System.out.println("Basic Salary:"+basic_sal);
		System.out.println("Gross Salary:"+Gross_sal);
		System.out.println("Net Salary:"+net_sal);
		
		
	}

}
