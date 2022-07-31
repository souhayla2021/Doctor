package controller;

import java.net.URL;
import java.util.ResourceBundle;
import application.Main;
import javafx.animation.FadeTransition;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ouvertureAppController implements Initializable {
    @FXML
    private AnchorPane splashAnchorPane;
    
    private Stage Stage;
    private Main main;
    
    
    public  void init( Main main,Stage Stage){
        this.Stage=Stage;
        this.main=main;
        
        }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
       new splash().start();
    }
    
    class splash extends Thread{

        @Override
        public void run() {

            Platform.runLater(new Runnable() {
                @Override
                public void run() {

                    try {
                        Thread.sleep(1500);
                        FadeTransition fadeout=new FadeTransition(Duration.seconds(4), splashAnchorPane);
                        fadeout.setFromValue(1);
                        fadeout.setToValue(0);
                        fadeout.setCycleCount(1);
                        fadeout.play();
                        
                        fadeout.setOnFinished(e ->{
                        	main.WindowClose();
                        	main.Login();

                        });
                       
                    } 
                    catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            });
        }
    
    }
    
}
