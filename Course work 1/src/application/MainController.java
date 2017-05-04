package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class MainController {
	
	public static int finalCredit4;
	public static int finalCredit5;
	public static int finalCredit6;
	public static int totalL5;
	public static int totalL6;
	public static int min5=100;
	public static int min6=100;
	public static int avg0;
	public static int avg00;
	public static int avgRe1;
	public static int avgRe2;
	public static String name;
	public static int id;

	// Login Window
	@FXML
	private Label lblvalid;
	@FXML
	private TextField txtuser, txtpass,txtName,txtId;

	public void Login(ActionEvent event) throws Exception {
		if (txtuser.getText().equals("chamod") && txtpass.getText().equals("2015300")) {
			Stage primaryStage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("/application/Student.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} else {
			lblvalid.setText("Login Failed");
		}
	}

	// Cancel Button
	@FXML
	private Button btncancel;

	@FXML
	private void cancelAction() {
		Stage primaryStage = (Stage) btncancel.getScene().getWindow();
		primaryStage.close();
	}
	//Add a Student
	public void add(ActionEvent event) {
		name=txtName.getText();
		id=Integer.parseInt(txtId.getText());
	}
	public void next(ActionEvent event) throws Exception {
		if (!(txtName.getText().isEmpty() && txtId.getText().isEmpty())) {
			Stage primaryStage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("/application/Level04.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		}
	}

	// Level 04 Modules Window
	@FXML
	private TextField L4M1Ict01, L4M1Ict02, L4M1Ict03, L4M2Ict01, L4M2Ict02, L4M2Ict03, L4M3Ict01, L4M3Ict02, L4M3Ict03,
			L4M4Ict01, L4M4Ict02, L4M4Ict03, L4M5Ict01, L4M5Ict02, L4M5Ict03, L4M6Ict01, L4M6Ict02, L4M6Ict03, txtcon;
	@FXML
	private Label lblM1, lblM2, lblM3, lblM4, lblM5, lblM6, lblP1, lblP2, lblP3, lblP4, lblP5, lblP6, lblcon1, lblcon2,
			lblcon3, lblcon4, lblcon5, lblcon6, lblcredit, lblmessage, lblmessage1, lblce;

	public void getinputs(ActionEvent event) {
		// Module-01
		int marks1 = Integer.parseInt(L4M1Ict01.getText());
		int marks2 = Integer.parseInt(L4M1Ict02.getText());
		int marks3 = Integer.parseInt(L4M1Ict03.getText());
		int total1 = 0, avg1 = 0;
		if (marks1<=100&&marks2<=100&&marks3<=100){
		total1 = (marks1 + marks2 + marks3);
		avg1 = total1 / 3;
		lblM1.setText(Integer.toString(avg1));
		if ((marks1 < 40 && marks2 < 40) || (marks2 < 40 && marks3 < 40) || (marks1 < 40 && marks3 < 40)) {
			lblcon1.setText("");
		} else if (marks1 < 40 || marks2 < 40 || marks3 < 40) {
			lblcon1.setText("CONDONED");
		}
		if (avg1 >= 40 && (marks1 < 40 || marks2 < 40 || marks3 < 40)) {
			lblP1.setText("PASS");
			lblcon1.setText("CONDONED");
		} else if (avg1 >= 40) {
			lblP1.setText("PASS");
			lblcon1.setText("");
		} else if (avg1 >= 30) {
			lblP1.setText("RESIT");
			lblcon1.setText("CONDONED");
		} else if (avg1 < 30) {
			lblP1.setText("RETAKE");
			lblcon1.setText("");
		}
		}else{
			lblP1.setText("Invalid");
		}
		// Module-02
		int marks21 = Integer.parseInt(L4M2Ict01.getText());
		int marks22 = Integer.parseInt(L4M2Ict02.getText());
		int marks23 = Integer.parseInt(L4M2Ict03.getText());
		int total2 = 0, avg2 = 0;
		if (marks21<=100&&marks22<=100&&marks23<=100){
		total2 = (marks21 + marks22 + marks23);
		avg2 = total2 / 3;
		lblM2.setText(Integer.toString(avg2));
		if ((marks21 < 40 && marks22 < 40) || (marks22 < 40 && marks23 < 40) || (marks21 < 40 && marks23 < 40)) {
			lblcon2.setText("");
		} else if (marks21 < 40 || marks22 < 40 || marks23 < 40) {
			lblcon2.setText("CONDONED");
		}
		if (avg2 >= 40 && (marks21 < 40 || marks22 < 40 || marks23 < 40)) {
			lblP2.setText("PASS");
			lblcon2.setText("CONDONED");
		} else if (avg2 >= 40) {
			lblP2.setText("PASS");
			lblcon2.setText("");
		} else if (avg2 >= 30) {
			lblP2.setText("RESITE");
			lblcon2.setText("CONDONED");
		} else if (avg2 < 30) {
			lblP2.setText("RETAKE");
			lblcon2.setText("");
		}
		}else{
			lblP2.setText("Invalid");
		}
		// Module-03
		int marks31 = Integer.parseInt(L4M3Ict01.getText());
		int marks32 = Integer.parseInt(L4M3Ict02.getText());
		int marks33 = Integer.parseInt(L4M3Ict03.getText());
		int total3 = 0, avg3 = 0;
		if (marks31<=100&&marks32<=100&&marks33<=100){
		total3 = (marks31 + marks32 + marks33);
		avg3 = total3 / 3;
		lblM3.setText(Integer.toString(avg3));
		if ((marks31 < 40 && marks32 < 40) || (marks32 < 40 && marks33 < 40) || (marks31 < 40 && marks33 < 40)) {
			lblcon3.setText("");
		} else if (marks31 < 40 || marks32 < 40 || marks33 < 40) {
			lblcon3.setText("CONDONED");
		}
		if (avg3 >= 40 && (marks31 < 40 || marks32 < 40 || marks33 < 40)) {
			lblP3.setText("PASS");
			lblcon3.setText("CONDONED");
		} else if (avg3 >= 40) {
			lblP3.setText("PASS");
			lblcon3.setText("");
		} else if (avg3 >= 30) {
			lblP3.setText("RESITE");
			lblcon3.setText("CONDONED");
		} else if (avg3 < 30) {
			lblP3.setText("RETAKE");
			lblcon3.setText("");
		}
		}else{
			lblP3.setText("Invalid");
		}
		// Module-04
		int marks41 = Integer.parseInt(L4M4Ict01.getText());
		int marks42 = Integer.parseInt(L4M4Ict02.getText());
		int marks43 = Integer.parseInt(L4M4Ict03.getText());
		int total4 = 0, avg4 = 0;
		if (marks41<=100&&marks42<=100&&marks43<=100){
		total4 = (marks41 + marks42 + marks43);
		avg4 = total4 / 3;
		lblM4.setText(Integer.toString(avg4));
		if ((marks41 < 40 && marks42 < 40) || (marks42 < 40 && marks43 < 40) || (marks41 < 40 && marks43 < 40)) {
			lblcon4.setText("");
		} else if (marks41 < 40 || marks42 < 40 || marks43 < 40) {
			lblcon4.setText("CONDONED");
		}
		if (avg4 >= 40 && (marks41 < 40 || marks42 < 40 || marks43 < 40)) {
			lblP4.setText("PASS");
			lblcon4.setText("CONDONED");
		} else if (avg4 >= 40) {
			lblP4.setText("PASS");
			lblcon4.setText("");
		} else if (avg4 >= 30) {
			lblP4.setText("RESITE");
			lblcon4.setText("CONDONED");
		} else if (avg4 < 30) {
			lblP4.setText("RETAKE");
			lblcon4.setText("");
		}
		}else{
			lblP4.setText("Invalid");
		}
		// Module-05
		int marks51 = Integer.parseInt(L4M5Ict01.getText());
		int marks52 = Integer.parseInt(L4M5Ict02.getText());
		int marks53 = Integer.parseInt(L4M5Ict03.getText());
		int total5 = 0, avg5 = 0;
		if (marks51<=100&&marks52<=100&&marks53<=100){
		total5 = (marks51 + marks52 + marks53);
		avg5 = total5 / 3;
		lblM5.setText(Integer.toString(avg5));
		if ((marks51 < 40 && marks52 < 40) || (marks52 < 40 && marks53 < 40) || (marks51 < 40 && marks53 < 40)) {
			lblcon5.setText("");
		} else if (marks51 < 40 || marks52 < 40 || marks53 < 40) {
			lblcon5.setText("CONDONED");
		}
		if (avg5 >= 40 && (marks51 < 40 || marks52 < 40 || marks53 < 40)) {
			lblP5.setText("PASS");
			lblcon5.setText("CONDONED");
		} else if (avg5 >= 40) {
			lblP5.setText("PASS");
			lblcon5.setText("");
		} else if (avg5 >= 30) {
			lblP5.setText("RESITE");
			lblcon5.setText("CONDONED");
		} else if (avg5 < 30) {
			lblP5.setText("RETAKE");
			lblcon5.setText("");
		}
		}else{
			lblP5.setText("Invalid");
		}
		// Module-06
		int marks61 = Integer.parseInt(L4M6Ict01.getText());
		int marks62 = Integer.parseInt(L4M6Ict02.getText());
		int marks63 = Integer.parseInt(L4M6Ict03.getText());
		int total6 = 0, avg6 = 0;
		if (marks61<=100&&marks62<=100&&marks63<=100){
		total6 = (marks61 + marks62 + marks63);
		avg6 = total6 / 3;
		lblM6.setText(Integer.toString(avg6));
		if ((marks61 < 40 && marks62 < 40) || (marks62 < 40 && marks63 < 40) || (marks61 < 40 && marks63 < 40)) {
			lblcon6.setText("");
		} else if (marks61 < 40 || marks62 < 40 || marks63 < 40) {
			lblcon6.setText("CONDONED");
		}
		if (avg6 >= 40 && (marks61 < 40 || marks62 < 40 || marks63 < 40)) {
			lblP6.setText("PASS");
			lblcon6.setText("CONDONED");
		} else if (avg6 >= 40) {
			lblP6.setText("PASS");
			lblcon6.setText("");
		} else if (avg6 >= 30) {
			lblP6.setText("RESITE");
			lblcon6.setText("CONDONED");
		} else if (avg6 < 30) {
			lblP6.setText("RETAKE");
			lblcon6.setText("");
		}
		}else{
			lblP6.setText("Invalid");
		}

		int[] marks = new int[6];
		marks[0] = avg1;
		marks[1] = avg2;
		marks[2] = avg3;
		marks[3] = avg4;
		marks[4] = avg5;
		marks[5] = avg6;
		int credit = 0;
		for (int i = 0; i < marks.length; i++) {
			if (marks[i] >= 30) {
				credit = credit + 20;
				lblce.setText(Integer.toString(credit));
			}

		}
        
		String[] con = new String[6];
		con[0] = lblcon1.getText();
		con[1] = lblcon2.getText();
		con[2] = lblcon3.getText();
		con[3] = lblcon4.getText();
		con[4] = lblcon5.getText();
		con[5] = lblcon6.getText();
		String CON = "CONDONED";
		for (int j = 0; j < con.length; j++) {
			if (con[j] == CON) {
				credit = credit - 20;
				if (credit>=0){
				lblce.setText(Integer.toString(credit));
				}
			}
		}

	}

	public void finish(ActionEvent event) {
		int credit = Integer.parseInt(lblce.getText());
		int con = Integer.parseInt(txtcon.getText());
		finalCredit4 = credit + con;
		lblcredit.setText(Integer.toString(finalCredit4));
		if (finalCredit4>120){
			lblmessage.setText("Invalid");
		}else if (finalCredit4 == 120) {
			lblmessage.setText("You are eligible for move to the Level-05");
			lblmessage1.setText("");
		} else if (finalCredit4 == 100) {
			lblmessage.setText("You are eligible for move to the Level-05");
			lblmessage1.setText("but you have to RETAKE your failure Module");
		} else if (finalCredit4 < 100) {
			lblmessage.setText("You are not eligible for move to the Level-05");
			lblmessage1.setText("");
		}

	}

	// cerhe
	@FXML
	private Label lblcerTopic, lblcerhe1, lblcerhe2, lblcerhe3, lblcerhe4, lblcerhe5, lblcerhe6,lblnamecerhe,lblidcerhe;

	public void cerhe(ActionEvent event) throws Exception {
		if (lblmessage.getText().equals("You are eligible for move to the Level-05")
				&& lblmessage1.getText().equals("")) {
			Stage primaryStage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("/application/cerhe.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		}
	}

	public void Proceed1(ActionEvent event) throws Exception {
		lblcerTopic.setText("Certificate of Higher Education");
		lblcerhe1.setText("120");
		lblcerhe2.setText("--");
		lblcerhe3.setText("--");
		lblcerhe4.setText("No Degree");
		lblcerhe5.setText("--");
		lblcerhe6.setText("YOU HAVE THE CERTIFICATE OF HIGHER EDUCATION");
		lblnamecerhe.setText(name);
		lblidcerhe.setText(Integer.toString(id));
	}

	public void next1(ActionEvent event) throws Exception {
		if (lblmessage.getText().equals("You are eligible for move to the Level-05")) {
			Stage primaryStage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("/application/Level05.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		}
	}

	// Level 05 Modules Window
	@FXML
	private TextField L5M1Ict01, L5M1Ict02, L5M1Ict03, L5M2Ict01, L5M2Ict02, L5M2Ict03, L5M3Ict01, L5M3Ict02, L5M3Ict03,
			L5M4Ict01, L5M4Ict02, L5M4Ict03, L5M5Ict01, L5M5Ict02, L5M5Ict03, L5M6Ict01, L5M6Ict02, L5M6Ict03, Ict01Re,
			Ict02Re, Ict03Re;

	@FXML
	private Label L5lblM1, L5lblM2, L5lblM3, L5lblM4, L5lblM5, L5lblM6, lblRe, L5lblP1, L5lblP2, L5lblP3, L5lblP4,
			L5lblP5, L5lblP6, lblPRe, L5lblcredit, L5lblmessage, L5lblmessage1, L5lblce, L5lblmin, L5lbltotal;

	public void getinputs1(ActionEvent event) {
		// Module-01
		int marks1 = Integer.parseInt(L5M1Ict01.getText());
		int marks2 = Integer.parseInt(L5M1Ict02.getText());
		int marks3 = Integer.parseInt(L5M1Ict03.getText());
		int total1 = 0, avg1 = 0;
		if (marks1<=100&&marks2<=100&&marks3<=100){
		total1 = (marks1 + marks2 + marks3);
		avg1 = total1 / 3;
		L5lblM1.setText(Integer.toString(avg1));
		if (avg1 >= 40 && (marks1 < 40 || marks2 < 40 || marks3 < 40)) {
			L5lblP1.setText("RESIT");
		}else if (avg1 >= 40) {
			L5lblP1.setText("PASS");
		} else if (avg1 >= 30) {
			L5lblP1.setText("RESITE");
		} else if (avg1 < 30) {
			L5lblP1.setText("RETAKE");
		}
		}else{
			L5lblP1.setText("Invalid");
		}
		// Module-02
		int marks21 = Integer.parseInt(L5M2Ict01.getText());
		int marks22 = Integer.parseInt(L5M2Ict02.getText());
		int marks23 = Integer.parseInt(L5M2Ict03.getText());
		int total2 = 0, avg2 = 0;
		if (marks21<=100&&marks22<=100&&marks23<=100){
		total2 = (marks21 + marks22 + marks23);
		avg2 = total2 / 3;
		L5lblM2.setText(Integer.toString(avg2));
		if (avg2 >= 40 && (marks21 < 40 || marks22 < 40 || marks23 < 40)) {
			L5lblP2.setText("RESITE");
		}else if (avg2 >= 40) {
			L5lblP2.setText("PASS");
		} else if (avg2 >= 30) {
			L5lblP2.setText("RESITE");
		} else if (avg2 < 30) {
			L5lblP2.setText("RETAKE");
		}
		}else{
			L5lblP2.setText("Invalid");
		}
		// Module-03
		int marks31 = Integer.parseInt(L5M3Ict01.getText());
		int marks32 = Integer.parseInt(L5M3Ict02.getText());
		int marks33 = Integer.parseInt(L5M3Ict03.getText());
		int total3 = 0, avg3 = 0;
		if (marks31<=100&&marks32<=100&&marks33<=100){
		total3 = (marks31 + marks32 + marks33);
		avg3 = total3 / 3;
		L5lblM3.setText(Integer.toString(avg3));
		if (avg3 >= 40 && (marks31 < 40 || marks32 < 40 || marks33 < 40)) {
			L5lblP3.setText("RESITE");
		}else if (avg3 >= 40) {
			L5lblP3.setText("PASS");
		} else if (avg3 >= 30) {
			L5lblP3.setText("RESITE");
		} else if (avg3 < 30) {
			L5lblP3.setText("RETAKE");
		}
		}else{
			L5lblP3.setText("Invalid");
		}
		// Module-04
		int marks41 = Integer.parseInt(L5M4Ict01.getText());
		int marks42 = Integer.parseInt(L5M4Ict02.getText());
		int marks43 = Integer.parseInt(L5M4Ict03.getText());
		int total4 = 0, avg4 = 0;
		if (marks41<=100&&marks42<=100&&marks43<=100){
		total4 = (marks41 + marks42 + marks43);
		avg4 = total4 / 3;
		L5lblM4.setText(Integer.toString(avg4));
		if (avg4 >= 40 && (marks41 < 40 || marks42 < 40 || marks43 < 40)) {
			L5lblP4.setText("RESITE");
		}else if (avg4 >= 40) {
			L5lblP4.setText("PASS");
		} else if (avg4 >= 30) {
			L5lblP4.setText("RESITE");
		} else if (avg4 < 30) {
			L5lblP4.setText("RETAKE");
		}
		}else{
			L5lblP4.setText("Invalid");
		}
		// Module-05
		int marks51 = Integer.parseInt(L5M5Ict01.getText());
		int marks52 = Integer.parseInt(L5M5Ict02.getText());
		int marks53 = Integer.parseInt(L5M5Ict03.getText());
		int total5 = 0, avg5 = 0;
		if (marks51<=100&&marks52<=100&&marks53<=100){
		total5 = (marks51 + marks52 + marks53);
		avg5 = total5 / 3;
		L5lblM5.setText(Integer.toString(avg5));
		if (avg5 >= 40 && (marks51 < 40 || marks52 < 40 || marks53 < 40)) {
			L5lblP5.setText("RESITE");
		}else if (avg5 >= 40) {
			L5lblP5.setText("PASS");
		} else if (avg5 >= 30) {
			L5lblP5.setText("RESITE");
		} else if (avg5 < 30) {
			L5lblP5.setText("RETAKE");
		}
		}else{
			L5lblP5.setText("Invalid");
		}
		// Module-06
		int marks61 = Integer.parseInt(L5M6Ict01.getText());
		int marks62 = Integer.parseInt(L5M6Ict02.getText());
		int marks63 = Integer.parseInt(L5M6Ict03.getText());
		int total6 = 0, avg6 = 0;
		if (marks61<=100&&marks62<=100&&marks63<=100){
		total6 = (marks61 + marks62 + marks63);
		avg6 = total6 / 3;
		L5lblM6.setText(Integer.toString(avg6));
		if (avg6 >= 40 && (marks61 < 40 || marks62 < 40 || marks63 < 40)) {
			L5lblP6.setText("RESITE");
		}else if (avg6 >= 40) {
			L5lblP6.setText("PASS");
		} else if (avg6 >= 30) {
			L5lblP6.setText("RESITE");
		} else if (avg6 < 30) {
			L5lblP6.setText("RETAKE");
		}
		}else{
			L5lblP6.setText("Invalid");
		}

		int[] marks = new int[6];
		marks[0] = avg1;
		marks[1] = avg2;
		marks[2] = avg3;
		marks[3] = avg4;
		marks[4] = avg5;
		marks[5] = avg6;
		int credit = 0;
		 totalL5 = 0;
		for (int i = 0; i < marks.length; i++) {
			if (marks[i] >= 40) {
				credit = credit + 20;
				L5lblce.setText(Integer.toString(credit));
			}
			if (marks[i] >= 40) {
				if (marks[i] <= min5) {
					min5 = marks[i];
					L5lblmin.setText(Integer.toString(min5));
				}
				totalL5 = totalL5 + marks[i];
				L5lbltotal.setText(Integer.toString(totalL5));
			}
		}

	}

	public void finish1(ActionEvent event) {
		int credit = Integer.parseInt(L5lblce.getText());
		int marks01 = Integer.parseInt(Ict01Re.getText());
		int marks02 = Integer.parseInt(Ict02Re.getText());
		int marks03 = Integer.parseInt(Ict03Re.getText());
		int total0 = 0;// avg0 = 0;
		if (marks01<=100&&marks02<=100&&marks03<=100){
		total0 = (marks01 + marks02 + marks03);
		avg0 = total0 / 3;
		lblRe.setText(Integer.toString(avg0));
		if (avg0 >= 40) {
			lblPRe.setText("PASS");
			lblRe.setText(Integer.toString(40));
		} else if (avg0 >= 30) {
			lblPRe.setText("RESITE");
		} else if (avg0 < 30) {
			lblPRe.setText("RETAKE");
		}
		if (avg0 >= 40) {
			finalCredit5 = credit + 20;
		} else {
			finalCredit5 = credit;
		}
		L5lblcredit.setText(Integer.toString(finalCredit5));
		if (finalCredit5 == 120 && avg0 < 40) {
			L5lblmessage.setText("You are eligible for move to the Level-06");
			L5lblmessage1.setText("");
		} else if (finalCredit5 == 120) {
			L5lblmessage.setText("You are eligible for move to the Level-06");
			L5lblmessage1.setText("but you have to RETAKE your failure Module");
		} else if (finalCredit5 == 100 && avg0 < 40) {
			L5lblmessage.setText("You are eligible for move to the Level-06");
			L5lblmessage1.setText("but you have to RETAKE your failure Module");
		} else if (finalCredit5 < 100) {
			L5lblmessage.setText("You are not eligible for move to the Level-06");
			L5lblmessage1.setText("");
		} else if (finalCredit5 == 140) {
			L5lblmessage.setText("You are eligible for move to the Level-06");
			L5lblmessage1.setText("and you passed the RETAKE module of Level-04");

		}
		}else{
			lblPRe.setText("Invalid");
		}
	}

	// diphe
	@FXML
	private Label lbldipTopic, lbldiphe1, lbldiphe2, lbldiphe3, lbldiphe4, lbldiphe5, lbldiphe6,lblnamediphe,lbliddiphe;
	public void diphe(ActionEvent event) throws Exception {
		if (L5lblmessage.getText().equals("You are eligible for move to the Level-06")
				&& L5lblmessage1.getText().equals("")
				|| L5lblmessage1.getText().equals("and you passed the RETAKE module of Level-04")) {
			Stage primaryStage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("/application/diphe.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		}
	}

	public void Proceed2(ActionEvent event) throws Exception {
		lbldipTopic.setText("Diploma of Higher Education");
		lbldiphe1.setText("120");
		lbldiphe2.setText("120");
		lbldiphe3.setText("--");
		lbldiphe4.setText("No Degree");
		lbldiphe5.setText("--");
		lbldiphe6.setText("YOU HAVE THE DIPLOMA OF HIGHER EDUCATION");
		lblnamediphe.setText(name);
		lbliddiphe.setText(Integer.toString(id));
	}

	public void next2(ActionEvent event) throws Exception {
		if (L5lblmessage.getText().equals("You are eligible for move to the Level-06")) {
			Stage primaryStage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("/application/Level06.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		}
	}

	// Level 06 Modules Window
	@FXML
	private TextField L6M1Ict01, L6M1Ict02, L6M1Ict03, L6M2Ict01, L6M2Ict02, L6M2Ict03, L6M3Ict01, L6M3Ict02, L6M3Ict03,
			L6M4Ict01, L6M4Ict02, L6M4Ict03, L6M5Ict01, L6M5Ict02, L6M5Ict03, L6M6Ict01, L6M6Ict02, L6M6Ict03,
			L6Ict01Re, L6Ict02Re, L6Ict03Re;

	@FXML
	private Label L6lblM1, L6lblM2, L6lblM3, L6lblM4, L6lblM5, L6lblM6, L6lblRe, L6lblP1, L6lblP2, L6lblP3, L6lblP4,
			L6lblP5, L6lblP6, L6lblPRe, L6lblcredit, L6lblmessage, L6lblmessage1, L6lblce, L6lblmin, L6lbltotal;

	public void getinputs2(ActionEvent event) {
		// Module-01
		int marks1 = Integer.parseInt(L6M1Ict01.getText());
		int marks2 = Integer.parseInt(L6M1Ict02.getText());
		int marks3 = Integer.parseInt(L6M1Ict03.getText());
		int total1 = 0, avg1 = 0;
		if (marks1<=100&&marks2<=100&&marks3<=100){
		total1 = (marks1 + marks2 + marks3);
		avg1 = total1 / 3;
		L6lblM1.setText(Integer.toString(avg1));
		if (avg1 >= 40 && (marks1 < 40 || marks2 < 40 || marks3 < 40)) {
			L6lblP1.setText("RESITE");
		}else if (avg1 >= 40) {
			L6lblP1.setText("PASS");
		} else if (avg1 >= 30) {
			L6lblP1.setText("RESITE");
		} else if (avg1 < 30) {
			L6lblP1.setText("RETAKE");
		}
		}else{
			L6lblP1.setText("Invalid");
		}
		// Module-02
		int marks21 = Integer.parseInt(L6M2Ict01.getText());
		int marks22 = Integer.parseInt(L6M2Ict02.getText());
		int marks23 = Integer.parseInt(L6M2Ict03.getText());
		int total2 = 0, avg2 = 0;
		if (marks21<=100&&marks22<=100&&marks23<=100){
		total2 = (marks21 + marks22 + marks23);
		avg2 = total2 / 3;
		L6lblM2.setText(Integer.toString(avg2));
		if (avg2 >= 40 && (marks21 < 40 || marks22 < 40 || marks23 < 40)) {
			L6lblP2.setText("RESITE");
		}else if (avg2 >= 40) {
			L6lblP2.setText("PASS");
		} else if (avg2 >= 30) {
			L6lblP2.setText("RESITE");
		} else if (avg2 < 30) {
			L6lblP2.setText("RETAKE");
		}
		}else{
			L6lblP2.setText("Invalid");
		}
		// Module-03
		int marks31 = Integer.parseInt(L6M3Ict01.getText());
		int marks32 = Integer.parseInt(L6M3Ict02.getText());
		int marks33 = Integer.parseInt(L6M3Ict03.getText());
		int total3 = 0, avg3 = 0;
		if (marks31<=100&&marks32<=100&&marks33<=100){
		total3 = (marks31 + marks32 + marks33);
		avg3 = total3 / 3;
		L6lblM3.setText(Integer.toString(avg3));
		if (avg3 >= 40 && (marks31 < 40 || marks32 < 40 || marks33 < 40)) {
			L6lblP3.setText("RESITE");
		}else if (avg3 >= 40) {
			L6lblP3.setText("PASS");
		} else if (avg3 >= 30) {
			L6lblP3.setText("RESITE");
		} else if (avg3 < 30) {
			L6lblP3.setText("RETAKE");
		}
		}else{
			L6lblP3.setText("Invalid");
		}
		// Module-04
		int marks41 = Integer.parseInt(L6M4Ict01.getText());
		int marks42 = Integer.parseInt(L6M4Ict02.getText());
		int marks43 = Integer.parseInt(L6M4Ict03.getText());
		int total4 = 0, avg4 = 0;
		if (marks41<=100&&marks42<=100&&marks43<=100){
		total4 = (marks41 + marks42 + marks43);
		avg4 = total4 / 3;
		L6lblM4.setText(Integer.toString(avg4));
		if (avg4 >= 40 && (marks41 < 40 || marks42 < 40 || marks43 < 40)) {
			L6lblP4.setText("RESITE");
		}else if (avg4 >= 40) {
			L6lblP4.setText("PASS");
		} else if (avg4 >= 30) {
			L6lblP4.setText("RESITE");
		} else if (avg4 < 30) {
			L6lblP4.setText("RETAKE");
		}
		}else{
			L6lblP4.setText("Invalid");
		}
		// Module-05
		int marks51 = Integer.parseInt(L6M5Ict01.getText());
		int marks52 = Integer.parseInt(L6M5Ict02.getText());
		int marks53 = Integer.parseInt(L6M5Ict03.getText());
		int total5 = 0, avg5 = 0;
		if (marks51<=100&&marks52<=100&&marks53<=100){
		total5 = (marks51 + marks52 + marks53);
		avg5 = total5 / 3;
		L6lblM5.setText(Integer.toString(avg5));
		if (avg5 >= 40 && (marks51 < 40 || marks52 < 40 || marks53 < 40)) {
			L6lblP5.setText("RESITE");
		}else if (avg5 >= 40) {
			L6lblP5.setText("PASS");
		} else if (avg5 >= 30) {
			L6lblP5.setText("RESITE");
		} else if (avg5 < 30) {
			L6lblP5.setText("RETAKE");
		}
		}else{
			L6lblP5.setText("Invalid");
		}

		int[] marks = new int[4];
		marks[0] = avg1;
		marks[1] = avg2;
		marks[2] = avg3;
		marks[3] = avg4;

		int credit = 0;
		totalL6 = 0;
		for (int i = 0; i < marks.length; i++) {
			if (marks[i] >= 40) {
				credit = credit + 20;
				L6lblce.setText(Integer.toString(credit));

			}
			if (marks[i] >= 40) {
				if (marks[i] <= min6) {
					min6 = marks[i];
					L6lblmin.setText(Integer.toString(min6));
				}

				totalL6 = totalL6 + marks[i];
				L6lbltotal.setText(Integer.toString(totalL6));
			}
		}
		if (avg5 >= 40) {
			credit = credit + 40;
			L6lblce.setText(Integer.toString(credit));
		}
		if (avg5 <= min6 && avg5 >= 40) {
			min6 = avg5;
			L6lblmin.setText(Integer.toString(min6));
		}
		if (avg5 >= 30) {
			totalL6 = totalL6 + avg5;
			L6lbltotal.setText(Integer.toString(totalL6));
		}

	}

	public void finish2(ActionEvent event) {
		int credit = Integer.parseInt(L6lblce.getText());
		int marks001 = Integer.parseInt(L6Ict01Re.getText());
		int marks002 = Integer.parseInt(L6Ict02Re.getText());
		int marks003 = Integer.parseInt(L6Ict03Re.getText());
		int total00 = 0;// avg00 = 0;
		if (marks001<=100&&marks002<=100&&marks003<=100){
		total00 = (marks001 + marks002 + marks003);
		avg00 = total00 / 3;
		L6lblRe.setText(Integer.toString(avg00));
		if (avg00 >= 40) {
			L6lblPRe.setText("PASS");
			L6lblRe.setText(Integer.toString(40));
		} else if (avg00 >= 30) {
			L6lblPRe.setText("RESITE");
		} else if (avg00 < 30) {
			L6lblPRe.setText("RETAKE");
		}
		if (avg00 >= 40) {
			finalCredit6 = credit + 20;
		} else {
			finalCredit6 = credit;
		}
		L6lblcredit.setText(Integer.toString(finalCredit6));
		if (finalCredit6 == 120 && avg00 < 40) {
			L6lblmessage.setText("You are eligible for the HONORS DEGREE");
			L6lblmessage1.setText("");
		} else if (finalCredit6 == 120) {
			L6lblmessage.setText("You are eligible for the HONORS DEGREE");
			L6lblmessage1.setText("nd you passed the RETAKE module of Level-05");
		} else if (finalCredit6 >= 60 && avg00 < 40) {
			L6lblmessage.setText("You are eligible for the NON-HONORS DEGREE");
			L6lblmessage1.setText("you can RETAKE your failure modules");
		} else if (finalCredit6 < 60) {
			L6lblmessage.setText("You have not passed the Level-06");
			L6lblmessage1.setText("");
		} else if (finalCredit6 == 140) {
			L6lblmessage.setText("You are eligible for the HONORS DEGREE");
			L6lblmessage1.setText("and you passed the RETAKE module of Level-05 ");

		}
		}else{
			L6lblPRe.setText("Invalid");
		}
	}

	public void next3(ActionEvent event) throws Exception {
		if (L6lblmessage.getText().equals("You are eligible for the HONORS DEGREE")
				|| L6lblmessage.getText().equals("You are eligible for the NON-HONORS DEGREE")) {
			Stage primaryStage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("/application/Award.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		}
	}

	// Award calculation
	@FXML
	private Label lblawName,lblawId,lblawcredit, lblawavg,lblawL4c,lblawL5c,lblawL6c,lblawL5t,lblawL6t,lblawL5m,lblawL6m,
	lblawL5r,lblawL6r,lblawmin, lblaw1, lblaw2, lblaw3;

	public void proceed(ActionEvent event) throws Exception {
		if (avg0 >= 40) {
		    avgRe1=40;
		}else{
			avgRe1=0;
		}
		if (avg00 >= 40) {
		    avgRe2=40;
		}else{
			avgRe2=0;
		}
		lblawName.setText(name);
		lblawId.setText(Integer.toString(id));
		lblawL4c.setText(Integer.toString(finalCredit4));
		lblawL5c.setText(Integer.toString(finalCredit5));
		lblawL6c.setText(Integer.toString(finalCredit6));
		lblawL5t.setText(Integer.toString(totalL5));
		lblawL6t.setText(Integer.toString(totalL6));
		lblawL5m.setText(Integer.toString(min5));
		lblawL6m.setText(Integer.toString(min6));
		lblawL5r.setText(Integer.toString(avgRe1));
		lblawL6r.setText(Integer.toString(avgRe2));

		int credits = 0, min = 100, total = 0, avg = 0;
		credits = finalCredit4 + finalCredit5 + finalCredit6;
		lblawcredit.setText(Integer.toString(credits));
		int[] marks = new int[2];
		marks[0] = min5;
		marks[1] = min6;
		if (avgRe1 == 40) {
			min = 40;
			lblawmin.setText(Integer.toString(min));
		}
		if (avgRe2 == 40) {
			min = 40;
			lblawmin.setText(Integer.toString(min));
		}

		for (int i = 0; i < marks.length; i++) {
			if (marks[i] <= min) {
				min = marks[i];
				lblawmin.setText(Integer.toString(min));
			}
		}
		total = (totalL5 + totalL6 + avgRe1 + avgRe2) - min;
		avg = total / 10;
		lblawavg.setText(Integer.toString(avg));
		if (credits > 360) {
			lblaw1.setText("Invalid");
			lblaw2.setText("Invalid");
			lblaw3.setText("Invalid");
		}else if (credits == 360) {
			      lblaw1.setText("B.Sc. Honors");
			      if (avg >= 70) {
			         lblaw2.setText("1st Class Honors");
				     lblaw3.setText("B.Sc. 1st Class Honors DEGREE");
			      } else if (avg >= 60) {
				     lblaw2.setText("2nd Class Honors Upper Division");
				     lblaw3.setText("B.Sc. 2nd Class Honors Upper Division DEGREE");
			      } else if (avg >= 50) {
				     lblaw2.setText("2nd Class Honors Lower Division");
				     lblaw3.setText("B.Sc. 2nd Class Honors Lower Division DEGREE");
			      } else if (avg >= 40) {
				     lblaw2.setText("3rd Class Honors");
				     lblaw3.setText("B.Sc. 3rd Class Honors DEGREE");
			      } else {
				     lblaw2.setText("No Class");
				     lblaw3.setText("B.Sc. Honors DEGREE");
			      }
		} else if (credits >= 300) {
			lblaw1.setText("B.Sc.");
			lblaw3.setText("B.Sc. DEGREE");
			lblaw2.setText("--");
		}
	
	}

	public void numberval(KeyEvent event) {
		if (!(event.getCharacter().charAt(0) >= '0' && event.getCharacter().charAt(0) <= '9')) {
			event.consume();
		}
	}
}
