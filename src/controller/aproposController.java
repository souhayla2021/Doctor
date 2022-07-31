package controller;

import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class aproposController {
	  @FXML
	private Button  boutonapropos;
	private Stage Stage;
    private Main main;


	public  void init( Main main,Stage Stage){
			        this.Stage=Stage;
			        this.main=main;
	}

@FXML
	public void revenir(ActionEvent event) throws IOException {
		main.AproposClose();
        main.Menu();}
	
}

