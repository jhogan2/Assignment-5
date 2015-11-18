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

//Create an application to read in an unordered list of 10 numbers from the user input (GUI) and this application will sort the number and output the sorted list to user (GUI).
//Read Chapter 7 P.512 (A Method that Return an array) and P.528 (Selection Sort)
public class Sorting extends Application {
	protected static final int[] SortedList = new int[10];
	public static void main(String[] args) {
	//	private static final int SIZE =10;
		//String[] SortedList={};
		launch(args);
		
		for(int z =0;z<SortedList.length;z++){
		System.out.println(SortedList[z]);
		}

	}
	@Override
	public void start(Stage primaryStage) {
			primaryStage.setTitle("Array Sorting");
			Label spotLbl1 = new Label("num1");
			Label spotLbl2 = new Label("num2");
			Label spotLbl3 = new Label("num3");
			Label spotLbl4 = new Label("num4");
			Label spotLbl5 = new Label("num5");
			Label spotLbl6 = new Label("num6");
			Label spotLbl7 = new Label("num7");
			Label spotLbl8 = new Label("num8");
			Label spotLbl9 = new Label("num9");
			Label spotLbl10 = new Label("num10");
			TextField num1 = new TextField();
			TextField num2 = new TextField();
			TextField num3 = new TextField();
			TextField num4 = new TextField();
			TextField num5 = new TextField();
			TextField num6 = new TextField();
			TextField num7 = new TextField();
			TextField num8 = new TextField();
			TextField num9 = new TextField();
			TextField num10 = new TextField();
			
			Button submitBtn = new Button("Sort");
			submitBtn.setOnAction(new EventHandler<ActionEvent>(){
				//String[] SortedList;
				String input1 = "";
				String input2 = "";
				String input3 = "";
				String input4 = "";
				String input5 = "";
				String input6 = "";
				String input7 = "";
				String input8 = "";
				String input9 = "";
				String input10 = "";
				
				@Override
				public void handle(ActionEvent arg0){
				input1 = num1.getText();
				SortedList[0]= Integer.parseInt(input1);
				input2 = num2.getText();
				SortedList[1]= Integer.parseInt(input2);
				input3 = num3.getText();
				SortedList[2]= Integer.parseInt(input3);
				input4 = num4.getText();
				SortedList[3]= Integer.parseInt(input4);
				input5 = num5.getText();
				SortedList[4]= Integer.parseInt(input5);
				input6 = num6.getText();
				SortedList[5]= Integer.parseInt(input6);
				input7 = num7.getText();
				SortedList[6]= Integer.parseInt(input7);
				input8 = num8.getText();
				SortedList[7]= Integer.parseInt(input8);
				input9 = num9.getText();
				SortedList[8]= Integer.parseInt(input9);
				input10 = num10.getText();
				SortedList[9]= Integer.parseInt(input10);
				
				for(int i=0;i<SortedList.length;i++){
					for(int j=1;j<SortedList.length;j++){
						if(SortedList[i]<SortedList[j]){
							int store = SortedList[i];
							SortedList[i] = SortedList[j];
							SortedList[j]=store;
							
						}
					}
				}
				
				
				}
			});
			
			GridPane grid = new GridPane();
			grid.setAlignment(Pos.CENTER);
			grid.setVgap(10);
			grid.setHgap(10);
			grid.add(spotLbl1, 0, 0);
			grid.add(num1, 1, 0);
			grid.add(spotLbl2, 0, 1);
			grid.add(num2, 1, 1);
			grid.add(spotLbl3, 0, 2);
			grid.add(num3, 1, 2);
			grid.add(spotLbl4, 0, 3);
			grid.add(num4, 1, 3);
			grid.add(submitBtn, 1, 10);
			grid.add(spotLbl5, 0, 4);
			grid.add(num5, 1, 4);
			grid.add(spotLbl6, 0, 5);
			grid.add(num6, 1, 5);
			grid.add(spotLbl7, 0, 6);
			grid.add(num7, 1, 6);
			grid.add(spotLbl8, 0, 7);
			grid.add(num8, 1, 7);
			grid.add(spotLbl9, 0, 8);
			grid.add(num9, 1, 8);
			grid.add(spotLbl10, 0, 9);
			grid.add(num10, 1, 9);
			Scene scene = new Scene(grid,500,500);
			primaryStage.setScene(scene);
			primaryStage.show();
		}
}
