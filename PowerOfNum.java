import java.util.Scanner;

public class PowerOfNum {

	public static void main(String[] args) {
		int base,exp,power=1,i;
		Scanner sd=new Scanner(System.in);
		System.out.println("enter the base:");
		base=sd.nextInt();
		System.out.println("enter the exp:");
		exp=sd.nextInt();
		for(i=1;i<=exp;i++)
		{
			power=power*base;
		}
		System.out.println("Power of number:"+power);
      sd.close();
	}

}
