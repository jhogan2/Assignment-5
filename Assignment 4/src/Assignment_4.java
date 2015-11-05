

public class Assignment_4 {
//attributes
	private String username;
	private String password;
	private Assignment4_Enum accounttype;
	private String email;
	private String lastName;
	private String name;
	
	public Assignment_4(){
		username = "test";
		password = "password";
		accounttype =Assignment4_Enum.Student; //make an Enum
	}
	
	public Assignment_4(String username){
		this.username = username;
		password = "password";
		accounttype = Assignment4_Enum.Student;
	}
	
	public Assignment_4(String username, String password,String email,String name,String lastname){
		this.username = username;
		this.password = password;
		this.email = email;
		this.name = name;
		this.lastName = lastname;
		accounttype = Assignment4_Enum.Student;
	}
		
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username =username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Assignment4_Enum getAccounttype() {
		return accounttype;
	}
	
	//public void setAccounttype(accounttype) {
	//	this.accounttype = accounttype;
	//}
	
	public String getEmail(){
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getlastName(){
		return lastName;
	}
	
	public void setlastName(String lastName){
		this.lastName = lastName;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String toString() {
		return "username is " +  this.username + ", password is " + this.password + ", accounttype is " + this.accounttype + ", email is " + this.email + ", last name is " +this.lastName + ", name is "+ this.name + ".";
	}
}
