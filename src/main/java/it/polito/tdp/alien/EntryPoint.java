package it.polito.tdp.alien;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import it.polito.tpd.model.Dizionario;

/**
 * JavaFX App
 */
public class EntryPoint extends Application {

    @Override
    public void start(Stage stage) throws IOException {
    	
    	FXMLLoader loader = new FXMLLoader(EntryPoint.class.getResource("/fxml/Scene.fxml")) ;
    	Parent root = loader.load();
    	Scene scene = new Scene(root) ;
    	
    	Dizionario model = new Dizionario();
    	FXMLController controller = loader.getController();
    	controller.setModel(model);

    	stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
