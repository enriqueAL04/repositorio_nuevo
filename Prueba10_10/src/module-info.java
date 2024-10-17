module Prueba10_10 {
	requires javafx.controls;
	requires javafx.graphics;

	opens application to javafx.graphics, javafx.fxml;
	exports com.carballeira.aplicacion.view;
}
