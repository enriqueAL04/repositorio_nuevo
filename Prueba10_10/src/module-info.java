module Prueba10_10 {
	requires javafx.controls;
	requires javafx.graphics;
	requires java.xml;
	
	opens application to javafx.graphics, javafx.fxml;
	exports com.carballeira.aplicacion.view;
}
