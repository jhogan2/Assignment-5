package personclass;

public class Person {
// attributes
	private String name;
	private int age;
	private int height;
	private String race;
	private String haircolor;
	private String eyecolor;
	
	
	//constructor: a method that initializes the values of the attributes
	public Person(){
		
	}
	
	public Person(String name, int age, int height, String race, String haircolor, String eyecolor) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.race = race;
		this.haircolor = haircolor;
		this.eyecolor = eyecolor;
	}
	//behaviors
	public String speak() {
		return "Hello";
	}
	
	public String getName() {
		return name;
		}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int  getage() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public String getRace() {
		return race;
	}
	
	public void setRace(String race) {
		this.race = race;
	}
	
	public String gethairColor() {
		return haircolor;
	}
	
	public void sethairColor(String haircolor) {
		this.haircolor = haircolor;
	}
	
	public String geteyeColor() {
		return eyecolor;
	}
	
	public void seteyeColor(String eyecolor) {
		this.eyecolor = eyecolor;
	}
	
	public String toString() {
		return "name is " + this.name + " ,age is " + this.age + " ,height is " + this.height + " ,race is " + this.race + " ,haircolor is " + this.haircolor + " ,eyecolor is " + this.eyecolor +".";
	}
}
