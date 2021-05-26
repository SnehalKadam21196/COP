
public class CInterest {

	public static void main(String[] args) {
		int principle=20000,n=12,t=3;
		double rate=0.06;
		double Amount;
		Amount= principle* Math.pow(1+(rate/n),n*t);
		double I= Amount- principle;
		System.out.println("The amount is:"+Amount);
		System.out.println("Compund Interest :"+I);

	}

}
