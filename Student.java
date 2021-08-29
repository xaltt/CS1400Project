/*-------------------------------------------------------------
//AUTHOR: Samuel Nunez
//FILENAME: Student.java
//SPECIFICATION: A template file for the Student class.
//FOR: CS1400 Lab 5
//------------------------------------------------------------**/

public class Student {
	private String firstName, lastName, fullName, broncoId;
	private double grade;
	
	//sets the variables equal to the appropriate values
	public Student(String firstName, String lastName, String broncoId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.broncoId = broncoId;
		this.fullName = firstName + " " +  lastName;
		this.grade = -1;
	}
	
	 public void setGrade(double newGrade) {
		 grade = newGrade;
	 }
	 
	//getters that return the variables to main program
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getFullName() {
		return fullName;
	}

	public String getBroncoId() {
		return broncoId;
	}

	public double getGrade() {
		return grade;
	}
	
	public String toString() {
        return String.format("Student: %s, BroncoId: %s, Grade: %s",
                fullName, broncoId, grade);
    }
}
