/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seatedview;

import java.util.ArrayList;
import java.util.Iterator;
import javafx.application.Application;
import static javafx.application.Application.STYLESHEET_MODENA;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Isaac Lindahl <isaac.lindahl at https://github.com/lindahlisaac>
 */
public class SeatedView {
    private VBox startPane;
    private ArrayList startButtonList;
    private HBox startButtonPane;
    private HBox startLabelBox;
    private NewEventView nev;
    public Button newEventButton;
    
    public SeatedView(){
        createStartView();
    }
    
    private void createStartView(){
        nev = new NewEventView();
        
        startPane = new VBox(); 
        startButtonList = new ArrayList();
        startButtonPane = new HBox();
        
        //create button objects and add to arraylist of startview menu buttons
        newEventButton = new Button();
        Button useTemplateButton = new Button();
        
        startButtonList.add(newEventButton); //index 0
        startButtonList.add(useTemplateButton); // index 1
        
        startButtonList = formatStartButtons(startButtonList);
        startButtonPane.getChildren().addAll(startButtonList);
        
        newEventButton = (Button) startButtonList.get(0);
        newEventButton.setText("Create New Event");
        useTemplateButton = (Button) startButtonList.get(1);
        useTemplateButton.setText("Create From Template");
        
        startLabelBox = createStartLabelBox();
        
        this.startPane.getChildren().addAll(startLabelBox, startButtonPane);
        
        getStartPane();
    }
    
    private ArrayList formatStartButtons(ArrayList buttons){
        ArrayList temp = new ArrayList();
        for (Iterator it = buttons.iterator(); it.hasNext();) {
            Button btn = (Button) it.next();
            btn.setPrefSize(200,50);
            btn.setStyle(STYLESHEET_MODENA);
            
            temp.add(btn);
        }
        
        return temp;
    }
    
    public VBox getStartPane() {
        return startPane;
    }
    
    private HBox createStartLabelBox() {
        HBox startBox = new HBox();
        startBox.setAlignment(Pos.CENTER);
        startBox.setSpacing(20);
        
        Label welcomeLabel = new Label("Welcome to Seated!");
        welcomeLabel.setStyle("-fx-font-size: 36px;-fx-font-weight: bold;-fx-effect: dropshadow( gaussian , rgba(255,255,255,0.5) , 0,0,0,1 );");
        
        startBox.getChildren().add(welcomeLabel);
        
        return startBox;
    }

    public Pane getNewEventPane(){
        return nev.getSplitPane();
    }

   
    
}
