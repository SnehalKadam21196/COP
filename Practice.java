import java.util.Scanner;

public class Practice {
	     public static void Acceptstring(String[]arr)
	     {   Scanner sc=new Scanner(System.in);
	     System.out.println("Accept name:");
	    	 for(int i=0;i<arr.length;i++)
	    	 {
	    		 arr[i]=sc.next();
	    	 }
	    	 System.out.println("Display name in uppercase:");
	    	 for(int i=0;i<arr.length;i++)
	    	 {
	    		 System.out.println(arr[i].toUpperCase());
	    	 }
	    	 sc.close();
	     }
       
	public static void main(String[] args) {
		 String[]arr=new String[5];
		 
		Acceptstring(arr);

	}

}
