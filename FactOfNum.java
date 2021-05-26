import java.util.Scanner;

public class FactOfNum {

	public static void main(String[] args) {
		
		int fact=1,num,i;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number:");
		num=sc.nextInt();
		System.out.println("Factorial of number:");
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		
		System.out.println(" "+fact);
		sc.close();
	 
	}
	

}
