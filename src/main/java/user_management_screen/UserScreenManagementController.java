package user_management_screen;

import add_user.FlightBookingAddUser;
import edit_user.FlightBookingEditUserScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import login_screen.LoginScreen;
import search_user_screen.FlightBookingSearchUserScreen;


public class UserScreenManagementController {
	@FXML
	private Button Add_User;
	
	@FXML
	private Button Edit_User;
	
	@FXML
	private Button Delete_User;
	
	@FXML
	private Button Search_User;
	
	@FXML
	private Button Quit;
	
	public void show_add_user_screen(ActionEvent event) {
		
		try {
			FlightBookingAddUser.showAddUser();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void show_edit_user_screen(ActionEvent event) {
		try {
			FlightBookingEditUserScreen.showEditUserScreen();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void show_delete_user_screen(ActionEvent event) {
		try {
			FlightBookingSearchUserScreen.showSearchUserScreen();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void show_search_user_screen(ActionEvent event) {
		try {
			FlightBookingSearchUserScreen.showSearchUserScreen();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	}
	public void show_quit_user(ActionEvent event) {
		try {
			LoginScreen.showLoginScreen();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
