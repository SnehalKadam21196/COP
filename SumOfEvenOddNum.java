import java.util.Scanner;

public class SumOfEvenOddNum {

	public static void main(String[] args) {
	 int num,even_num=0,odd_num=0,i;
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter the number 1 to n:");
		num=sc.nextInt();
		for(i=1;i<=num;i++)
		{ 
			if(i%2==0)
				{
	        even_num=even_num+i;
	        
	        }
			else
	          {
	        	 odd_num=odd_num+i; 
	        	 
	          }
				
		}
		System.out.println("sum of even number:"+even_num);
		System.out.println("sum of odd number:"+odd_num);
		sc.close();
		}

	}


