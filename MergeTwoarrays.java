
import java.util.Scanner;

public class MergeTwoarrays {

	public static void main(String[] args) {
		int[]arr1=new int[5];
		int[]arr2=new int[5];
		int[]arr3=new int[10];
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("accept array 1 elements:");
		for(i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Display array 1 elements:");
		for(i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
			arr3[i]=arr1[i];
	
		}
		System.out.println("\naccept array 2 elements:");
		for(i=0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
		}
		System.out.println("Display array2 elements:");
		for(i=0,j=5;i<arr2.length;i++,j++)
		{
			System.out.print(arr2[i]+" ");
			arr3[j]=arr2[i];
		}
		System.out.println("\n------------------------------");
		System.out.println("Merge array:");
		for(i=0;i<arr3.length;i++)
		{ 
				System.out.print(arr3[i]+" ");
		
		}	
		
 sc.close();
	}

}
