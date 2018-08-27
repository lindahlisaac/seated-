/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seatedmodel;

import event.SeatedEvent;
import eventio.EventIO;
import eventlaunch.EventLaunch;
import movement.Movement;
import table.Table;

/**
 *
 * @author Isaac Lindahl <isaac.lindahl at https://github.com/lindahlisaac>
 */
public class SeatedModel {
    
    public SeatedModel(){
        SeatedEvent se = new SeatedEvent();
        EventIO eio = new EventIO();
        EventLaunch el = new EventLaunch();
        Movement move = new Movement(); 
        Table table = new Table();
    }
    
}
