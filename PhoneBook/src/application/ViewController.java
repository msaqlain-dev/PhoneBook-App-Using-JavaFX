package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class ViewController implements Initializable {
	
	@FXML
	private TableView<Contact> table;

    @FXML
    private TableColumn<Contact, String> name;

    @FXML
    private TableColumn<Contact, String> phone;
    
    @FXML
    private TableColumn<Contact, String> email;
    
    ObservableList<Contact> data = FXCollections.observableArrayList(
		    new Contact("Saqlain", "03153539152", "saq@gmail.com"),
		    new Contact("Sarmad", "0301", "abc"),
		    new Contact("Ethan", "Williams", "ethan.williams@example.com")
	);

    public void initialize(URL url, ResourceBundle resourcebundle) {
		name.setCellValueFactory(new PropertyValueFactory<Contact,String> ("name"));
		phone.setCellValueFactory(new PropertyValueFactory<Contact,String> ("phone"));
		email.setCellValueFactory(new PropertyValueFactory<Contact,String> ("email"));
    
		table.setItems(data);
    }
    
}
