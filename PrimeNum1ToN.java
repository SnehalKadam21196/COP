import java.util.Scanner;

public class PrimeNum1ToN {

	public static void main(String[] args) {
		int num,i,count,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number 1 to n:");
		num=sc.nextInt();
		for(i=2;i<=num;i++)
		{
			count=0;
			for(j=2;j<=i;j++)
			{  
				if(i%j==0)
				count++;
				
			}
			if(count==1 ) 
			{
				System.out.println(i+" ");
			}


		}
		
		
		
		sc.close();
		
		
	
		
   }
}
