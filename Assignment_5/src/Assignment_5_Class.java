
public class Assignment_5_Class {
	private double [] TestScores =new double[4];
	private double [] TestWeights = new double[4];
	private String name = "";
	private double gpa = 0.0;
	
	
	public Assignment_5_Class() {
			name = "";
			TestScores= new double[4];
			gpa=0;
	}
	
	
	public Assignment_5_Class(String name, double[] testScores, double[] testWeights) {
		TestScores = testScores;
		TestWeights = testWeights;
		this.name = name;
	}


	public double[] getTestScores() {
		return TestScores;
	}

	public void setTestScores(double[] testScores) {
		TestScores = testScores;
	}

	public double[] getTestWeights() {
		return TestWeights;
	}

	public void setTestWeights(double[] testWeights) {
		TestWeights = testWeights;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGpa() {
		return calculateAVGScore();
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	//calculates the GPA
	private double calculateAVGScore(){
		double sum=0;		
		for(int i=0;i<TestScores.length;i++){
			sum += (TestWeights[i]* TestScores[i]);
			
		}
		return sum;
	}
	//returns all the values of the class
	public String toString() {
		String info="";
		info = "Student Name: " + this.name;
		for(int i=0;i<TestScores.length;i++){
			info+="\n Assignments "+ (i+1) + "     " + TestScores[i] + "\n";
		}
		info+="GPA: " + getGpa();
		return info;
		}
	}
	
	
	
	

