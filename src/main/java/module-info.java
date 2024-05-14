module com.empresa.javafx_sp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.j;


    opens com.empresa.javafx_sp to javafx.fxml;
    exports com.empresa.javafx_sp;
}