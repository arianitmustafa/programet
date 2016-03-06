package detyrat;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Programi {

	public static void main(String[] args) {

		Person person =new Person();
		
		person.setEmri("Arianit");
		person.setMbiemri("Mustafa");
		
		System.out.println("Emri: "+person.getEmri());
		System.out.println("Mbiemri: " +person.getMbiemri());
		
		Calendar cal= new GregorianCalendar(1999, 2, 27);
		person.setvitiLindjes(cal.getTime());	
        person.mosha(cal.getTime());
        
	}
	
}
