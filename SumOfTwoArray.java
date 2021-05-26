import java.util.Scanner;

public class SumOfTwoArray {

	public static void main(String[] args) {
		int[][]arr1=new int[3][3];
		int[][]arr2=new int[3][3];
		int[][]arr3=new int[3][3];
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Accept array 1 elements:");
		for(i=0;i<arr1.length;i++)
		{
			for(j=0;j<arr2.length;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Display array 1 elements:");
		for(i=0;i<arr1.length;i++)
		{
			for(j=0;j<arr1.length;j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Accept array2 elements:");
		for(i=0;i<arr2.length;i++)
		{
			for(j=0;j<arr2.length;j++)
			{
				arr2[i][j]=sc.nextInt();
			}
		}
		System.out.println("Display array 2 elements:");
		for(i=0;i<arr2.length;i++)
		{   for(j=0;j<arr2.length;j++)
			{System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Addition of 2 array elements:");
		for(i=0;i<arr3.length;i++)
		{
			for(j=0;j<arr3.length;j++)
			{
				arr3[i][j]=arr1[i][j]+arr2[i][j];
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		sc.close();
		
	}

}
