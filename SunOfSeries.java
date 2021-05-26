import java.util.Scanner;

public class SunOfSeries {

	public static void main(String[] args) {
	
		int num,i,sum=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the limit of series n:");
		num=sc.nextInt();
		for(i=1;i<=num;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum of series:"+sum);
		
			sc.close();
		
	}

}
