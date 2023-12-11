package flight_booking_screen;

import add_flight.FlightBookingAddFlight;
import edit_flight.FlightBookingEditFlightScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import login_screen.LoginScreen;
import search_flight.FlightBookingSearchFlightScreen;

public class FlightBookingScreenController {
	@FXML
	private Button Add_Flight;
	
	@FXML
	private Button Edit_FLight;
	
	@FXML
	private Button Delete_Flight;
	
	@FXML
	private Button Search_Flight;
	
	@FXML
	private Button Quit;
	
	public void add_flight(ActionEvent event) {
		try {
			FlightBookingAddFlight.showAddFlight();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void edit_flight(ActionEvent event) {
	   try {
		FlightBookingEditFlightScreen.showeditscreen();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}
	public void delete_flight(ActionEvent event) {
		
		try {
			FlightBookingSearchFlightScreen.showSearchScreen();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void search_flight(ActionEvent event) {
		try {
			FlightBookingSearchFlightScreen.showSearchScreen();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	}
	public void quit(ActionEvent event) {
		try {
			LoginScreen.showLoginScreen();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
