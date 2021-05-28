package entities;

public class Student {
	public String name;
	public double gradeS1;
	public double gradeS2;
	public double gradeS3;
	public double minGrade;

	
	public double finalGrade() {
		return (gradeS1 + gradeS2 + gradeS3);
	}

	public String success(double minGrade) {
		if (finalGrade() >= minGrade) {
			return ("PASSED");
		}
		else {
			return ("FAILED");
		}
	}
	
	public double missingPoints() {
		if (success(minGrade) == "PASSED") {
			return 0.00;
		}
		else {
			return (minGrade - finalGrade()); 
		}
	}
	
}
