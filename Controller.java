package gUI;

import fachlogik.Administration;
import fachlogik.Adress;
import fachlogik.Drivinginstructor;
import fachlogik.Drivingstudent;
import fachlogik.Vehicle;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class Controller extends Application {

	Scene home;
	Scene ds_GUI;
	Scene di_GUI;
	Scene vh_GUI;
	Scene addT_GUI;
	Scene addV_GUI;
	Scene addS_GUI;

	MouseEvent event;

	Administration admin = new Administration();

	@Override
	public void start(Stage primaryStage) throws Exception {

		// Verknüpfung der GUIs
		Main_GUIs gui = new Main_GUIs();

		Create_Object_GUIs cO = new Create_Object_GUIs();

		addT_GUI = new Scene(cO.addTeacherGUI(), 900, 700);
		addV_GUI = new Scene(cO.addVehicleGUI(), 900, 700);
		addS_GUI = new Scene(cO.addStudentGUI(), 900, 700);

		Stage addStage = new Stage();

		di_GUI = new Scene(gui.createDIGUI(), 700, 500);
		ds_GUI = new Scene(gui.createDSGUI(), 700, 500);
		vh_GUI = new Scene(gui.createVhGUI(), 700, 500);

		home = new Scene(gui.createHomeGUI(), 700, 500);

		gui.drivingstudentListeH.setOnAction(e -> primaryStage.setScene(ds_GUI));
		gui.dtListH.setOnAction(e -> primaryStage.setScene(di_GUI));
		gui.vehiclesH.setOnAction(e -> primaryStage.setScene(vh_GUI));
		gui.adddrivingstudentH.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				addStage.setScene(addS_GUI);
				addStage.show();
			}

		});
		gui.adddrivingInstructorH.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				addStage.setScene(addT_GUI);
				addStage.show();
			}

		});
		gui.addVehicleH.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				addStage.setScene(addV_GUI);
				addStage.show();
			}

		});

		gui.drivinginstructorS.setOnAction(e -> primaryStage.setScene(di_GUI));
		gui.homeS.setOnAction(e -> primaryStage.setScene(home));
		gui.vehiclesS.setOnAction(e -> primaryStage.setScene(vh_GUI));
		gui.addS.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				addStage.setScene(addS_GUI);
				addStage.show();
			}

		});

		gui.drivingstudentI.setOnAction(e -> primaryStage.setScene(ds_GUI));
		gui.homeI.setOnAction(e -> primaryStage.setScene(home));
		gui.vehicleI.setOnAction(e -> primaryStage.setScene(vh_GUI));
		gui.addI.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				addStage.setScene(addT_GUI);
				addStage.show();
			}

		});

		gui.drivingInstructorV.setOnAction(e -> primaryStage.setScene(di_GUI));
		gui.homeV.setOnAction(e -> primaryStage.setScene(home));
		gui.drivingstudentV.setOnAction(e -> primaryStage.setScene(ds_GUI));
		gui.addV.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				addStage.setScene(addV_GUI);
				addStage.show();
			}

		});

		// Verknüpfung GUI und Fachlogik

		cO.createS.setOnAction(new EventHandler<ActionEvent>() {

			boolean tPa = false;
			boolean pPa = false;

			public void handle(ActionEvent e) {

				if (cO.theoryPassedT.getText().equals("Ja")) {
					tPa = true;
				} else if (cO.theoryPassedT.getText().equals("Nein")) {
					tPa = false;
				}

				if (cO.praxisPassedT.getText().equals("Ja")) {
					pPa = true;
				} else if (cO.praxisPassedT.getText().equals("Ja")) {
					tPa = false;
				}
				admin.studentList.add(new Drivingstudent(cO.nameT.getText(), cO.surnameT.getText(),
						new Adress(Integer.parseInt(cO.plZT.getText()), cO.cityT.getText(), cO.streetT.getText(),
								Integer.parseInt(cO.houseNrT.getText())),
						Integer.parseInt(cO.numTheLesT.getText()), tPa, cO.drivinginstructorT.getText(),
						Integer.parseInt(cO.numPraLesT.getText()), pPa));
			}
		});

		cO.createI.setOnAction(new EventHandler<ActionEvent>() {

			Vehicle vh;

			public void handle(ActionEvent e) {
				for (Vehicle h : admin.vehicles) {
					if (cO.vehicleT1.getText().equals(h.getId())) {
						vh = h;
					}
				}

				admin.drivinginstructorlist.add(new Drivinginstructor(
						cO.nameTI.getText(), cO.surnameTI.getText(), new Adress(Integer.parseInt(cO.plZTI.getText()),
								cO.cityTI.getText(), cO.streetTI.getText(), Integer.parseInt(cO.houseNrTI.getText())),
						vh));
			}
		});

		cO.createV.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent e) {
				admin.vehicles.add(new Vehicle(cO.idT.getText(), cO.modelT.getText(), cO.admissionClassT.getText(),
						cO.manufacturerT.getText(), Integer.parseInt(cO.constructionYearT.getText())));
			}
		});

		primaryStage.setScene(home);
		primaryStage.setTitle("Fahrschulverwaltung");
		primaryStage.show();
	}

	public static void main(String[] args) {

		launch();
	}

}
