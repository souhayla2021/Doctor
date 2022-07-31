package application;

import controller.LoginController;
import controller.PatientController;
import controller.aproposController;
import controller.menuController;
import controller.ouvertureAppController;
import controller.statistiqueController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	 static Stage Stage,Stage1,Stage2,Stage3,Stage4,Stage5;
	 
	 
	 
	 public void start(Stage Stage) throws Exception {
	        this.Stage1 = Stage;
	        AppOuverture();
	    }
	public void Login() {
		try {
			
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Login.fxml"));
	        AnchorPane pane = loader.load();
	        LoginController controller = loader.getController();
	        Stage= new Stage();
            controller.init(this, Stage);
             Scene scene = new Scene(pane,580,380);
             Stage.setTitle("CabinetDoctor");
             scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Stage.setResizable(false);
			Stage.setScene(scene);
			Stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	 public void LoginClose() {
	        Stage.close();
	    }
	
	
	   public void AppOuverture() {

	        try {

	            FXMLLoader loader =new FXMLLoader(getClass().getResource("/view/ouvertureApp.fxml"));
	            AnchorPane pane = loader.load();
	            ouvertureAppController controller = loader.getController();
	            controller.init(this, Stage1);
	            Scene scene = new Scene(pane,580,380);
	            Stage1.initStyle(StageStyle.UNDECORATED);
	            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	            Stage1.setScene(scene);
	            Stage1.show();
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	  
	 public void WindowClose() {
	        Stage1.close();
	    }
	 
	 
		public void Menu() {

			 try {
		            FXMLLoader loader = new FXMLLoader(Main.class.getResource("/view/Menu.fxml"));
		            AnchorPane pane = loader.load();
		            menuController controller = loader.getController();
		            controller.init(this,Stage2);
		            Stage2 = new Stage();
		            Scene scene = new Scene(pane,580,380);
		            scene.getStylesheets().add(Main.class.getResource("application.css").toExternalForm());
		            Stage2.setTitle("Menu");
		            Stage2.setResizable(false);
		            Stage2.setScene(scene);
		            Stage2.setResizable(false);
		            Stage2.show();
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		    }

	 public void menuClose() {
	        Stage2.close();
	    }

	    public void Patient() {
	    								
	        try {
	            FXMLLoader loader = new FXMLLoader(Main.class.getResource("/view/Patient.fxml"));
	            AnchorPane pane = loader.load();
	            PatientController controller = loader.getController();
	            Stage3 = new Stage();
	            controller.init(this, Stage3);
	            Scene scene = new Scene(pane,700,500);
	            scene.getStylesheets().add(Main.class.getResource("application.css").toExternalForm());
	            Stage3.setTitle("PATIENT");
	            Stage3.setResizable(true);
	            Stage3.setScene(scene);
	            Stage3.show();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	
	 public void PatientClose() {
	        Stage3.close();
	    }
		public void Statistique() {

			 try {
		            FXMLLoader loader = new FXMLLoader(Main.class.getResource("/view/statistique.fxml"));
		            AnchorPane pane = loader.load();
		            statistiqueController controller = loader.getController();
		            controller.init(this,Stage4);
		            Stage4 = new Stage();
		            Scene scene = new Scene(pane,650,445);
		            scene.getStylesheets().add(Main.class.getResource("application.css").toExternalForm());
		            Stage4.setTitle("Menu");
		            Stage4.setResizable(false);
		            Stage4.setScene(scene);
		            Stage4.setResizable(false);
		            Stage4.show();
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		    }

	 public void StatistiqueClose() {
	        Stage4.close();
	    }

		public void Apropos() {

			 try {
		            FXMLLoader loader = new FXMLLoader(Main.class.getResource("/view/apropos.fxml"));
		            AnchorPane pane = loader.load();
		            aproposController controller = loader.getController();
		            controller.init(this,Stage5);
		            Stage5 = new Stage();
		            Scene scene = new Scene(pane,620,420);
		            scene.getStylesheets().add(Main.class.getResource("application.css").toExternalForm());
		            Stage5.setTitle("Apropos");
		            Stage5.setResizable(false);
		            Stage5.setScene(scene);
		            Stage5.setResizable(false);
		            Stage5.show();
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		    }

	 public void AproposClose() {
	        Stage5.close();
	    }
	public static void main(String[] args) {
		launch(args);
	}
	


    }














