package controller;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import model.Patient;
import connect.dbConnection;

public class ajouterPatient implements Initializable{
	
	
	
	public static int save(Patient adr) {
		int patie = 0;
		try {
			Connection con = connect.dbConnection.connect();
			String sql = "INSERT INTO ptient (nom,prenom,email,telephone,DateDeNaissance,,adresse,motDePasse,login) VALUES(?,?,?,?,?)";
			PreparedStatement stat;
			stat = (PreparedStatement) con.prepareStatement(sql);
			//stat.setInt(1, adr.getId_Patient());
			
			patie = stat.executeUpdate();
			con.close();
			
		} 
		
		catch (Exception e) {
			e.printStackTrace();

		}
		return patie;
		
	}

	/*@FXML
	public void insertAdherent(ActionEvent event) {
		Integer CodeAd = idPatient.getAnchor();
		

		Patient pat = new Patient();
		pat.setIdPatient(IdPatient);
		
		int status = save(pat);
		if (status > 0) {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Add adherents");
			alert.setHeaderText("Informations");
			alert.setContentText("patient bien ajoutée");
			alert.showAndWait();

		} else

		{
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Add Patients");
			alert.setHeaderText("Informations");
			alert.setContentText("patient Non ajoutée");
			alert.showAndWait();

		}
	}*/

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
