import java.util.Collections;

import javax.swing.JOptionPane;

import com.sun.prism.paint.Color;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
public class Assignment_4Driver extends Application {
	private  static final int SIZE = 10;
	private  static Assignment_4 [] users = new Assignment_4[SIZE];
	private int index =0;
	public static void main(String[] args) {
		launch(args);
		
		}
	
	
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Sign Up Page");
		// Creating the labels and the fields for the GUI
		Label errorLb1 = new Label("Error,password and confirm password not the same");
		errorLb1.setTextFill(javafx.scene.paint.Color.RED);
		errorLb1.setVisible(false);
		Label userNameLb1 = new Label("User Name");
		Label passwordLb1 = new Label("Password");
		Label passwordLb2 = new Label("Comfirm Password");
		Label NameLb1 = new Label("Name");
		Label EmailLb1 = new Label("Email");
		Label LastNameLb1 = new Label("Last Name");
		Label AcTypeCmbBoxLb1 = new Label("Account Type");
		TextField NameTxtFld = new TextField();
		TextField EmailTxtFld = new TextField();
		TextField LastNameTxtFld = new TextField();
		TextField userNameTxtFld = new TextField();
		PasswordField pwTxtFld = new PasswordField();
		PasswordField pw2TxtFld = new PasswordField();
		ComboBox AcTypeCmbBox = new ComboBox();
		AcTypeCmbBox.getItems().addAll(Assignment4_Enum.values());
		
		Button submitBtn = new Button("Sign Up");
		submitBtn.setOnAction(new EventHandler<ActionEvent>() {
			String inputUserName = "";
			String inputPw = "";
			String inputEmail = "";
			String inputPw2 = "";
			String inputName= "";
			String inputLName = "";
			
			
				@Override
				public void handle(ActionEvent arg0) {
					//these to Strings are to check to see if the password and the email have specific characters in them 
					//email validator http://stackoverflow.com/questions/624581/what-is-the-best-java-email-address-validation-method
					String pwregexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,10}$";
					String emailchecker = ("^.+@.+\\..+$");
					inputUserName = userNameTxtFld.getText().toLowerCase();
					inputPw = pwTxtFld.getText();
					inputPw2 =pw2TxtFld.getText();
					inputEmail = EmailTxtFld.getText();		
					inputName = NameTxtFld.getText();
					inputLName = LastNameTxtFld.getText();
					users[index] = new Assignment_4(inputUserName, inputPw,inputEmail,inputName,inputLName);
					index++;
					validate(pwTxtFld);//runs the validate class on the password field
					validate(pw2TxtFld);//runs the validate class on the confirm password field 
					//Checks to see if password meets the requirements and matches confirm password
					if(inputPw.matches(pwregexp) && inputPw.equals(inputPw2)){
						JOptionPane.showMessageDialog(null,"Password is good");
					}else{
						errorLb1.setVisible(true);
						JOptionPane.showMessageDialog(null, "Password doesn't match comfirm password or meet requirements, try again");
					}
					//Checking to see if email has specific requirements
					if(inputEmail.matches(emailchecker)){
						JOptionPane.showMessageDialog(null, "Email is good");
					}else{
				       
						JOptionPane.showMessageDialog(null, "Email does not match requirements");
						
					}
	
					
					//Checking to see if fields are empty or not
					if (userNameTxtFld.getText() != null && ! userNameTxtFld.getText().trim().isEmpty()) {
					}else{userNameTxtFld.setStyle("-fx-border-color: red;");}
					if (pwTxtFld.getText() != null && ! pwTxtFld.getText().trim().isEmpty()) {
					}else{pwTxtFld.setStyle("-fx-border-color: red;");}
					if (EmailTxtFld.getText() != null && ! EmailTxtFld.getText().trim().isEmpty()) {
					}else{EmailTxtFld.setStyle("-fx-border-color: red;");}
					if (pw2TxtFld.getText() != null && ! pw2TxtFld.getText().trim().isEmpty()) {
					}else{pw2TxtFld.setStyle("-fx-border-color: red;");}
					if (NameTxtFld.getText() != null && ! NameTxtFld.getText().trim().isEmpty()) {
					}else{NameTxtFld.setStyle("-fx-border-color: red;");}
					if (LastNameTxtFld.getText() != null && ! LastNameTxtFld.getText().trim().isEmpty()) {
					}else{LastNameTxtFld.setStyle("-fx-border-color: red;");}
					
					//JOptionPane.showConfirmDialog(null, "Acocunt created, confirmation email has been sent. create another?");
					JOptionPane.showMessageDialog(null, users[0]);
				}
				
				});
		//This is for the alignment and where the labels and text/password boxes go on GUI
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setVgap(10);
		grid.setHgap(10);
		grid.add(userNameLb1, 0, 0);
		grid.add(userNameTxtFld, 1, 0);
		grid.add(passwordLb1, 0, 1);
		grid.add(pwTxtFld, 1, 1);
		grid.add(passwordLb2, 0, 2);
		grid.add(pw2TxtFld,1,2);
		grid.add(LastNameLb1, 0, 3);
		grid.add(LastNameTxtFld, 1, 3);
		grid.add(EmailLb1, 0, 5);
		grid.add(EmailTxtFld, 1, 5);
		grid.add(NameLb1, 0, 4);
		grid.add(NameTxtFld, 1, 4);		
		grid.add(submitBtn, 1, 7);
		grid.add(AcTypeCmbBoxLb1, 0, 6);
		grid.add(AcTypeCmbBox, 1, 6);
        grid.add(errorLb1, 0, 8);	
		
		
		Scene scene = new Scene(grid,500,500);
		scene.getStylesheets().add(getClass().getResource("Assignment4css.css").toExternalForm());//Locating and running the CSS file so that it can be used
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		
	}
	//This is to check to see if password and confirm password are the same
	//website where code was acquired
	//http://stackoverflow.com/questions/24231610/javafx-red-border-for-text-field
	private void validate(TextField tf) {
        ObservableList<String> styleClass = tf.getStyleClass();
        if (tf.getText().trim().length()==0) {
            if (! styleClass.contains("error")) {
                styleClass.add("error");
            }
        } else {
            // remove all occurrences:
            styleClass.removeAll(Collections.singleton("error"));                    
        }
    }
}
