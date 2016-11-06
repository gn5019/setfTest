package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class mainController 
{
	@FXML
	private Button getMetaFile;
	private Button imptMetaFile;
	TextField txtMetaFile;
	
	public void chooseMetaFile(ActionEvent event)
	{
		System.out.println("Button Click");
	}
}
