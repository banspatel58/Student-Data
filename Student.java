// Honor Pledge:
//
// I pledge that I have neither given nor 
// received any help on this assignment.
//
// banspate

import java.util.Scanner;

public class Student{
		
		private String firstName;
		private String lastName;
		private String ID;
		private String GPA;
		private Address studentAddress;
		String[] studentInfo;
		//default constructor
		public Student(){
			
			
			
		}
		//overloaded constructor
		public Student(String ID, String firstName, String lastName, String GPA){
			
			this.ID = ID;
			this.firstName = firstName;
			this.lastName = lastName;
			this.GPA = GPA;
			
		}
		//assign what part of text file is student info
		public Student(String[] studentInfo){
			
			this.firstName = studentInfo[0];
			this.lastName = studentInfo[1];
			this.ID = studentInfo[7];
			this.GPA = studentInfo[8];
			studentAddress = new Address(studentInfo);
			
			
		}
		//getter method for fist name
		public String getFirstName(){
			
			return this.firstName;
			
		}
		//getter method for last name
		public String getLastName(){
			
			return this.lastName;
			
		}
		//getter method for student id
		public String getID(){
			
			return this.ID;
			
		}
		//getter method for student GPA
		public String getGPA(){
			
			return this.GPA;
			
		}
		//if all info is available than return the Full student data
		public String getFullStudentData(){
			
			return ( "ID: " + this.ID + "\t" + " Name: " + this.firstName + " " + this.lastName + "\t"+ studentAddress.checkNullValues() +  "\t\t\t" + "GPA: " + this.GPA  );
			
		}
		
}
	
	
