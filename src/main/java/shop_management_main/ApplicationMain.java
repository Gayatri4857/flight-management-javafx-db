package shop_management_main;

import common.StageFactory;
import frount_page.FrountPage;
import javafx.application.Application;
import javafx.stage.Stage;


public class ApplicationMain extends Application{
	
	public static void main(String args[]) {
		launch (args);
	}
	
	@Override
	public void start(Stage stage) throws Exception{
		StageFactory.stage= stage;
		FrountPage.showFrountPage();
	}
}
