package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import org.controlsfx.control.Notifications;
import application.Main;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.scene.control.Alert;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;


public class menuController implements Initializable {
	
	@FXML  private AnchorPane rootPane;
	@FXML  private Button boutonPatient;
	@FXML  private Button boutonRDV;
	@FXML  private Button boutonHistorique;
	@FXML  private Button retourStatistiquePaBouton;
	@FXML  private Button retourAproposPaBouton;
	 
	    private Stage Stage;
	    private Main main;
	    
	    
	    public void init(Main main,Stage Stage) {
	    	  this.Stage=Stage;
	    	  this.main=main;
	    	}
	   /* public  void Patient() { 
	        try {
	        	
	        	 Parent root = FXMLLoader.load(getClass().getResource("/view/Patient.fxml"));
	 	  		Scene scene = new Scene(root, 480, 380);
	 	  		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
	 	  		window.setScene(scene);
	 	  		window.show();
	        } catch (Exception ex) {
	        
	    }}*/
	    @FXML
	    public  void allerPatient(ActionEvent event) { 
	        try {
	        	 main.menuClose();
	        	 main.Patient();
	        } catch (Exception ex) {
	        
	    }}
	    
	    
	    @FXML
	    public  void retourStatistiquePa(ActionEvent event) { 
	        try {
	        	 main.menuClose();
	        	 main.Statistique();
	        } catch (Exception ex) {
	        
	    }}
	    @FXML
	    public  void retourAproposPa(ActionEvent event) { 
	        try {
	        	 main.menuClose();
	        	 main.Apropos();
	        } catch (Exception ex) {
	        
	    }}
	
   @FXML
    void menurdv(ActionEvent event) {
        try {
         //  main.menuClose();
          //main.signupWindow();
        } catch (Exception ex) {
        }
    }
    
    @FXML
    void menuhistorique(ActionEvent event) {
        try {
       //   main.menuClose();
         // main.signupWindow();
        } catch (Exception ex) {
        }
    }


	public void initialize(URL url, ResourceBundle rb) {

      /*  FadeTransition fadeout = new FadeTransition(Duration.seconds(2.5), rootPane);
		fadeout.setFromValue(1);
		fadeout.setToValue(0);
		fadeout.play();

		fadeout.setOnFinished(event -> {

			rootPane.setStyle(" -fx-background-image: url(\"/image/image-1.jpg\");");

		    FadeTransition fadein = new FadeTransition(Duration.seconds(2.5), rootPane);
		    fadein.setFromValue(0);
		    fadein.setToValue(0.6);
		    fadein.play();

		    fadein.setOnFinished(e -> {

		    	rootPane.setStyle(" -fx-background-image: url(\"/image/sgh-main-banner4.jpg\");");
		        FadeTransition fadein2 = new FadeTransition(Duration.seconds(2.5), rootPane);
		        fadein2.setFromValue(0);
		        fadein2.setToValue(1);
		        fadein2.play();

		        fadein2.setOnFinished(event2 -> {

		        	rootPane.setStyle(" -fx-background-image: url(\"/image/banner_aae1.jpg\");");

		            FadeTransition fadein3 = new FadeTransition(Duration.seconds(2.5), rootPane);
		            fadein3.setFromValue(1);
		            fadein3.setToValue(0);
		            fadein3.play();

		            fadein3.setOnFinished(event3 -> {
		            	rootPane.setStyle(" -fx-background-image: url(\"/image/image-1.jpg\");");

		                FadeTransition fadein4 = new FadeTransition(Duration.seconds(2.5), rootPane);
		                fadein4.setFromValue(0);
		                fadein4.setToValue(1);
		                fadein4.play();

		                fadein4.setOnFinished(event4 -> {
		                	rootPane.setStyle(" -fx-background-image: url(\"/image/banner5.jpg\");");

		                    FadeTransition fadein5 = new FadeTransition(Duration.seconds(2.5), rootPane);
		                    fadein5.setFromValue(0);
		                    fadein5.setToValue(1);
		                    fadein5.play();

		                });

		            });
		        });

		    });

		});*/

 }}


/*@FXML
private Label NameLB;

@FXML
private Label usernameLB;

@Override
public void initialize(URL url, ResourceBundle rb) {
    usernameLB.setText(SigninFXMLController.usernameforHome);
    NameLB.setText(SigninFXMLController.nameforHome);
}

@FXML
void showStatistics(ActionEvent event) {
    Signin.StatisticsWindow();
}

@FXML
void about(ActionEvent event) {
    Signin.AboutWindow();
}

@FXML
void exit(ActionEvent event) {

    Signin.clinicsWindowClose();
}*/
	
            


            
            
            
     