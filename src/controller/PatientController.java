package controller;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ResourceBundle;
import application.Main;
import javafx.animation.RotateTransition;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import model.Patient;

public class PatientController implements Initializable{
	@FXML  private AnchorPane anchorPane;
	@FXML private ImageView logo;
	@FXML
	private TableView<Patient> tablePa;
	@FXML
	private TableColumn<Patient, Integer> idPa;
	@FXML
	private TableColumn<Patient, String> nomPa;
	@FXML
	private TableColumn<Patient, String> prenomPa;
	@FXML
	private TableColumn<Patient, String> emailPa;
	@FXML
	private TableColumn<Patient, String> telePa ;
	@FXML
	private TableColumn<Patient,String> datePa;
	@FXML
	private TableColumn<Patient, String> adressePa;
	@FXML
	private TableColumn<Patient, String> cnssPa;

	@FXML  private TextField textid;
	@FXML  private TextField textnom;
	@FXML  private TextField textprenom;
	@FXML  private TextField textemail;
	@FXML  private TextField texttele;
	@FXML  private TextField textdate;
	@FXML  private TextField textadresse;
	@FXML  private TextField textcnss;
	
	

	
	@FXML  private Button boutonAjouterPa;
	@FXML  private Button boutonModifierPa;
	@FXML  private Button boutonSupprimerPa;
	@FXML  private Button boutonEffacerPa;
	@FXML  private Button boutonChercherPa;
	@FXML  private Button boutonafficherPa;
	@FXML  private Button acceuil;
	  private Stage Stage;
	    private Main main;
	    
	    
	     public  void init( Main main,Stage Stage){
	        this.Stage=Stage;
	        this.main=main; }
	     
	     
	     
	     
	     
	     public ObservableList<Patient> list = FXCollections.observableArrayList();
	   //affichage des Patients
	   	@FXML
	   	public void afficherPa() {

	   		try {
					Connection conn = connect.dbConnection.connect();
					String sql = "SELECT * FROM patient";
					PreparedStatement stat = (PreparedStatement) conn.prepareStatement(sql);
		   			ResultSet res = stat.executeQuery();
		   			while (res.next()) {
		   			
		   				list.add(new Patient(res.getInt(1), res.getString(2), res.getString(3),res.getString(4), res.getString(5),res.getString(6),res.getString(7),res.getString(8)));
						
						
					}
		   			
		   			conn.close();
	   		} catch (Exception e) {

	   			e.printStackTrace();
	   		}
	   	     System.out.println(""+list.size());
	   	     
	   	    idPa.setCellValueFactory(new PropertyValueFactory<Patient, Integer>("id_Patient"));
 			nomPa.setCellValueFactory(new PropertyValueFactory<Patient, String>("nom"));
 			prenomPa.setCellValueFactory(new PropertyValueFactory<Patient, String>("prenom"));
 		    emailPa.setCellValueFactory(new PropertyValueFactory<Patient, String>("email"));
 		    telePa.setCellValueFactory(new PropertyValueFactory<Patient, String>("telephone"));
 		    datePa.setCellValueFactory(new PropertyValueFactory<Patient, String>("dateDeNaissance"));
 	        adressePa.setCellValueFactory(new PropertyValueFactory<Patient, String>("adresse"));
 	        cnssPa.setCellValueFactory(new PropertyValueFactory<Patient, String>("cnss"));
 	        tablePa.setItems(list);


	   	}

	   	//ajouter les Patients
	   	public static int save(Patient pa){
	   		int pat= 0;
	   		try {
	   			Connection conn = connect.dbConnection.connect();
	   			String sql = "INSERT INTO patient (nom,prenom,email,telephone,dateDeNaissance,adresse,cnss) VALUES(?,?,?,?,?,?,?)";
	   			PreparedStatement stat;
	   			stat = (PreparedStatement) conn.prepareStatement(sql);
	   			stat.setString(1,pa.getNom() );
	   			stat.setString(2, pa.getPrenom());
	   			stat.setString(3,pa.getEmail());
	   			stat.setString(4, pa.getTelephone());
	   			stat.setString(5, pa.getDateDeNaissance());
	   			stat.setString(6, pa.getAdresse());
	   			stat.setString(7, pa.getCnss());
	   			pat= stat.executeUpdate();
	   			conn.close();
	   			
	   		} 
	   		
	   		catch (Exception e) {
	   			e.printStackTrace();

	   		}
	   		return pat;
	   		
	   	}

