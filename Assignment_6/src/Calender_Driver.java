/*
 * name James
 * develop a program that calculates what day it is, the following day, the next day, and a day after you enter an adder
 */

import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Calender_Driver extends Application{
	/**
	 * 
	 * @param args
	 * the standard parameters
	 */
	public static void main(String[] args) {
			launch(args);
		}
			public void start(Stage primaryStage) {
				primaryStage.setTitle("What day is it");
				// Creating the labels and the fields for the GUI
				Label SetDayLbl = new Label("Date");
				Label AdderLbl = new Label("Add");
				TextField DayTxtFld  = new TextField();
				TextField AdderTxtFld = new TextField();
				String date;
				
				Button setdayBtn = new Button("Date");
				setdayBtn.setOnAction(new EventHandler<ActionEvent>() {
								
						@Override
						public void handle(ActionEvent arg0) {
							String date = "";
							date = DayTxtFld.getText();
						JOptionPane.showMessageDialog(null, date);
						}
						
						});
				
				Button nextdayBtn = new Button("Previous Date");
				nextdayBtn.setOnAction(new EventHandler<ActionEvent>() {
						//find the previous date
						@Override
						public void handle(ActionEvent arg0) {
							String [] days = new String[7];
							days[0] = "Sunday";
							days[1] = "Monday";
							days[2] = "Tuesday";
							days[3] = "Wednesday";
							days[4]= "Thursday";
							days[5] = "Friday";
							days[6] = "Saturday";
							String input = DayTxtFld.getText();
							for(int i=0;i<days.length;i++){
							if(input.equals(days[0])){
								JOptionPane.showMessageDialog(null, "The input is" + days[6]);
								break;
							}else{
							}if(input.equals(days[i])){
								JOptionPane.showMessageDialog(null, "The input is " + days[i-1]);
							}
							}
						}
						});
				
				Button previousdayBtn = new Button("Next Date");
				previousdayBtn.setOnAction(new EventHandler<ActionEvent>() {
								//find the next date
						@Override
						public void handle(ActionEvent arg0) {
							String [] days = new String[7];
							days[0] = "Sunday";
							days[1] = "Monday";
							days[2] = "Tuesday";
							days[3] = "Wednesday";
							days[4]= "Thursday";
							days[5] = "Friday";
							days[6] = "Saturday";
							String input = DayTxtFld.getText();
							for(int i=0;i<days.length;i++){
							if(input.equals(days[6])){
								JOptionPane.showMessageDialog(null, "The input is" + days[0]);
								break;
							}else{
							}if(input.equals(days[i])){
								JOptionPane.showMessageDialog(null, "The input is " + days[i+1]);
							}
							}
						}
						
						});
				
				Button AdderBtn = new Button("Adder");
				AdderBtn.setOnAction(new EventHandler<ActionEvent>() {
								//find the next day after you enter the adder to the intial date
						@Override
						public void handle(ActionEvent arg0) {
							int adder = 0;
							String adder1 = "";
							String date = "";
							String [] days = new String[7];
							days[0] = "Sunday";
							days[1] = "Monday";
							days[2] = "Tuesday";
							days[3] = "Wednesday";
							days[4]= "Thursday";
							days[5] = "Friday";
							days[6] = "Saturday";
							date = DayTxtFld.getText();
							adder1 = AdderTxtFld.getText();
							adder = Integer.parseInt(adder1);
							for(int i=0;i<days.length;i++){
							if(date.equals(days[i])){
								Math.abs(adder%7);
								JOptionPane.showMessageDialog(null, "The input is" + days[i+adder]);
								break;
							}else{
						}
							}
						}
						});
				
				
				//This is for the alignment and where the labels and text/password boxes go on GUI
				GridPane grid = new GridPane();
				grid.setAlignment(Pos.CENTER);
				grid.setVgap(10);
				grid.setHgap(10);
			    grid.add(DayTxtFld, 1, 0);
			    grid.add(SetDayLbl, 0, 0);
			    grid.add(AdderTxtFld, 1, 1);
			    grid.add(AdderLbl, 0, 1);
			    grid.add(setdayBtn, 2, 0);
			    grid.add(previousdayBtn, 2, 1);
			    grid.add(nextdayBtn, 2, 2);
			    grid.add(AdderBtn, 2, 3);
							
				
				Scene scene = new Scene(grid,500,500);
				primaryStage.setScene(scene);
				primaryStage.show();
				
				
				
		}
			

	}


