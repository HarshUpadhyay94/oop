package objectoritentedprogramming;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Personclassaddress {

	public static void main(String[] args) throws ParseException {
		Person h=new Person();
		Date d=new Date();
		SimpleDateFormat asd = new SimpleDateFormat("dd/MM/yyyy");
		
		h.setDob(asd.parse("23/03/2013"));
		h.setName("harsh upadhyay");
		h.setAddress("mandleshwar");
		System.out.println(h.getDob());
	}
}
