import java.util.Scanner;

public class Student {
	 private int roll_no;
	private String name,address;
	private String grade;
	private int totalmarks;
	
	
	 public void acceptInfo()
	 { Scanner sc=new Scanner(System.in);
	   System.out.println("enter roll no:");
	   roll_no=sc.nextInt();
	   System.out.println("enter name:");
	    name=sc.next();
	    System.out.println("address:");
	    address=sc.next(); 
	    System.out.println("totalmarks:");
	    totalmarks=sc.nextInt();
		// sc.close();
	 }
	 private void calGrade() {
	    	if(totalmarks>80)
	    		grade="+A";
	    	else if(totalmarks<79 && totalmarks>=69)
	    		grade="A";
	    	else
	    		grade="B";
	    			
	    }
	 public void setmarks(int a)
 	{
 		totalmarks=a;
 	}
	 public void displayInfo()
	 { 
		 calGrade();
		 System.out.println("roll no:"+roll_no);
		 System.out.println("name:"+name);
		 System.out.println("address:"+address);
		 System.out.println("Totalmarks:"+totalmarks);
		 System.out.println("Grade:"+grade);
	 }
	
   
}
