package it.polito.tdp.alien;

import it.polito.tpd.model.Dizionario;
import it.polito.tpd.model.Parola;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {

    @FXML
    private Button btmClear;

    @FXML
    private Button btmTranslate;

    @FXML
    private TextField txtInput;

    @FXML
    private TextArea txtOutput;

    @FXML
	private Dizionario model;
    
    @FXML
    public void setModel(Dizionario model) {
		this.model = model;
	}
    
    @FXML
    public Dizionario getModel() {
		return model;
	}

    @FXML
    void doClear(ActionEvent event) {
    	this.txtInput.setText("");
    	this.txtOutput.setText("");
    }

    @FXML
    void doTranslate(ActionEvent event) {
    	this.txtOutput.clear();
    	this.txtOutput.setText(model.leggiParola(this.txtInput.getText()));
    }

}
