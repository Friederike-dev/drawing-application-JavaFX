package ils_14_JavaFX_MiniMal;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MiniMal_Main extends Application {
	
	@Override
	public void start(Stage meineStage) throws Exception {
		//die Datei laden
		Parent root = FXMLLoader.load(getClass().getResource("sb_minimal.fxml"));		

		//die Szene erzeugen
		//an den Konstruktor werden der oberste Knoten und die Größe übergeben
		Scene meineScene = new Scene(root, 800, 600);
		
		//den Titel über stage setzen
		meineStage.setTitle("MiniMal Friederike Hemsen");
		//die Szene setzen
		meineStage.setScene(meineScene);
		//und anzeigen
		meineStage.show();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	launch(args);
}
}