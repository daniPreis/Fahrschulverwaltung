package fachlogik;

public class Adress {

	private int pLZ;
	private String city;
	private String street;
	private int housenr;

	public Adress(int pLZ, String city, String street, int housenr) {
		this.setPLZ(pLZ);
		this.setcity(city);
		this.setStreet(street);
		this.sethousenr(housenr);
	}

	public int getPLZ() {
		return pLZ;
	}

	public void setPLZ(int pLZ) {
		this.pLZ = pLZ;
	}

	public String getcity() {
		return city;
	}

	public void setcity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int gethousenr() {
		return housenr;
	}

	public void sethousenr(int housenr) {
		this.housenr = housenr;
	}

	public String toString() {
		return pLZ + " " + city + " " + street + " " + housenr;
	}
}
