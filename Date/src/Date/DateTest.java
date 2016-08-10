package Date;

public class DateTest {
	public static void main(String[] args) {
		Date d1=new Date();
		Date d2=new Date();
		d1.setDate();
		d1.setMonth();
		d1.setYear();
		d2.setDate();
		d2.setMonth();
		d2.setYear();
		d1.display(d1);
		d2.display(d2);
		System.out.printf("\nGet Function : %d/%d/%d", d1.getDate(),d1.getMonth(),d1.getYear());
		System.out.printf("\nGet Function : %d/%d/%d", d2.getDate(),d2.getMonth(),d2.getYear());

	}


}
