package objeto;

public class Direccion {
	
	//VARIABLES
	
	private String location;
	private String road;
	private String number;
	private String floor;
	private String letter;

	
	// CONSTRUCTOR
	
	public Direccion(String location, String road, String number, String floor, String letter) {
		this.location = location;
		this.road = road;
		this.number = number;
		this.floor = floor;
		this.letter = letter;
	}


	public String getLocation() {
		return location;
	}

	// GETTER & SETTER

	public void setLocation(String location) {
		this.location = location;
	}


	public String getRoad() {
		return road;
	}


	public void setRoad(String road) {
		this.road = road;
	}


	public String getNumber() {
		return number;
	}


	public void setNumber(String number) {
		this.number = number;
	}


	public String getFloor() {
		return floor;
	}


	public void setFloor(String floor) {
		this.floor = floor;
	}


	public String getLetter() {
		return letter;
	}


	public void setLetter(String letter) {
		this.letter = letter;
	}	
	
	
	
	
	

}
