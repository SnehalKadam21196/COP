import java.util.Scanner;

public class MergeTwoArrayss {

	public static void main(String[] args) {
		int[]arr1=new int[3];
		int[]arr2=new int[5];
		int[]arr3=new int[arr1.length+arr2.length];
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Array 1 Elements:");
		for(i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		//first merge
		for(i=0;i<arr1.length;i++)
		{
			arr3[i]=arr1[i];
		}
		 System.out.println("Display Array 1 elements:");
		 for(i=0;i<arr1.length;i++)
		 {
			 System.out.print(arr1[i]+" ");
		 }
		 
       int index=arr1.length;
		System.out.println("\nenter array 2 elements:");
		for(i=0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
		}
		//second merge
		for(i=0;i<arr2.length;i++)
		{
			arr3[index]=arr2[i];
			index=index+1;
		}
		System.out.println("\ndisplay 2 Array:");
		for(i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+" ");
		}
		System.out.println("\nMerge Array:");
		for(i=0;i<arr3.length;i++)
		{
			System.out.print(arr3[i]+" ");
		}
		 sc.close();
	}

}
