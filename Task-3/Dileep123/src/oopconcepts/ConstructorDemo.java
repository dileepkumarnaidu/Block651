package oopconcepts;

public class ConstructorDemo {

	public static void main(String[] args) {
		
		CarClass c1 = new CarClass();

		
		c1.setMake("BWM");
		System.out.println(c1.getMake());

		System.out.println(c1.speed);
		System.out.println(c1.gear);

		System.out.println("********************");
		CarClass c2 = new CarClass(25,1);
		System.out.println(c2.speed);
		System.out.println(c2.gear);
	}

}