	   	@FXML
	   	public void AjouterPa(ActionEvent event) {
	   		String Nom = textnom.getText();
	   		String Prenom = textprenom.getText();
	   		String Email = textemail.getText();
	   		String Tele = texttele.getText();
	   		String Date = textdate.getText();
	   		String Adresse = textadresse.getText();
	   		String Cnss = textcnss.getText();

	   		Patient pa = new Patient();
	   		pa.setNom(Nom);
	   		pa.setPrenom(Prenom);
	   	    pa.setEmail(Email);
	   	    pa.setTelephone(Tele);
	   		pa.setDateDeNaissance(Date);
	   		pa.setAdresse(Adresse);
	   		pa.setCnss(Cnss);
	   		int status = save(pa);
	   		if (status > 0) {
	   			Alert alert = new Alert(AlertType.INFORMATION);
	   			alert.setTitle("Add Patients");
	   			alert.setHeaderText("Informations");
	   			alert.setContentText("Patient est bien ajouté");
	   			alert.showAndWait();

	   		} else

	   		{
	   			Alert alert = new Alert(AlertType.ERROR);
	   			alert.setTitle("Add Patients");
	   			alert.setHeaderText("Informations");
	   			alert.setContentText("Patient Non ajouté");
	   			alert.showAndWait();

	   		}
	   	}
	   // vider les champs
	   	@FXML
	   	public void effacerPa(ActionEvent event) throws IOException {
	   		textid.clear();
	   		textnom.clear();
	   		textprenom.clear();
	   		textemail.clear();
	   		texttele.clear();
	   		textdate.clear();
	   		textadresse.clear();
	   		textcnss.clear();
	   	}
	   	
	   	
	   	
	   	// Modifier ou supprimer Patient

	   		
	   public static Patient getPatient(String nom) {
	   		
	   		
		   Patient pa = new Patient();
	   		try {

	   			Connection conn = connect.dbConnection.connect();
	   			String sql = "SELECT * FROM patient WHERE nom=?";
	   			PreparedStatement stat;
	   			stat = (PreparedStatement) conn.prepareStatement(sql);
	   			stat.setString(1, nom);

	   			ResultSet rest = stat.executeQuery();
	   			
	   			if(rest.next()) {
	   				pa.setId_Patient(rest.getInt(1));
	   				pa.setNom(rest.getString(2));
	   		   		pa.setPrenom(rest.getString(3));
	   		   	    pa.setEmail(rest.getString(4));
	   		   	    pa.setTelephone(rest.getString(5));
	   		   		pa.setDateDeNaissance(rest.getString(6));
	   		   		pa.setAdresse(rest.getString(7));
	   		   		pa.setCnss(rest.getString(8));
	   						
	   			}
	   			conn.close();

	   		}

	   		catch (SQLException e) {
	   			e.printStackTrace();
	   		}
	   		return pa;
	   		
	   	}
	   	@FXML
	   	public void chercherPa(ActionEvent event) throws IOException, ParseException{
	   		String nom= textnom.getText();
	   		Patient pa =  getPatient(nom);
	   	    String id= Integer.toString(pa.getId_Patient());
	   		textid.setText(id);
			textnom.setText(pa.getNom());
	   		textprenom.setText(pa.getPrenom());
	   		textemail.setText(pa.getEmail());
	   		texttele.setText(pa.getTelephone());
	   		textdate.setText(pa.getDateDeNaissance());
	   		textadresse.setText(pa.getAdresse());
	   		textcnss.setText(pa.getCnss());
	   		;
	   	}
	   	//**********************2 Modifier Patients*************************
	   	public static int update(Patient pa) {

	   		int pat = 0;
	   		try {
	   			Connection conn = connect.dbConnection.connect();
	   			String sql = "UPDATE patient SET nom=? , prenom=?, email=? ,telephone=? dateDeNaissance=?,adresse=?,cnss=? ";
	   			PreparedStatement stat;
	   			stat = (PreparedStatement) conn.prepareStatement(sql);
	   		

	   			stat.setString(1, pa.getNom());
	   			stat.setString(2, pa.getPrenom());
	   			stat.setString(3, pa.getEmail());
	   			stat.setString(4, pa.getTelephone());
	   			stat.setString(5, pa.getDateDeNaissance());
	   			stat.setString(6, pa.getAdresse());
	   			stat.setString(7, pa.getCnss());
	   			pat = stat.executeUpdate();
	   			conn.close();

	   		}

	   		catch (SQLException e) {
	   			e.printStackTrace();

	   		}
	   		return pat;

	   	}
	   	
