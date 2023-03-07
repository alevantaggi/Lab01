package it.polito.tdp.Lab01;

import java.net.URL;
import java.util.ResourceBundle;
import it.polito.tdp.Lab01.model.Parole;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Parole elenco ;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    
    @FXML
    private Button btnCancella;

    @FXML
    private Button btnInserisci;

    @FXML
    private Button btnReset;

    @FXML
    private TextField txtParola;

    @FXML
    private TextArea txtResult;
    
    @FXML
    private TextArea txtTime;

    @FXML
    void doDelete(ActionEvent event) {
    	String s= txtParola.getText();
    	txtResult.setText("");
    	txtTime.setText("");
    	long timeStart= System.nanoTime();
    	
    	elenco.removeParola(s);
    	
    	
    	for(String p: elenco.getElenco()) 
    		txtResult.appendText(p+"\n");
    	
    	long timeFinish= System.nanoTime();
    	txtTime.setText("Durata totale: "+(timeFinish-timeStart));
    }
    
    @FXML
    void doInsert(ActionEvent event) {
    	txtResult.setText("");
    	txtTime.setText("");
    	
    	long timeStart= System.nanoTime();
    	
    	
    	String s= txtParola.getText();
    	elenco.addParola(s);
    	
    	
    	for(String p: elenco.getElenco()) 
    		txtResult.appendText(p+"\n");
    		
    	long timeFinish= System.nanoTime();	
    		
    	txtTime.setText("Durata totale: "+(timeFinish-timeStart));
    	
		txtParola.setText("");
    }

    @FXML
    void doReset(ActionEvent event) {
    	txtResult.setText("");
    	txtTime.setText("");
    	long timeStart= System.nanoTime();
    	
    	elenco.reset();
    	
    	long timeFinish= System.nanoTime();	
    	txtTime.setText("Durata totale: "+(timeFinish-timeStart));
    }

    @FXML
    void initialize() {
        assert btnCancella != null : "fx:id=\"btnCancella\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtTime != null : "fx:id=\"txtTime\" was not injected: check your FXML file 'Scene.fxml'.";
        elenco= new Parole();
    }

}
