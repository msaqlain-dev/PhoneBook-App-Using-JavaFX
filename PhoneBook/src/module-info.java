module PhoneBook {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	requires javafx.base;
	requires javafx.web;
	
	opens application to javafx.graphics, javafx.fxml;
}