	   	@FXML
	   	public void modifierPa(ActionEvent event) throws IOException{
	   		String txtid = textid.getText();
	   		String txtnom = textnom.getText();
	   		String txtprenom = textprenom.getText();
	   		String txtemail = textemail.getText();
	   		String txttele = texttele.getText();
	   		String txtdate = textdate.getText();
	   		String txtadresse = textadresse.getText();
	   		String txtcnss = textcnss.getText();
	   		
	   		Patient pa= new Patient ();
	   	        pa.setNom(txtid);
	   		    pa.setNom(txtnom);
		   		pa.setPrenom(txtprenom);
		   	    pa.setEmail(txtemail);
		   	    pa.setTelephone( txttele );
		   		pa.setDateDeNaissance(txtdate);
		   		pa.setAdresse(txtadresse);
		   		pa.setCnss(txtcnss);
	   	
	   		int status=update(pa);
	   		if (status > 0) {
	   			Alert alert = new Alert(AlertType.INFORMATION);
	   			alert.setTitle("Modifier patients");
	   			alert.setHeaderText("Informations");
	   			alert.setContentText("notre patient est bien changé");
	   			alert.showAndWait();

	   		} else

	   		{
	   			Alert alert = new Alert(AlertType.ERROR);
	   			alert.setTitle("Modifier patients");
	   			alert.setHeaderText("Informations");
	   			alert.setContentText("notre patient N'est pas changé");
	   			alert.showAndWait();

	   		}
	   		

	   	}
	   	
	   	//************3 Supprimer patient*********************
	   	
	   	public static int delete(String nom) {
	   		int pa = 0;
	   		try {
	   			Connection conn = connect.dbConnection.connect();
	   			String sql = "DELETE FROM patient WHERE nom=?";
	   			PreparedStatement stat;
	   			stat = (PreparedStatement) conn.prepareStatement(sql);
	   			stat.setString(1, nom);

	   			pa = stat.executeUpdate();
	   			conn.close();

	   		}

	   		catch (SQLException e) {
	   			e.printStackTrace();
	   		}
	   		return pa;
	   	}
	   	
	   	
	   	@FXML
	   	public void supprimerPa(ActionEvent event) throws IOException {
	   		String nom= textnom.getText();
	   		int status= delete(nom);
	   		if (status > 0) {
	   			Alert alert = new Alert(AlertType.INFORMATION);
	   			alert.setTitle("Supprimer patients");
	   			alert.setHeaderText("Informations");
	   			alert.setContentText("patient est bien supprmimé");
	   			alert.showAndWait();

	   		} else

	   		{
	   			Alert alert = new Alert(AlertType.ERROR);
	   			alert.setTitle("Supprimer patients");
	   			alert.setHeaderText("Informations");
	   			alert.setContentText("patient ne pas  Supprimé");
	   			alert.showAndWait();

	   		}
	   		
	   		
	   		
	   		
	   		
	   	}
	   	@FXML
		public void acceuilaction(ActionEvent event) throws IOException {
			main.PatientClose();
	        main.Menu();}
	   	


			@Override
			public void initialize(URL arg0, ResourceBundle arg1) {
				
				// TODO Auto-generated method stub
				logo.setOnMouseEntered(e ->{
			        RotateTransition rotateTransition=new RotateTransition(Duration.seconds(2), logo);
			        rotateTransition.setFromAngle(0);
			        rotateTransition.setToAngle(360);
			        rotateTransition.play();
			        });
			        
			       // logo.setOnMouseClicked(e ->{
			        
			       // Main.usersWindow();
			       // });
			        
			       RotateTransition rotateTransition=new RotateTransition(Duration.seconds(122), logo);
			       rotateTransition.setFromAngle(0);
			       rotateTransition.setToAngle(10*720);
			       rotateTransition.play();
			}
	    
	    
	    
	    
	    
}	    