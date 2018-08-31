/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seatedview;

import java.util.ArrayList;
import javafx.scene.control.ListView;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 *
 * @author Isaac Lindahl <isaac.lindahl at https://github.com/lindahlisaac>
 * 
 * 
 * 
 * 
 */
public class NewEventView {
    private Pane sp;
    private ArrayList layout;
    private VBox leftBox;
    public NewEventView(){
        sp = new Pane(); //root container
        buildLayout();
        sp.getChildren().addAll(getLayout());
    }
    
    public NewEventView(ArrayList layout){
        sp = new Pane();
        this.layout = layout;
    }
    
    private void buildLayout(){
        leftBox = new VBox();
        ListView listView = new ListView();
        
        listView.getItems().add("Hello");
        leftBox.getChildren().add(listView);
    }
    
    private VBox getLayout(){
        return leftBox;
    }
    
    public Pane getSplitPane(){
        return this.sp;
    }
    
}
