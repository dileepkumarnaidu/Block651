package oopconcepts;

public class ClassDemo {

	public static void main(String[] args) {
		
		CarClass bmw = new CarClass(); //Create and Initialize Objects
		CarClass benz = new CarClass(); 
		
		bmw.setMake("BMW");
		System.out.println("Make of BWM is: " + bmw.getMake());
		
		benz.setMake("BenZ");
		System.out.println("Make of Benz is:  " + benz.getMake());
		
		bmw.setColor("Yellow");
		System.out.println("Color of BMW is: " + bmw.getColor());
		
		bmw.setModel("Series-5");
		System.out.println("Model of BMW is: " + bmw.getModel());
		
		benz.setColor("Red");
		System.out.println("Color Benz is: " + benz.getColor());
		
		bmw.setYear(2019);
		System.out.println("Year of BMW is: " + bmw.getYear());		

	}

}
