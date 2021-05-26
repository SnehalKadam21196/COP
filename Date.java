
public class Date {
 private int day,month,year;
  public void setDay(int day)
  {
	  this.day=day;
  }
  public int getDay()
  {
	  return day;
  }
  public void setMonth(int month)
  {
	  this.month=month;
  }
 public int getMonth()
 {
	 return month;
 }
 public void setYear(int year)
 {
	 this.year=year;
 }
 public int getYear()
 {
	 return year;
 }
 public void displayInfo()
 {
	 System.out.println("day/month/year");
	 System.out.println(+day+"/"+month+"/"+year);
 }
}
