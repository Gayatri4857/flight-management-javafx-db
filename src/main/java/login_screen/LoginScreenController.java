package login_screen;

import java.sql.ResultSet;
import java.sql.SQLException;

import db_operations.DBUtils;
import frount_page.FrountPage;
import home_screen.FlightBookingHomeScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoginScreenController {
	@FXML
	private TextField EmailID;
	
	@FXML
	private TextField Password;
	
	@FXML
	private Button Login;
	
	public void login_button(ActionEvent event)
	{
		boolean loginStatus = LoginScreenController.validateUserandPassword(EmailID.getText(),Password.getText());
		
		if(loginStatus)
		{
		try {
			FlightBookingHomeScreen.showHomeScreen();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		else {
			System.out.println("Login Unsuccessfully!!");
			
		}
	}
	
	public static boolean validateUserandPassword(String EmailID,String Password) {
		String query = "Select * from users where emailId= '"+ EmailID + "'and passwords='" +Password+"' ";
		ResultSet rs = DBUtils.executeQueryGetResult(query);
		
		try {
			if (rs.next()) {
				return true;
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	
	
} 
}
