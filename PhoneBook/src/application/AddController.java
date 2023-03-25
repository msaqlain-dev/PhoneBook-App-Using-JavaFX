package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class AddController {
	BST bst = new BST();
	BSTNode bstNode = new BSTNode();
	DirectoryModel directoryModel = new DirectoryModel();
	
	@FXML
	TextField name=new TextField();
	@FXML
	TextField phone=new TextField();
	@FXML
	TextField email=new TextField();
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void addcontact(MouseEvent event) throws IOException  {
		String n=name.getText();
		String p=phone.getText();
		String e=email.getText();
		bstNode.insertTodb(new DirectoryModel(n, p, e));
		
		root = FXMLLoader.load(getClass().getResource("Main.fxml"));
		stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void back(MouseEvent e) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Main.fxml"));
		stage = (Stage) ((Node)e.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}
