import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num,r,sum=0,temp;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		num=sc.nextInt();
		temp=num;
		while(num!=0)
		{
			r=num%10;
			sum=sum+(r*r*r);
			
			num=num/10;
		}
		if(temp==sum)
			System.out.println("number is armstrong");
		else
			System.out.println("number is not armstrong");
			
  sc.close();
	}

}
