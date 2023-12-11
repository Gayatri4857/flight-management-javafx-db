package edit_flight;

import java.sql.ResultSet;
import java.sql.SQLException;

import db_operations.DBUtils;
import flight_booking_screen.FlightBookingScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import login_screen.LoginScreen;

public class FlightBookingEditScreenController {
	@FXML
	private TextField flightname;
	
	@FXML
	private TextField new_flightname;
	
	@FXML
	private TextField new_payment;
	
	@FXML
	private TextField new_departure_city;
	
	@FXML
	private TextField new_arrival_city;
	
	@FXML
	private TextField new_booking_date;
	
	@FXML
	private TextField new_arrival_date;
	
	@FXML
	private TextField new_time_of_flight;
	
	
	@FXML
	private Button back;
	
	@FXML
	private Button save;
	
	@FXML
	private Button Edit;
	
	public void editButton(ActionEvent event) throws SQLException{
         boolean editstatus = editFlight(flightname.getText());
		
		if(editstatus) {
			editFlight(null);
		}
		
		else {
			System.out.println("Flight not found");
		}
	}
	public boolean editFlight(String flightname) throws SQLException{
		
		
		 String query ="select * from flight where flightname ='"+ flightname+ "' ";   
         ResultSet rs = DBUtils.executeQueryGetResult(query);
         
	try {
		if (rs.next()) {
	    	  
			    new_flightname.setText(rs.getString("flightname"));
			    new_payment.setText(rs.getString("payment"));
			    new_departure_city.setText(rs.getString("departurecity"));
			    new_arrival_city.setText(rs.getString("arrivalcity"));
			    new_booking_date.setText(rs.getString("bookingdate"));
			    new_arrival_date.setText(rs.getString("arrivaldate"));
			    new_time_of_flight.setText(rs.getString("timeofflight"));
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
	
	public void save_button(ActionEvent event) {
		
		String query1 = "UPDATE flight SET flightname= '" +new_flightname.getText() + "', payment = '" + new_payment.getText() + "', "
				+ "departurecity = '" + new_departure_city.getText() + "', " + "arrivalcity= '" + new_arrival_city.getText() + "',"
				+ "bookingdate = '" + new_booking_date.getText() + "',arrivaldate = '" + new_arrival_date.getText()+"',timeofflight= '"+ new_time_of_flight.getText() +"'"+ "WHERE flightname = '" +  flightname.getText() + "'";

		DBUtils.executeQuery(query1);
		
		try {
			LoginScreen.showLoginScreen();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
			}
			
		
}
