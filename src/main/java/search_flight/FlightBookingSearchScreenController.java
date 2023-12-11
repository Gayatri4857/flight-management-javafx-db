package search_flight;

import java.sql.ResultSet;
import java.sql.SQLException;

import db_operations.DBUtils;
import flight_booking_screen.FlightBookingScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class FlightBookingSearchScreenController {
	@FXML
	private TextField FlightName;
	
	@FXML
	private TextField flight_name;
	
	@FXML 
	private TextField Payment_Cost;
	
	@FXML
	private TextField Departure_City;
	
	@FXML
	private TextField Arrival_City;
	
	@FXML
	private TextField Booking_Date;
	
	@FXML
	private TextField Arrival_Date;
	
	@FXML
	private TextField Time_Of_Flight;
	
	@FXML
	private Button Edit_Button;
	
	@FXML 
	private Button BackButton;
	
	@FXML
	private Button Delete;
	
	@FXML
	private Button Search;
	

	public void search_button(ActionEvent event) throws SQLException{
		boolean searchstatus = searchUser(FlightName.getText());
		
		if(searchstatus) {
			searchUser(null);
		}
		
		
	}
	public boolean searchUser(String FlightName) throws SQLException{
		
		
		 String query ="select * from flight where flightname ='"+ FlightName+ "' ";   
         ResultSet rs = DBUtils.executeQueryGetResult(query);
         
       
	try {
		if (rs.next()) {
	    	  
			    flight_name.setText(rs.getString("flightname"));
			    Payment_Cost.setText(rs.getString("payment"));
			    Departure_City.setText(rs.getString("departurecity"));
			    Arrival_City.setText(rs.getString("arrivalcity"));
			    Booking_Date.setText(rs.getString("bookingdate"));
			    Arrival_Date.setText(rs.getString("arrivaldate"));
			    Time_Of_Flight.setText(rs.getString("timeofflight"));
			    
			    
	    	}
	}
	
		catch(SQLException e) {
			e.printStackTrace();
		}
	
		return false; 
	}

	public void back_button(ActionEvent event) {
		try {
			FlightBookingScreen.showFlightBookingScreen();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void edit_button(ActionEvent event) {
		
		
	}
	
	public void delete_button(ActionEvent event) {
		String query = "delete from flight where flightname='" + FlightName.getText()+"' ";
	     DBUtils.executeQuery(query);
	    
		
}
}
