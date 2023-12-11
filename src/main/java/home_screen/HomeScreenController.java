package home_screen;

import flight_booking_screen.FlightBookingScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import login_screen.LoginScreen;
import user_management_screen.FlightBookingUserManagementScreen;


public class HomeScreenController {
	@FXML
	private Button userManagement;
	
	@FXML
	private Button flightBookingSystem;
	
	@FXML
	private Button backButton;
	
	public void showUserManagementScreen(ActionEvent event) {
		
		try {
			FlightBookingUserManagementScreen.showUserManagementScreen();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void showFlightBookingSystemScreen(ActionEvent event) {
		try {
			FlightBookingScreen.showFlightBookingScreen();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void backToHomeScreen(ActionEvent event) {
		try {
			LoginScreen.showLoginScreen();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
}
