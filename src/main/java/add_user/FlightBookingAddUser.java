package add_user;

import java.net.URL;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class FlightBookingAddUser {
	public static void showAddUser() throws Exception{
		try {
			Parent actorGroup = FXMLLoader.load(new URL("file:///C:\\Users\\hemag\\eclipse-workspace\\flight-booking-system-jfx-db\\src\\add_user\\FlightBookingAddUser.fxml"));
			StageFactory.stage.setTitle("Customer Login");
			Scene scene = new Scene(actorGroup,600,400);
			StageFactory.stage.setScene(scene);
			StageFactory.stage.setFullScreen(true);
			StageFactory.stage.show();
		}
		catch(Exception e) {
			e.printStackTrace();

		}
	}
}
