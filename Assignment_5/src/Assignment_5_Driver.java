import java.util.Collections;

import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
/**
 * 
 * @author James
 *
 */

public class Assignment_5_Driver extends Application {
/**
 * 
 * @param args
 * basic parameters of the class
 */
	public static void main(String[] args) {
		launch(args);
	}
		@Override
		
		public void start(Stage primaryStage) {
			primaryStage.setTitle("Calc GPA");
			// Creating the labels and the fields for the GUI
			Label Test1Lb1 = new Label("Test 1");
			Label Test2Lb1 = new Label("Test 2");
			Label Test3Lb1 = new Label("Test 3");
			Label Test4Lb1 = new Label("Test 4");
			Label NameLb1 =  new Label("Name");
			TextField NameTxtFld  = new TextField();
			TextField Test1TxtFld = new TextField();
			TextField Test2TxtFld = new TextField();
			TextField Test3TxtFld = new TextField();
			TextField Test4TxtFld = new TextField();
			TextField WeightTxtFld1 = new TextField();
			TextField WeightTxtFld2 = new TextField();
			TextField WeightTxtFld3 = new TextField();
			TextField WeightTxtFld4 = new TextField();
			
			Button submitBtn = new Button("Calculate");
			submitBtn.setOnAction(new EventHandler<ActionEvent>() {
							
					@Override
					public void handle(ActionEvent arg0) {
						//This is to check to see if any of the fields are empty and if they are when the button is pushed it does nothing
						if (Test1TxtFld.getText() != null && ! Test1TxtFld.getText().trim().isEmpty()) {
						}else
						{Test1TxtFld.setStyle("-fx-border-color: red;"); 
						submitBtn.setDisable(true);}
						if (Test2TxtFld.getText() != null && ! Test2TxtFld.getText().trim().isEmpty()) {
						}else
						{Test2TxtFld.setStyle("-fx-border-color: red;"); 
						submitBtn.setDisable(true);}
						if (Test3TxtFld.getText() != null && ! Test3TxtFld.getText().trim().isEmpty()) {
						}else
						{Test3TxtFld.setStyle("-fx-border-color: red;"); 
						submitBtn.setDisable(true);}
						if (Test4TxtFld.getText() != null && ! Test4TxtFld.getText().trim().isEmpty()) {
						}else
						{Test4TxtFld.setStyle("-fx-border-color: red;"); 
						submitBtn.setDisable(true);}
						if (WeightTxtFld1.getText() != null && ! WeightTxtFld1.getText().trim().isEmpty()) {
						}else
						{WeightTxtFld1.setStyle("-fx-border-color: red;"); 
						submitBtn.setDisable(true);}
						if (WeightTxtFld2.getText() != null && ! WeightTxtFld2.getText().trim().isEmpty()) {
						}else
						{WeightTxtFld2.setStyle("-fx-border-color: red;"); 
						submitBtn.setDisable(true);}
						if (WeightTxtFld3.getText() != null && ! WeightTxtFld3.getText().trim().isEmpty()) {
						}else
						{WeightTxtFld3.setStyle("-fx-border-color: red;"); 
						submitBtn.setDisable(true);}
						if (WeightTxtFld4.getText() != null && ! WeightTxtFld4.getText().trim().isEmpty()) {
						}else
						{WeightTxtFld4.setStyle("-fx-border-color: red;"); 
						submitBtn.setDisable(true);}
						if (NameTxtFld.getText() != null && ! NameTxtFld.getText().trim().isEmpty()) {
						}else
						{NameTxtFld.setStyle("-fx-border-color: red;");
						submitBtn.setDisable(true);}
						
						
						
						//declaring all of my variables
						double [] TestScores = new double[4];
						double [] TestWeights = new double[4];
						String test1,test2,test3,test4,weight1,weight2,weight3,weight4,name;
						//passing my text from the textfield to a double value so that it can be read in the array
						test1 = Test1TxtFld.getText();
						 TestScores[0]= Integer.parseInt(test1);
						test2= Test2TxtFld.getText();
						TestScores[1]= Integer.parseInt(test2);
						test3= Test3TxtFld.getText();
						TestScores[2]= Integer.parseInt(test3);
						test4= Test4TxtFld.getText();
						TestScores[3]= Integer.parseInt(test4);
						weight1= WeightTxtFld1.getText();
						TestWeights[0] = Double.parseDouble(weight1);
						weight2= WeightTxtFld2.getText();
						TestWeights[1] = Double.parseDouble(weight2);
						weight3= WeightTxtFld3.getText();
						TestWeights[2] = Double.parseDouble(weight3);
						weight4= WeightTxtFld4.getText();
						TestWeights[3] = Double.parseDouble(weight4);
						
						name = NameTxtFld.getText();
						
						
						//declaring my class and passing the declared constants here to go in the class
						Assignment_5_Class Student = new Assignment_5_Class(name,TestScores,TestWeights);
						
						JOptionPane.showMessageDialog(null, Student);
					}
					
					});
			//This is for the alignment and where the labels and text/password boxes go on GUI
			GridPane grid = new GridPane();
			grid.setAlignment(Pos.CENTER);
			grid.setVgap(10);
			grid.setHgap(10);
			grid.add(Test1Lb1, 0, 0);
			grid.add(Test1TxtFld, 1, 0);
			grid.add(WeightTxtFld1, 2, 0);
			grid.add(Test2Lb1, 0, 1);
			grid.add(Test2TxtFld, 1, 1);
			grid.add(WeightTxtFld2, 2, 1);
			grid.add(Test3Lb1, 0, 2);
			grid.add(Test3TxtFld,1,2);
			grid.add(WeightTxtFld3, 2, 2);
			grid.add(Test4Lb1, 0, 3);
			grid.add(Test4TxtFld, 1, 3);
			grid.add(WeightTxtFld4, 2, 3);
			grid.add(NameLb1, 0, 4);
			grid.add(NameTxtFld, 1, 4);
			grid.add(submitBtn, 0, 5);
						
			
			Scene scene = new Scene(grid,500,500);
			primaryStage.setScene(scene);
			primaryStage.show();
			
			
			
	}
		

}
