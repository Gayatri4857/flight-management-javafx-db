package add_flight;

import db_operations.DBUtils;
import flight_booking_screen.FlightBookingScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import search_user_screen.FlightBookingSearchUserScreen;

public class AddFlightController {
	@FXML
	private TextField flight_name;
	
	@FXML
	private TextField payment_cost;
	
	@FXML
	private TextField departure_city;
	
	@FXML
	private TextField arrival_city;
	
	@FXML
	private TextField booking_date;
	
	@FXML
	private TextField arrival_date;
	
	@FXML
	private TextField time_of_flight;
	
	@FXML 
	private Button close_button;
	
	@FXML
	private Button save_button;
	
	
	public void SaveButton(ActionEvent event) {
		String query = "insert INTO flight(flightname,payment,departurecity,arrivalcity,bookingdate,arrivaldate,timeofflight)Values('"+flight_name.getText()+"','"+payment_cost.getText()+"','"+departure_city.getText()+"','"+arrival_city.getText()+"','"+booking_date.getText()+"','"+arrival_date.getText()+"','"+time_of_flight.getText()+"')";
		
		DBUtils.executeQuery(query);
	
		try {
			FlightBookingSearchUseScreen.showSearchUserScreen();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
   }
	public void CloseButton(ActionEvent event) {
		try {
			FlightBookingScreen.showFlightBookingScreen();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
