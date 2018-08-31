/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seatedcontroller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import seated.Seated;
import seatedmodel.SeatedModel;
import seatedview.SeatedView;

/**
 *
 * @author Isaac Lindahl <isaac.lindahl at https://github.com/lindahlisaac>
 */
public class SeatedController {
    private SeatedModel model;
    private SeatedView view;
    private Seated main;
    public SeatedController(SeatedModel model, SeatedView view){
        this.model = model;
        this.view = view;
        
        activateListeners();
    }
    
    public void setMain(Seated main){
        this.main = main;
    }
    
    private void activateListeners(){
        view.newEventButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                main.getRootPane().getChildren().clear();                               
                main.getRootPane().setPrefSize(800,600);
                main.getRootPane().getChildren().add(view.getNewEventPane());
            }
        });
    }
    
}
