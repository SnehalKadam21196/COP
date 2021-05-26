import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int num,r,rev=0;
		Scanner sd=new Scanner(System.in);
		System.out.println("enter the number:");
		num=sd.nextInt();
		while(num!=0)
		{
			r=num%10;
			rev=rev*10+r;
			num=num/10;
		}
		System.out.println("Reverse number is:"+rev);
		
		sd.close();

	}

}
