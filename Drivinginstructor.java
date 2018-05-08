package fachlogik;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.List;

public class Drivinginstructor extends Person {

	private int numStudents;
	private List<Vehicle> licensedVehicles = new LinkedList<Vehicle>();

	public Drivinginstructor(String name, String firstname, Adress adress, Vehicle licensedVehicle) {
		super(name, firstname, adress);
		licensedVehicles.add(licensedVehicle);
	}

	public void addZugelasseneKlasse(Vehicle licensedVehicle) {
		licensedVehicles.add(licensedVehicle);
	}

	public int getnumStudents() {
		return numStudents;
	}

	public void addStudent() {
		numStudents++;
	}
	
	public void deleteStudent() {
		numStudents--;
	}
	@Override
	public void writeInStream(OutputStream os) {

		String s = getName() + " " + getfirstname() + " " + getAdress().getPLZ() + " " + getAdress().getcity() + " "
				+ getAdress().getStreet() + " " + getAdress().gethousenr() + " " + getnumStudents();
		OutputStreamWriter oSW = new OutputStreamWriter(os);
		try {
			oSW.write(s.toCharArray());
			oSW.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
