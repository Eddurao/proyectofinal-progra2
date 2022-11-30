/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mangopaint;

import javax.swing.*;
import java.awt.*;
import static java.awt.Color.*;
/**
 *
 * @author eparr
 */
public class pan extends JPanel{
    
    public pan(){
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        this.setBackground(BLUE);
        
        
        spa spa1 = new spa();
        spa spa2 = new spa();  //Creacion de Secondary PAnels
        
       
        
        add(spa1);   //Panel Secundario 1
        spa1.add(new JButton("transformation") );
        spa1.add(new JButton("center"));
        
        
        
        add(spa2);   //Panel secundario 2
        spa2.add(new JButton("would yu") );
        spa2.add(new JButton("shake"));
        spa2.add(new JButton("a poor sinors hand ?"));
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


class spa extends JPanel {
    
    public spa(){
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        
        
        
        
    }
    
    
    
    
    
    
    
}