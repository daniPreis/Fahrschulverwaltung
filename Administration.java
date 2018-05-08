package fachlogik;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedList;
import java.util.List;

import javafx.collections.ObservableList;

public class Administration {

	public ObservableList<Drivinginstructor> drivinginstructorlist;
	public ObservableList<Drivingstudent> studentList ;
	public ObservableList<Vehicle> vehicles;

	public  List<Drivingstudent> getstudentList() {
		return studentList;
	}
	public void adddrivinginstructor(Drivinginstructor drivinginstructor) {
		drivinginstructorlist.add(drivinginstructor);
	}

	public void adddrivingsstudent(Drivingstudent drivingstudent) {
		studentList.add(drivingstudent);
	}

	public void addvehicle(Vehicle vehicle) {
		vehicles.add(vehicle);
	}

	public void removedrivinginstructor(Drivinginstructor drivinginstructor) {
		drivinginstructorlist.remove(drivinginstructor);
	}

	/*public void removedrivingsstudent(Drivingstudent drivingstudent) {
		drivingstudent.getDrivinginstructor().deleteStudent();
		studentList.remove(drivingstudent);

	}*/

	public void removevehicle(Vehicle vehicle) {
		vehicles.remove(vehicle);
	}

	public void drivingsstudentInStream(OutputStream os) {
		for(Drivingstudent a : studentList) {
			a.writeInStream(os);
		}
	}
	
	
	public void drivinginstructorInDatei(File f) {
		try (OutputStream fOS = new FileOutputStream(f)) {
			for (Drivinginstructor a : drivinginstructorlist) {
				a.writeInStream(fOS);
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public void drivingstudentInFile(File f) {
		try (OutputStream fOS = new FileOutputStream(f)) {
			for (Drivingstudent a : studentList) {
				a.writeInStream(fOS);
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public void vehiclesInFile(File f) {
		try (OutputStream fOS = new FileOutputStream(f)) {
			for (Vehicle a : vehicles) {
				a.writeInStream(fOS);
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}



}
