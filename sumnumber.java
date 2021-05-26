import java.util.Scanner;

public class sumnumber {

	public static void main(String[] args) {
		System.out.println("Addition of two numbers");
		Scanner sc=new Scanner(System.in);
		
		int num1,num2,num3;
		char ch1,ch2;
		System.out.println("Enter number1:");
		num1=sc.nextInt();
		System.out.println("enter number2:");
		num2=sc.nextInt();
		num3=num1+num2;
		System.out.println("Addition:"+num3);
		System.out.println("enter 1st character:");
		ch1=sc.next().charAt(0);
		System.out.println("enter the 2nd character:");
		ch2=sc.next().charAt(0);
		String result=String.valueOf(ch1)+String.valueOf(ch2);
		System.out.println("Sum of character:"+result);
		

		sc.close();
		

	}

}
