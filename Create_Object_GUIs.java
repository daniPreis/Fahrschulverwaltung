package gUI;

import javafx.geometry.Insets;

import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

public class Create_Object_GUIs {

	BorderPane bpS = new BorderPane();
	BorderPane bpI = new BorderPane();
	BorderPane bpV = new BorderPane();

	GridPane gpI = new GridPane();
	GridPane gpS = new GridPane();
	GridPane gpV = new GridPane();
	TextField nameT = new TextField();
	TextField surnameT = new TextField();
	TextField plZT = new TextField();
	TextField cityT = new TextField();
	TextField streetT = new TextField();
	TextField houseNrT = new TextField();
	TextField numStudentsT = new TextField();

	TextField nameTI = new TextField();
	TextField surnameTI = new TextField();
	TextField plZTI = new TextField();
	TextField cityTI = new TextField();
	TextField streetTI = new TextField();
	TextField houseNrTI = new TextField();
	TextField vehicleT1 = new TextField();

	Button createS = new Button("Hinzufügen");
	Button createI = new Button("Hinzufügen");
	Button createV = new Button("Hinzufügen");

	// Button create = new Button("Hinzufügen");
	
	TextField idT = new TextField();
	TextField modelT = new TextField();
	TextField admissionClassT = new TextField();
	TextField manufacturerT = new TextField();
	TextField constructionYearT = new TextField();

	TextField theoryPassedT = new TextField();
	TextField praxisPassedT = new TextField();
	TextField numTheLesT = new TextField();
	TextField numPraLesT = new TextField();
	TextField drivinginstructorT = new TextField();

	public BorderPane addStudentGUI() {

		Label name = new Label("Name: ");
		Label surname = new Label("Vorname: ");
		Label plZ = new Label("PLZ: ");
		Label city = new Label("Wohnort: ");
		Label adress = new Label("Adresse: ");
		Label street = new Label("Straße: ");
		Label houseNr = new Label("Hausnummer: ");
		Label numStudents = new Label("Anzahl Fahrschüler: ");
		Label dS = new Label("Fahrschüler hinzufügen: ");
		Label theoryPassed = new Label("Theorie absolviert: ");
		Label praxisPassed = new Label("Praxis absolviert: ");
		Label numTheLes = new Label("Anzahl Theoriestunden: ");
		Label numPraLes = new Label("Anzahl Praxisstunden: ");
		Label drivinginstructor = new Label("Fahrlehrer:  ");

		bpS.setPadding(new Insets(20));
		gpS.setVgap(20);
		gpS.setHgap(40);
		gpS.addRow(1, dS);
		gpS.addRow(2, name, nameT);
		gpS.addRow(3, surname, surnameT);
		gpS.addRow(4, adress);
		gpS.addRow(5, plZ, plZT);
		gpS.addRow(6, city, cityT);
		gpS.addRow(7, street, streetT);
		gpS.addRow(8, houseNr, houseNrT);
		gpS.addRow(9, theoryPassed, theoryPassedT);
		gpS.addRow(10, praxisPassed, praxisPassedT);
		gpS.addRow(11, numTheLes, numTheLesT);
		gpS.addRow(12, numPraLes, numPraLesT);
		gpS.addRow(13, drivinginstructor, drivinginstructorT);
		gpS.add(createS, 2, 14);
		dS.setFont(new Font("Arial", 15));
		bpS.setCenter(gpS);

		return bpS;

	}

	public BorderPane addVehicleGUI() {
		
		Label model = new Label("Modell: ");
		Label admissionClass = new Label("Zulassungsklasse: ");
		Label manufacturer = new Label("Hersteller: ");
		Label constructionYear = new Label("Baujahr ");
		Label vH = new Label("Fahrlehrer hinzufügen");
		vH.setFont(new Font("Arial", 15));

		bpV.setPadding(new Insets(20));
		gpV.setVgap(20);
		gpV.setHgap(40);
		gpV.addRow(1, vH);
		gpV.addRow(2, new Label("Id: "), idT);
		gpV.addRow(3, model, modelT);
		gpV.addRow(4, admissionClass, admissionClassT);
		gpV.addRow(5, manufacturer, manufacturerT);
		gpV.addRow(6, constructionYear, constructionYearT);
		gpV.add(createV, 2, 8);

		bpV.setCenter(gpV);

		return bpV;

	}

	public BorderPane addTeacherGUI() {
		Label dI = new Label("Fahrlehrer hinzufügen: ");
		Label nameI = new Label("Name: ");
		Label surnameI = new Label("Vorname: ");
		Label plZI = new Label("PLZ: ");
		Label cityI = new Label("Wohnort: ");
		Label adressI = new Label("Adresse: ");
		Label streetI = new Label("Straße: ");
		Label houseNrI = new Label("Hausnummer: ");
		Label vehicleI1 = new Label("Zugewiesene Fahrzeuge: ");

		bpI.setPadding(new Insets(20));
		gpI.setVgap(20);
		gpI.setHgap(40);
		gpI.addRow(1, dI);
		gpI.addRow(2, nameI, nameTI);
		gpI.addRow(3, surnameI, surnameTI);
		gpI.addRow(4, adressI);
		gpI.addRow(5, plZI, plZTI);
		gpI.addRow(6, cityI, cityTI);
		gpI.addRow(7, streetI, streetTI);
		gpI.addRow(8, houseNrI, houseNrTI);
		gpI.addRow(9, vehicleI1, vehicleT1);
		gpI.add(createI, 2, 9);
		dI.setFont(new Font("Arial", 15));
		bpI.setCenter(gpI);

		return bpI;

	}

}
