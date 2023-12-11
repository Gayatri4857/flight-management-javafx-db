package add_user;

import db_operations.DBUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import search_user_screen.FlightBookingSearchUserScreen;
import user_management_screen.FlightBookingUserManagementScreen;


public class AddUserController {
	@FXML
	private TextField user_name;
	
	@FXML
	private TextField email_id;
	
	@FXML
	private TextField pass;
	
	@FXML
	private TextField confirm_password;
	
	@FXML
	private TextField user_role;
	
	@FXML 
	private Button close_button;
	
	@FXML
	private Button save_button;
	
	
	public void SaveButton(ActionEvent event) {
		String query = "insert INTO users(username,emailId,passwords,confirmpassword,userrole)Values('"+user_name.getText()+"','"+email_id.getText()+"','"+pass.getText()+"','"+confirm_password.getText()+"','"+user_role.getText()+"')";
		
		DBUtils.executeQuery(query);
	
		try {
			FlightBookingSearchUserScreen.showSearchUserScreen();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
   }
	public void CloseButton(ActionEvent event) {
		try {
			FlightBookingUserManagementScreen.showUserManagementScreen();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
