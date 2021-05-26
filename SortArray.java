import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		int[]arr;
		int i,j;
		Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array:");
        int size=sc.nextInt();
        arr=new int[size];
        System.out.println("Accept Array:");
        for(i=0;i<arr.length;i++)
        {
        	arr[i]=sc.nextInt();
        }
        System.out.println("Display array:");
        for(i=0;i<arr.length;i++)
        {
        	System.out.println(arr[i]);
        }
        int temp;
        for( i=0;i<arr.length;i++)
        { 
        	for(j=i+1;j<arr.length;j++)
        	{
        		if(arr[i]>arr[j])
        		{
        			temp=arr[i];
        			arr[i]=arr[j];
        			arr[j]=temp;
        		}
        		
        	}
        }
        System.out.println("sorted array:");
        for(i=0;i<arr.length;i++)
        {
        	System.out.println(arr[i]);
        }
     
       sc.close();
	}

}
