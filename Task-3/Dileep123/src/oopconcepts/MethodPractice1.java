package oopconcepts;

public class MethodPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String studentName;
		String grade1;
		
		studentName = "Rajesh";
		grade1 = studentAttendence(60);
		displayGrades(studentName,grade1);

		studentName = "FlexTrade";
		grade1 = studentAttendence(100);
		displayGrades(studentName,grade1);
		
		studentName = "Anitha";
		grade1 = studentAttendence(75);
		displayGrades(studentName,grade1);
		
		studentName = "TTTTTT";
		grade1 = studentAttendence(50);
		displayGrades(studentName,grade1);
		
		studentName = "SSSSSS";
		grade1 = studentAttendence(45);
		displayGrades(studentName,grade1);
	}
	
	public static String studentAttendence(int attendence) {
		//String studentName="Rajesh";
		//int attendence = 49;
		String grade;
		if(attendence >= 90 && attendence <= 100) {
			grade = "A++";
		}else if(attendence >= 75 && attendence < 90) {
			grade = "A+";
		}else if(attendence >= 60 && attendence < 75) {
			grade = "B+";
		}else if(attendence >= 50 && attendence < 60) {
			grade = "B";
		}else {
			grade = "Not Qualified";
		}
		//System.out.println("Attendence for "+ studentName+" = "+grade);
		return grade;
	}
	public static void displayGrades(String studentName2, String grade2) {
		System.out.println("Grade of " + studentName2 + " is:" + grade2);
	}
}
