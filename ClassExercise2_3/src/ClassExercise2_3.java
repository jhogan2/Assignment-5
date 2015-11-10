import javax.swing.JOptionPane;

public class ClassExercise2_3 {

	public static void main(String[] args) {
		String cm = "";
		cm=JOptionPane.showInputDialog("what is your height in centimeters ");
		Double intstore = Double.parseDouble(cm); //used to store and convert a String to a valid input for an expression
		Double CMtoIN =intstore*0.39; // Formula to convert from centimeters to inches 
		JOptionPane.showMessageDialog(null, "the value in inches is: "+ 
		CMtoIN +"ins." );
		Double INtoFT =CMtoIN/12; //Formula to convert from inches to feet
		JOptionPane.showMessageDialog(null, "The value in feet is: "+ INtoFT+"ft");

	}

}
