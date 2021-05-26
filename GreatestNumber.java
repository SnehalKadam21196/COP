import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
	   int num1,num2,num3;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter num1:");
	   num1=sc.nextInt();
	   System.out.println("enter num2:");
	   num2=sc.nextInt();
	   System.out.println("enter num3:");
	   num3=sc.nextInt();
	   if(num1>num2)
	   { if(num1>num3)
		  System.out.println("greatest number="+num1);
	   else
		   System.out.println("greatest number="+num3);
		   
	   }
	   else if(num2>num3)
	   System.out.println("greatest number="+num2);
	   else
		   System.out.println("greatest number="+num3);
		   
	   
		   
	   sc.close();
	   
		

	}

}
