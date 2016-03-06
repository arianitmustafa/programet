package detyrat;

import java.util.Calendar;
import java.util.Date;

public class Person {

	private String emri;
	private String mbiemri;
	private Date vitiLindjes;

	public Person() {

	}

	public Person(String emri, String mbiemri, Date vitiLindjes) {
		this.emri = emri;
		this.mbiemri = mbiemri;
		this.vitiLindjes = vitiLindjes;
	}

	public String getEmri() {
		return this.emri;
	}

	public String getMbiemri() {
		return this.mbiemri;
	}

	public Date getvitiLindjes() {
		return this.vitiLindjes;
	}

	public void setEmri(String emri) {
		this.emri = emri;
	}

	public void setMbiemri(String mbiemri) {
		this.mbiemri = mbiemri;
	}

	public void setvitiLindjes(Date vitiLindjes) {
		this.vitiLindjes = vitiLindjes;
	}
	
	public  int mosha (Date vitiLindjes){
		
		int rez=0;
		Calendar calendar= Calendar.getInstance();
		int dita= vitiLindjes.getDate();
		int muaji= vitiLindjes.getMonth();
		int viti=vitiLindjes.getYear()+1900;
		
		int dd=calendar.get(Calendar.DAY_OF_MONTH);
		int mm= calendar.get(Calendar.MONTH)+1;
		int yy= calendar.get(Calendar.YEAR);
		
		if (dd>=dita && mm>=muaji) {
			rez= yy-viti;
		}
		else  if (dd<dita && mm>=muaji){
			rez=yy-viti-1;
		}
		else if(dd>=dita && mm<muaji){
			rez=yy-viti-1;
		}
		else{
			rez=yy-viti;
		}
		
		System.out.println("Mosha: " +rez);
		return rez;
		
	}
	
	
}
