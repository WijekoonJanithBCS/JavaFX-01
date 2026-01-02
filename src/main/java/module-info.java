module ik.ikman.oop.javafx01 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ik.ikman.oop.javafx01 to javafx.fxml;
    exports ik.ikman.oop.javafx01;
}