package controller;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.stage.Stage;







/**
 * FXML Controller class
 *
 * @author 
 */
public class statistiqueController  implements Initializable {

	 @FXML
	    private BarChart<?, ?> barChart;

    @FXML
    private CategoryAxis x;

    @FXML
    private NumberAxis y;
    @FXML
    private Button  precedant;

    private Stage Stage;
    private Main main;
   
    
    
     public  void init( Main main,Stage Stage){
        this.main=main; }

     int countPatient;
     int countRdv;

     @Override

     public void initialize(URL url, ResourceBundle rb) {

         XYChart.Series set = new XYChart.Series<>();
         
         try {
			countPient("Patient");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         set.getData().add(new XYChart.Data("Patient", countPatient));
         
        XYChart.Series set1 = new XYChart.Series<>();
         
         try {
        	 countrdv("Rendez_vous");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         set1.getData().add(new XYChart.Data("Rendez_vous", countRdv));
         

         barChart.getData().addAll(set,set1);

     }



    public void countPient(String tableName) throws SQLException {
        countPatient = 0;
        try {
       Connection conn = connect.dbConnection.connect();
       	String sql= "SELECT * FROM patient";
       	PreparedStatement stat = (PreparedStatement) conn.prepareStatement(sql);
       	ResultSet result= stat.executeQuery();
    	
            while (result.next()) {
                countPatient++;
                System.out.println(countPatient);}
 
            
                conn.close();
                stat.close();
        } catch (Exception e) {

   			e.printStackTrace();
   		} 
        }
 public void countrdv(String tableName) throws SQLException {
        countRdv = 0;
        try {
       Connection conn = connect.dbConnection.connect();
       	String sql= "SELECT * FROM rdv";
       	PreparedStatement stat = (PreparedStatement) conn.prepareStatement(sql);
       	ResultSet result= stat.executeQuery();
    	
            while (result.next()) {
                countRdv++;
                System.out.println(countRdv);}
 
            
                conn.close();
                stat.close();
        } catch (Exception e) {

   			e.printStackTrace();
   		} 
        }
    
	@FXML
	public void revenir(ActionEvent event) throws IOException {
		main.StatistiqueClose();
        main.Menu();}
	
    }






















