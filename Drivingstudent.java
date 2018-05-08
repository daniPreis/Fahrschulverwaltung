package fachlogik;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Drivingstudent extends Person {

	private boolean theoryPassed;
	private boolean praxisPassed;
	private int numTheLes;
	private int numPraLes;
	private int openAmounts = 0;
	private String drivinginstructor;



	public Drivingstudent(String name, String Firstname, Adress adress, int numTheLes, boolean theoryPassed,
			String drivinginstructor, int numPraLes, boolean praxisPassed) {
		super(name, Firstname, adress);
		this.setnumTheLes(numTheLes);
		this.settheoryPassed(theoryPassed);
		this.setDrivinginstructor(drivinginstructor);
		//drivinginstructor.addStudent();
		this.setnumPraLes(numPraLes);
		openAmounts = numPraLes * 60;
		this.setpraxisPassed(praxisPassed);
		this.setopenAmounts(openAmounts);
	}

	public boolean istheoryPassed() {
		return theoryPassed;
	}

	public void settheoryPassed(boolean theoryPassed) {
		this.theoryPassed = theoryPassed;
	}

	public boolean ispraxisPassed() {
		return praxisPassed;
	}

	public void setpraxisPassed(boolean praxisPassed) {
		this.praxisPassed = praxisPassed;
	}

	public int getnumTheLes() {
		return numTheLes;
	}

	public void setnumTheLes(int numTheLes) {
		this.numTheLes = numTheLes;
	}

	public int getnumPraLes() {
		return numPraLes;
	}

	public void setnumPraLes(int numPraLes) {
		this.numPraLes = numPraLes;
		openAmounts = numPraLes * 60;
	}

	public String getDrivinginstructor() {
		return drivinginstructor;
	}

	public void setDrivinginstructor(String drivinginstructor) {
		this.drivinginstructor = drivinginstructor;
	}

	public int getopenAmounts() {
		return openAmounts;
	}

	public void setopenAmounts(int openAmounts) {
		this.openAmounts = openAmounts;
	}

	@Override
	public void writeInStream(OutputStream os) {

		String s = getName() + " " + getfirstname() + " " + getAdress().getPLZ() + " " + getAdress().getcity() + " "
				+ getAdress().getStreet() + " " + getAdress().gethousenr() + " " + numTheLes
				+ theoryPassed + drivinginstructor + numPraLes + praxisPassed + openAmounts;
		OutputStreamWriter oSW = new OutputStreamWriter(os);
		try {
			oSW.write(s.toCharArray());
			oSW.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
