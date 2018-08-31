/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seated;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import seatedcontroller.SeatedController;
import seatedmodel.SeatedModel;
import seatedview.SeatedView;

/**
 *
 * @author Isaac Lindahl <isaac.lindahl at https://github.com/lindahlisaac>
 */
public class Seated extends Application {
    public StackPane root;
    private Scene scene;
    private SeatedModel model;
    private SeatedView view;
    private SeatedController controller;
    
    @Override
    public void start(Stage primaryStage) {
        model = new SeatedModel();
        view = new SeatedView();
        controller = new SeatedController(model, view);
        
        Button btn = new Button();
        
        root = new StackPane();
        root.getChildren().add(view.getStartPane());
        
        scene = new Scene(root, 800, 600);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();

        controller.setMain(this);
    }
    
    public StackPane getRootPane(){
        return root;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
