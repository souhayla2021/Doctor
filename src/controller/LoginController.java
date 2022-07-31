package controller;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import org.controlsfx.control.Notifications;

import com.jfoenix.validation.RequiredFieldValidator;
import application.Main;
import connect.dbConnection;
import javafx.animation.RotateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class LoginController implements Initializable{
	@FXML private ImageView logo;
	@FXML private TextField LoginText;
	@FXML private PasswordField LoginMotDePasse;
	@FXML private Button ButonConnect;
	@FXML private Label label;
	@FXML  private AnchorPane rootPane;
	
	  private Stage Stage;
	    private Main main;
	    
	    
	    public  void init( Main main,Stage Stage){
	        this.Stage=Stage;
	        this.main=main;
	        
	        }
	    public  RequiredFieldValidator validator(String msg){
	    	RequiredFieldValidator validator=new RequiredFieldValidator();
	        validator.setOpacity(0.5);
	        validator.setMessage(msg);         
	        return validator;
	        }
	

	public void loginAction(ActionEvent event)throws SQLException{
		Connection con = connect.dbConnection.connect();
		PreparedStatement stat=null;
		ResultSet rs= null;
		String sql="SELECT * FROM medecin WHERE login=? AND motDePasse=?";
	try {
		stat=con.prepareStatement(sql);
		stat.setString(1,LoginText.getText().toString());
		stat.setString(2,LoginMotDePasse.getText().toString());
		rs=stat.executeQuery();
		if (rs.next()) {
		          main.LoginClose();
		          main.Menu();
			// Notifications  notification=Notifications.create()
                     // .graphic(new ImageView(image))
                     /* .title("login complete ")
                      .text(rs.getString("login") +" has loged in")
                      .hideAfter(Duration.seconds(3))
                      .position(Pos.BOTTOM_RIGHT);                           
                     notification.showInformation();*/
			
		}else {
			label.setText("non Connectee");
		}
		}catch(Exception e) {}
	}


  /*  @FXML
    void signupAction(ActionEvent event) {
        try {
          main.LoginClose();
          main.Login();
        } catch (Exception ex) {
        }
    }*/
   
     
    public void initialize(URL url, ResourceBundle rb) {
        
    	//LoginText.getValidators().add(validator("Input is requird"));
    	//LoginMotDePasse.getValidators().add(validator("Input is requird"));

    	logo.setOnMouseEntered(e ->{
        RotateTransition rotateTransition=new RotateTransition(Duration.seconds(2), logo);
        rotateTransition.setFromAngle(0);
        rotateTransition.setToAngle(360);
        rotateTransition.play();
        });
        
        logo.setOnMouseClicked(e ->{
        
       main.Patient();
       });
        
       RotateTransition rotateTransition=new RotateTransition(Duration.seconds(122), logo);
       rotateTransition.setFromAngle(0);
       rotateTransition.setToAngle(10*720);
       rotateTransition.play();

    } 



		
	}
	

