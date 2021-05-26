//4.Write a function /method which takes variable no of int numbers as an argument and 
//returns the sum of these arguments as an output.

public class VarArgument {
	public static void Sumofnumbers(int...a)
	{ int sum=0;
	   for(int i=0;i<a.length;i++)
	    {
		sum=sum+a[i];
	    }
		System.out.println("sum of numbers:"+sum);
	}
                      
	public static void main(String[] args) {
		
    Sumofnumbers();
    Sumofnumbers(1,2);
    Sumofnumbers(1,2,3,4,5,6,7,8,9,10);
	}

}
