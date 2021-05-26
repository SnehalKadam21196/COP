import java.util.Scanner;

public class PlindromeNum {

	public static void main(String[] args) {
		int num,rev=0,r,temp;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		num=sc.nextInt();
		temp=num;
		while(num!=0)
		{
			r=num%10;
			rev=rev*10+r;
			num=num/10;
		}
		if(temp==rev)
		{
			System.out.println("number is palindrome");
		}
		else
			System.out.println("number is not palindrome");
		sc.close();
	}

}
