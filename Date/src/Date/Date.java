package Date;
import java.util.Scanner;
public class Date {
		int month;
		int date;
		int year;
		public Date() {
			month=0;
			date=0;
			year=0;// TODO Auto-generated constructor stub
		}
		Scanner input=new Scanner(System.in);
		public void setDate()
		{
			System.out.printf("\nEnter the date : ");
			date=input.nextInt();
		}
		public void setMonth()
		{
			System.out.printf("\nEnter the month : ");
			month=input.nextInt();
		}
		public void setYear()
		{
			System.out.printf("\nEnter the year : ");
			year=input.nextInt();
		}
		public int getDate()
		{
			return date;
		}
		public int getMonth()
		{
			return month;
		}
		public int getYear()
		{
			return year;
		}
		public void display(Date d)
		{
			System.out.printf("\nDislpay Function : %d/%d/%d", d.date,d.month,d.year);
		}
			
}


