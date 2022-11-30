/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mangopaint;


import javax.swing.*;
import java.awt.*;
import static java.awt.BorderLayout.WEST;
import static java.awt.Color.*;
/**
 *
 * @author eparr
 */
public class pan extends JPanel{
    
    public pan(){
        FlowLayout flow = new FlowLayout(3);
        this.setLayout(flow);
        this.setBackground(BLUE);
        
        
        spa spa1 = new spa();
        spa spa2 = new spa();  //Creacion de Secondary PAnels
        spa spaM = new spa();
       
        
       
        spa1.setSize(40,50);
        flow.setHgap(20);
        add(spa1);   //Panel Secundario 1   //Si dan problemas dar vuelta el add !
        spa1.add(new JButton("transformation") );
        spa1.add(new JButton("center"));
        
        
        add(spaM);
        spaM.setLayout(new GridLayout(3,2));
        spaM.add(new JButton("UML"));
        spaM.add(new JButton("Pint"));
        spaM.add(new JButton("Borr"));
        spaM.add(new JButton("Selc"));
        spaM.add(new JButton("Math"));
        spaM.add(new JButton("Rule"));
        
        
        
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