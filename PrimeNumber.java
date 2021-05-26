import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int num,i,flag=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number:");
		num=sc.nextInt();
		for(i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				flag=1;
				break;
			}
		}
		if(num==1)
		{
			System.out.println("number is neither prime nor composite");
		}
		else
		{
			if(flag==0)
				System.out.println("number is prime");
			else
				System.out.println("number is not prime");
		}
		
   sc.close();
	}

}
