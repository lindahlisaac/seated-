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
import seatedmodel.SeatedModel;
import seatedview.SeatedView;

/**
 *
 * @author Isaac Lindahl <isaac.lindahl at https://github.com/lindahlisaac>
 */
public class Seated extends Application {
    private StackPane root;
    private Scene scene;
    @Override
    public void start(Stage primaryStage) {
        
        SeatedView sv = new SeatedView();
        
        SeatedModel sm = new SeatedModel();
        
        Button btn = new Button();
        
        root = new StackPane();
        root.getChildren().add(sv.getStartPane());
        
        scene = new Scene(root, 500, 400);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
        sv.newEventButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                root.getChildren().clear();
                root.getChildren().clear();
                                
                root.setPrefSize(800,600);
                root.getChildren().add(sv.getNewEventPane());
                scene = new Scene(new VBox(root),800,600);
            }
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
