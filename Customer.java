
public class Customer {
  private int age;
  private String name;
  private String email;
   public Customer()
   {   System.out.println("------invoking def constructor------");
	   name="riya";
	    age=25;
	    email="riya@gmail.com";
   }
   public Customer(String name,int age,String email)
   { System.out.println("-----invoking parametrized constructor----");
	   this.name=name;
	   this.age=age;
	   this.email=email;
   }
   public void displayInfo()
   {
	   System.out.println("name:"+name);
	   System.out.println("age:"+age);
	   System.out.println("email:"+email);
   }
}
