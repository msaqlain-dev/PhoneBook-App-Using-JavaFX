package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class DeleteController {

	BST bst = new BST();
	BSTNode bstNode = new BSTNode();
	DirectoryModel directoryModel = new DirectoryModel();
	
	@FXML
	TextField search=new TextField();
	@FXML
	Label name=new Label();
	@FXML
	TextField phone=new TextField();
	@FXML
	TextField email=new TextField();
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void search(String n) {
//        try {
//            ArrayList<DirectoryModel> directoryModels = new ArrayList<DirectoryModel>();
//            File f = new File("data.txt");
//            BufferedReader b = new BufferedReader(new FileReader(f));
//            String readLine = "";
//            while ((readLine = b.readLine()) != null) {
//                String[] arrOfStr = readLine.split(" ", 0); 
//                if (n.toLowerCase().equals(arrOfStr[0].toLowerCase())) {
//                    directoryModels.add(new DirectoryModel(arrOfStr[0], arrOfStr[1], arrOfStr[2]));
//                } 
//            }
//            if (directoryModels.isEmpty()) {
//                System.out.println("No such contacts found!");
//            } 
//            else {
//                for (DirectoryModel a:directoryModels) {
//                  System.out.print("Name: "+a.name+" Phone number: "+ a.phNum+" Email: "+a.email + "\n");
//                	name.setText(a.name);
//                }   
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
	
	public void deleteContact(ActionEvent event) throws IOException  {
//		String n=name.getText();
//		String p=phone.getText();
//		String e=email.getText();
//		search(search.getText());
//		name.setText("ABC");
//		root = FXMLLoader.load(getClass().getResource("Main.fxml"));
//		stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
//		scene = new Scene(root);
//		stage.setScene(scene);
//		stage.show();
	}
	
	public void back(MouseEvent e) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Main.fxml"));
		stage = (Stage) ((Node)e.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
}
