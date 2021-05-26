import java.util.Scanner;

//1:Write a function to accept array of string.Display all elements in uppercase.

public class StringUppercase {
	  
	 public static void accept(String[]arr)
	 
	 {
		 System.out.println("display names in uppercase:");
		  for(int i=0;i<arr.length;i++)
		  {
			  System.out.println(arr[i].toUpperCase());
		  }
	 }
	  

	public static void main(String[] args) {
		String[]arr=new String[5];
		Scanner sc=new Scanner(System.in);
		
		  System.out.println("Accept names:");
		  for(int i=0;i<arr.length;i++)
		  {
			  arr[i]=sc.next();
		  }
		  
		  accept(arr);
			  
		  sc.close();
	}

}
