import javax.swing.JOptionPane;

public class Calender_Class {
private String [] days = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
private String Date = "";
private int Adder = 0;
private String PreviousDate = "";
private String NextDate = "";





public Calender_Class(String previousDate,String[] days) {
	this.days = days;
	PreviousDate = previousDate;
}

public void setPreviousDate(String previousDate) {
	PreviousDate = previousDate;
}

public String getPreviousDate() {
	return PreviousDate();
}

public String PreviousDate(){
	String result="";
	for(int i=0;i<days.length;i++){
	if(PreviousDate.matches(days[0])){
			JOptionPane.showMessageDialog(null, days[6]);
		}else{
		}
			if(PreviousDate.equals(days[i])){
			JOptionPane.showMessageDialog(null, days[i-1]);
	}
		}
	return result;
	}

public String getNextDate() {
	return NextDate;
}
public void setNextDate(String nextDate) {
	NextDate = nextDate;
}
public String getDate() {
	return Date;
}
public void setDate(String date) {
	Date = date;
}
public int getAdder() {
	return Adder;
}
public Calender_Class(String[] days, String date, int adder) {
	this.days = days;
	Date = date;
	Adder = adder;
}
public void setAdder(int adder) {
	
	Adder = adder;
}

//public String CalcDay(){
//	int adder = 0;
	//String adder1 = "";
	//String date = "";
	//String [] days = new String[7];
	//days[0] = "Sunday";
	//days[1] = "Monday";
	//days[2] = "Tuesday";
	//days[3] = "Wednesday";
	//days[4]= "Thursday";
	//days[5] = "Friday";
	//days[6] = "Saturday";
	//for(int i=0;i<days.length;i++){
	//if(date.equals(days[i])){
	//	adder%=7;
	//	JOptionPane.showMessageDialog(null, "The input is" + days[i+adder]);
	//	break;
//	}//else{
//}
	//}

//	return result;
//}

}
