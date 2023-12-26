module com.refactoredcodes {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.refactoredcodes to javafx.fxml;
    exports com.refactoredcodes;
}