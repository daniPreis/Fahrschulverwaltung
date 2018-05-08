package fachlogik;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public abstract class Person {

	private String name;
	private String firstname;
	public  Adress adress;
	public String adressAlsString ;

	public Person(String name, String firstname, Adress adress) {
		this.setName(name);
		this.setfirstname(firstname);
		this.setAdress(adress);
		adressAlsString = adress.toString();
	}

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	public String getfirstname() {
		return firstname;
	}

	public void setfirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void writeInStream(OutputStream os) {
		String s = name + " " + firstname + " " + adress.getPLZ() + adress.getcity() + adress.getStreet()
				+ adress.gethousenr();
		OutputStreamWriter oSW = new OutputStreamWriter(os);
		try {
			oSW.write(s.toCharArray());
			oSW.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
