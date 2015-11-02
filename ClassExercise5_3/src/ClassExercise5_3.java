
public class ClassExercise5_3 {
	private String carcolor;
	private String horsepower;
	private String enginesize;
	
	public ClassExercise5_3(){
		carcolor ="red";
		horsepower = "275";
		enginesize = "3";
	}
	
	public ClassExercise5_3(String carcolor, String horsepower, String enginesize){
		this.carcolor = carcolor;
		this.horsepower = horsepower;
		this.enginesize = enginesize;
	}
	
	public String getcarcolor() {
		return carcolor;
	}
	
	public void setcarcolor(String carcolor) {
		this.carcolor = carcolor;
	}
	
	public String gethorsepower() {
		return horsepower;
	}
	
	public void sethorsepower(String horsepower) {
		this.horsepower = horsepower;
	}
	
	public String getenginsize(){
		return enginesize;
	}
	
	public void setenginesize(String enginesize){
		this.enginesize = enginesize;		
	}
	
	public String toString() {
		return "color is " + carcolor + ", horsepower " + horsepower + ", enginsize " + enginesize;		
	}
}


