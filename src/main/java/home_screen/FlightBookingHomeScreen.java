package home_screen;

import java.net.URL;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class FlightBookingHomeScreen {
	public static void showHomeScreen() throws Exception{
		try {
			
			Parent actorGroup = FXMLLoader.load(new URL("file:///C:\\\\Users\\\\hemag\\\\eclipse-workspace\\\\flight-booking-system-jfx-db\\\\src\\\\home_screen\\\\FlightBookingHomeScreen.fxml"));
			StageFactory.stage.setTitle("Customer Login");
			Scene scene = new Scene(actorGroup,1000,400);
			StageFactory.stage.setScene(scene);
			StageFactory.stage.setFullScreen(true);
			StageFactory.stage.show();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
