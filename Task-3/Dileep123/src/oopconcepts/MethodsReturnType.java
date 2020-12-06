package oopconcepts;

public class MethodsReturnType {

	public static void main(String[] args) {
		
		String studentName;
		String grade;
		
		studentName = "Kiran";
		grade = findGrades(90);
		displayGrades(studentName, grade);
		
		studentName = "Surya";
		grade = findGrades(70); 
		displayGrades(studentName, grade);
		
		studentName = "Tiny";
		grade= findGrades(81);
		displayGrades(studentName, grade);
		
		studentName = "Venkat";
		grade = findGrades(60);
		displayGrades(studentName, grade);
	}
	
	public static String findGrades(int score) {
		String grade;
		if (score >= 90 && score <= 100) {
			grade = "A";
		} else if (score >= 80 && score < 90) {
			grade = "B";
		} else if (score >= 70 && score < 80) {
			grade = "C";
		} else {
			grade = "D";
		}
		return grade;
	}

	public static void displayGrades(String studentName, String grade) {
		System.out.println("******************************");
		System.out.println("Grade of " + studentName + " is:" + grade);
		System.out.println("******************************");
	}
}
