package fachlogik;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class  Vehicle {
	
	private String id;
	private String model;
	private String admissionClass;
	private String manufacturer;
	private int constructionYear;
	
	public  Vehicle(String id,String model, String admissionClass, String manufacturer, int constructionYear) {
		this.setId(id);
		this.setmodel(model);
		this.setadmissionClass(admissionClass);
		this.setmanufacturer(manufacturer);
		this.setconstructionYear(constructionYear);
	}

	private void setmodel(String model) {
		this.model = model;
		
	}

	public String getadmissionClass() {
		return admissionClass;
	}

	public void setadmissionClass(String admissionClass) {
		this.admissionClass = admissionClass;
	}

	public String getmanufacturer() {
		return manufacturer;
	}

	public void setmanufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getconstructionYear() {
		return constructionYear;
	}

	public void setconstructionYear(int constructionYear) {
		this.constructionYear = constructionYear;
	}



	public void writeInStream(OutputStream os) {

		String s = model + admissionClass + manufacturer + constructionYear; 
		OutputStreamWriter oSW = new OutputStreamWriter(os);
		try {
			oSW.write(s.toCharArray());
			oSW.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
}
