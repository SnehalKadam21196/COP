//3:Find the compound amount and compound interest 
//on the principal Rs.20,000 borrowed at 6% compounded annually for 3 years.

public class CompoundInterest {

	public static void main(String[] args) {
		int principal=20000,rate=6,time=3,i;
	  double compoundI,Amount;
		
		System.out.println("Given the principal:"+principal);	
		System.out.println("Given the rate in %:"+rate);
		System.out.println("Given the time:"+time);
		//compoundI=principal*(Math.pow((1+rate/100), time));
	compoundI=principal*(Math.pow((1+6/100),3));
	 System.out.println("Compound Interest="+compoundI);
	 Amount=principal;
	 for(i=1;i<=time;i++)
	 {
		 Amount=Amount+(Amount*rate/100);
	 }
		System.out.println("compound amount ="+Amount);
		

	}

}
