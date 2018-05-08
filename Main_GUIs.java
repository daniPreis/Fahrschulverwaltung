package gUI;

import fachlogik.Drivinginstructor;
import fachlogik.Drivingstudent;
import fachlogik.Vehicle;

import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class Main_GUIs {

	BorderPane bpI = new BorderPane();
	Button addI = new Button("Hier kommt ein plus hin");
	private ObservableList<Drivinginstructor> dataI;
	TableView<Drivinginstructor> tableI;
	MenuBar mbI;
	Menu home1I;
	Menu drivingstudent1I;
	Menu vehicle1I;
	MenuItem homeI;
	MenuItem drivingstudentI;
	MenuItem vehicleI;

	BorderPane bpH = new BorderPane();
	MenuBar mbH = new MenuBar();
	Menu drivingstudentListmH = new Menu("Fahrschühler");
	Menu dtListmH = new Menu("Fahrlehrer");
	Menu vehiclesmH = new Menu("Fahrzeuge");
	MenuItem drivingstudentListeH = new Menu("Fahrschühler");
	MenuItem vehiclesH = new Menu("Fahrzeuge");
	Menu dtListH = new Menu("Fahrlehrer");

	Button addVehicleH;
	Button adddrivingstudentH;
	Button adddrivingInstructorH;

	private ObservableList<Drivingstudent> dataS;
	private Text actionStatus;
	TableView<Drivingstudent> tableS;
	BorderPane bpS = new BorderPane();

	// MenüLeiste
	MenuBar mbS;
	Menu home1S;
	Menu drivinginstructor1S;
	Menu vehicles1S;

	MenuItem homeS;
	MenuItem drivinginstructorS;
	MenuItem vehiclesS;

	Button addS;

	private ObservableList<Vehicle> dataV;
	TableView<Vehicle> tableV;

	BorderPane bpV = new BorderPane();

	// MenüLeiste
	MenuBar mbV;
	Menu home1V;
	Menu drivingstudent1V;
	Menu drivingInstructor1V;

	MenuItem homeV;
	MenuItem drivingstudentV;
	MenuItem drivingInstructorV;

	Button addV = new Button("Fahrzeug hinzufügen");

	
	public BorderPane createVhGUI() {

		mbV = new MenuBar();
		home1V = new Menu("Home");
		drivingstudent1V = new Menu("Fahrschüler");
		drivingInstructor1V = new Menu("Fahrlehrer");

		homeV = new MenuItem("Home");
		drivingstudentV = new MenuItem("Fahrschüler");
		drivingInstructorV = new MenuItem("Fahrlehrer");

		mbV.getMenus().add(home1V);
		mbV.getMenus().add(drivingstudent1V);
		mbV.getMenus().add(drivingInstructor1V);

		home1V.getItems().add(homeV);
		drivingstudent1V.getItems().add(drivingstudentV);
		drivingInstructor1V.getItems().add(drivingInstructorV);
		bpV.setTop(mbV);

		tableV = new TableView<Vehicle>();
		// dataV = getInitialTableData();
		// tableV.setItems(dataV);
		tableV.setPrefWidth(450);
		tableV.setPrefHeight(300);

		TableColumn<Vehicle, String> modelCol = new TableColumn<Vehicle, String>("Modell");
		modelCol.setCellValueFactory(new PropertyValueFactory<Vehicle, String>("model"));
		modelCol.setMinWidth(150);

		TableColumn<Vehicle, String> admissionClassCol = new TableColumn<Vehicle, String>("Zulassungsklasse");
		admissionClassCol.setCellValueFactory(new PropertyValueFactory<Vehicle, String>("admissionClass"));
		admissionClassCol.setMinWidth(150);

		TableColumn<Vehicle, String> manufacturerCol = new TableColumn<Vehicle, String>("Hersteller");
		manufacturerCol.setCellValueFactory(new PropertyValueFactory<Vehicle, String>("manufacturer"));
		manufacturerCol.setMinWidth(150);

		TableColumn<Vehicle, Integer> constructionYearCol = new TableColumn<Vehicle, Integer>("Baujahr");
		constructionYearCol.setCellValueFactory(new PropertyValueFactory<Vehicle, Integer>("constructionYear"));
		constructionYearCol.setMinWidth(150);

		tableV.getColumns().addAll(modelCol, admissionClassCol, manufacturerCol, constructionYearCol);
		//tableV.getSelectionModel().selectedIndexProperty().addListener(new RowSelectChangeListenerforVehicle());

		bpV.setCenter(tableV);
		bpV.setRight(addV);

		return bpV;
	}

	public BorderPane createDSGUI() {
		bpS = new BorderPane();

		// MenüLeiste
		mbS = new MenuBar();
		home1S = new Menu("Home");
		drivinginstructor1S = new Menu("Fahrlehrer");
		vehicles1S = new Menu("Fahrzeug");

		homeS = new MenuItem("Home");
		drivinginstructorS = new MenuItem("Fahrlehrer");
		vehiclesS = new MenuItem("Fahrzeug");

		mbS.getMenus().add(home1S);
		mbS.getMenus().add(drivinginstructor1S);
		mbS.getMenus().add(vehicles1S);

		home1S.getItems().add(homeS);
		drivinginstructor1S.getItems().add(drivinginstructorS);
		vehicles1S.getItems().add(vehiclesS);
		bpS.setTop(mbS);

		// TableView
		tableS = new TableView<Drivingstudent>();
		// dataS = getInitialTableData();
		tableS.setItems(dataS);
		tableS.setPrefWidth(450);
		tableS.setPrefHeight(300);

		TableColumn<Drivingstudent, String> NameCol = new TableColumn<Drivingstudent, String>("Name");
		NameCol.setCellValueFactory(new PropertyValueFactory<Drivingstudent, String>("name"));
		NameCol.setMinWidth(150);

		TableColumn<Drivingstudent, String> firstNameCol = new TableColumn<Drivingstudent, String>("Vorname");
		firstNameCol.setCellValueFactory(new PropertyValueFactory<Drivingstudent, String>("Firstname"));
		firstNameCol.setMinWidth(150);

		TableColumn<Drivingstudent, String> adressCol = new TableColumn<Drivingstudent, String>("Adresse");
		adressCol.setCellValueFactory(new PropertyValueFactory<Drivingstudent, String>("adresseAlsString"));
		adressCol.setMinWidth(150);

		TableColumn<Drivingstudent, Integer> numThLeCol = new TableColumn<Drivingstudent, Integer>("anzTheorieStunden");
		numThLeCol.setCellValueFactory(new PropertyValueFactory<Drivingstudent, Integer>("numTheLes"));
		numThLeCol.setMinWidth(150);

		TableColumn<Drivingstudent, Boolean> ThPassedCol = new TableColumn<Drivingstudent, Boolean>("theorieBestanden");
		ThPassedCol.setCellValueFactory(new PropertyValueFactory<Drivingstudent, Boolean>("theoryPassed"));
		ThPassedCol.setMinWidth(150);

		TableColumn<Drivingstudent, Integer> numPrLeCol = new TableColumn<Drivingstudent, Integer>("anzPraxisStunden");
		numPrLeCol.setCellValueFactory(new PropertyValueFactory<Drivingstudent, Integer>("numPraLes"));
		numPrLeCol.setMinWidth(150);

		TableColumn<Drivingstudent, Boolean> praPassedCol = new TableColumn<Drivingstudent, Boolean>("praxisBestanden");
		praPassedCol.setCellValueFactory(new PropertyValueFactory<Drivingstudent, Boolean>("praxisPassed"));
		praPassedCol.setMinWidth(150);

		TableColumn<Drivingstudent, Drivinginstructor> drivinginstructor = new TableColumn<Drivingstudent, Drivinginstructor>(
				"drivinginstructor");
		drivinginstructor
				.setCellValueFactory(new PropertyValueFactory<Drivingstudent, Drivinginstructor>("drivinginstructor"));
		drivinginstructor.setMinWidth(150);

		TableColumn<Drivingstudent, Integer> openAmountsCol = new TableColumn<Drivingstudent, Integer>(
				"Offene Beträge");
		openAmountsCol.setCellValueFactory(new PropertyValueFactory<Drivingstudent, Integer>("openAmounts"));
		openAmountsCol.setMinWidth(150);

		tableS.getColumns().setAll(NameCol, firstNameCol, adressCol, numThLeCol, ThPassedCol, numPrLeCol, praPassedCol,
				drivinginstructor, openAmountsCol);

		// tableS.getSelectionModel().selectedIndexProperty().addListener(new
		// RowSelectChangeListener());

		bpS.setCenter(tableS);

		// Sonstiges
		addS = new Button("Hier kommt ein Plus hin");
		bpS.setRight(addS);

		return bpS;
	}

	public BorderPane createHomeGUI() {

		// Menüleiste
		mbH.getMenus().add(drivingstudentListmH);
		mbH.getMenus().add(dtListmH);
		mbH.getMenus().add(vehiclesmH);
		drivingstudentListmH.getItems().add(drivingstudentListeH);
		dtListmH.getItems().add(dtListH);
		vehiclesmH.getItems().add(vehiclesH);
		bpH.setTop(mbH);
		// Buttons
		addVehicleH = new Button("Fahrzeug");
		// File f = new File();

		// Image imageDecline = new Image(getClass().getResourceAsStream(""));
		//Image image = new Image("");
		// simple displays ImageView the image as is
		//ImageView iv1 = new ImageView();
		//iv1.setImage(image);

		//addVehicle.setGraphic(iv1);
		addVehicleH.setPrefSize(75, 75);
		adddrivingstudentH = new Button("Fahrschüler");
		adddrivingstudentH.setPrefSize(75, 75);
		adddrivingInstructorH = new Button("Fahrlehrer");
		adddrivingInstructorH.setPrefSize(75, 75);

		VBox vb = new VBox();
		vb.setSpacing(50);
		vb.setPadding(new Insets(10));
		vb.getChildren().addAll(addVehicleH, adddrivingstudentH, adddrivingInstructorH);

		BorderPane bp2 = new BorderPane();
		bp2.setCenter(vb);
		bpH.setRight(bp2);

		return bpH;
	}

	public BorderPane createDIGUI() {

		mbI = new MenuBar();
		home1I = new Menu("Home");
		drivingstudent1I = new Menu("Fahrschüler");
		vehicle1I = new Menu("Fahrzeug");
		homeI = new MenuItem("Home");
		drivingstudentI = new MenuItem("Fahrschüler");
		vehicleI = new MenuItem("Fahrzeug");
		mbI.getMenus().add(home1I);
		mbI.getMenus().add(drivingstudent1I);
		mbI.getMenus().add(vehicle1I);
		home1I.getItems().add(homeI);
		drivingstudent1I.getItems().add(drivingstudentI);
		vehicle1I.getItems().add(vehicleI);
		bpI.setTop(mbI);
		tableI = new TableView<Drivinginstructor>();
		// dataI = getInitialTableData();
		tableI.setItems(dataI);
		tableI.setPrefWidth(450);
		tableI.setPrefHeight(300);
		TableColumn<Drivinginstructor, String> nameColI = new TableColumn<Drivinginstructor, String>("Name");
		nameColI.setCellValueFactory(new PropertyValueFactory<Drivinginstructor, String>("name"));
		nameColI.setMinWidth(150);
		TableColumn<Drivinginstructor, String> firstnameColI = new TableColumn<Drivinginstructor, String>("Vorname");
		firstnameColI.setCellValueFactory(new PropertyValueFactory<Drivinginstructor, String>("vorname"));
		firstnameColI.setMinWidth(150);
		TableColumn<Drivinginstructor, String> adressColI = new TableColumn<Drivinginstructor, String>("Adresse");
		adressColI.setCellValueFactory(new PropertyValueFactory<Drivinginstructor, String>("adresseAlsString"));
		adressColI.setMinWidth(150);
		TableColumn<Drivinginstructor, String> vehicleColI = new TableColumn<Drivinginstructor, String>(
				"Zugelassene vehicle");
		vehicleColI.setCellValueFactory(new PropertyValueFactory<Drivinginstructor, String>("zugelassenevehicle"));
		vehicleColI.setMinWidth(150);
		tableI.getColumns().addAll(nameColI, firstnameColI, adressColI, vehicleColI);
		// tableI.getSelectionModel().selectedIndexProperty().addListener(new
		// RowSelectChangeListener());
		bpI.setCenter(tableI);
		bpI.setRight(addI);
		return bpI;
	}

}
