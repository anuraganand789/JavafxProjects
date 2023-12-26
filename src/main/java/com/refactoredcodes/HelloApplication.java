package com.refactoredcodes;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage){
        final Circle circle = new Circle();
        final Group group = new Group(circle);

        final Scene scene = new Scene(group, 100, 100);

        circle.centerXProperty().bind(scene.widthProperty().divide(2));
        circle.centerYProperty().bind(scene.heightProperty().divide(2));
        circle.radiusProperty().bind(Bindings.min(scene.widthProperty(), scene.heightProperty()).divide(2));

        stage.setTitle("Bindings");
        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}