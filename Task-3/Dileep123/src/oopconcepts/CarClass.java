package oopconcepts;

public class CarClass {
	
	//Various States
	//color
	private String color;
	//model
	private String model;
	//make
	private String make;
	//year
	private int year;
	int speed;
	int gear;
	
	public CarClass() {
		this.speed = 0;
		this.gear = 0;
		System.out.println("Executing Constructor without arguments!!");
	}
	public CarClass(int speed, int gear) {
		this.speed=speed;
		this.gear=gear;
		System.out.println("Executing Constructor with arguments!!");
	}
	
	public void increaseSpeed() {
		System.out.println("Increasing the speed");
		
	}

	public String getMake() {
		return make;
	}
	
	public void setMake(String make) {
		this.make = make;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year < 1900) {
			this.year = year;
		} else {
			System.out.println("The car didn't make!!!");
		} 		
	}
	
}
