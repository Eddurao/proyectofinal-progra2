/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mangopaint;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
/**
 *
 * @author eparr
 */
public class JF extends JFrame {
    
    pan pc;
    lin hj;       key kine;      lin h2; lin h3;

   // ArrayList<lin> MMM = new ArrayList<>();
    public JF(){
        super();
        setVisible(true);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(3);
        setTitle("MangoPaint");
        
         ImageIcon i = new ImageIcon("src/img/mango22.png");   //drawea fondo
        
        
        
        this.setIconImage( i.getImage() );
        
        kine = new key(); kine.setJF(this);
      
          
        h2 = new lin(); h3 = new lin();
        
        pc = new pan(this); 
        hj = new lin();                             
        add(pc ,BorderLayout.NORTH);        
        add(hj ,BorderLayout.CENTER);          
        hj.setIgnoreRepaint(false);       
        
        
     addKeyListener(kine);
     pc.addKeyListener(kine);
        
        //TEST ZONE TEST ZONE TEST ZONE TEST ZONE TEST ZONE TEST ZONE TEST ZONE ini
        
       
        
   
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //TEST ZONE TEST ZONE TEST ZONE TEST ZONE TEST ZONE TEST ZONE TEST ZONE end
        
        
        
        
        setSize(1200,600); // setSize va al final porque ponerlo al principi causa leves errores
        
        
        
        //Aqui no funcionara el hj.setUpDrawingGraphics(); almenos si te guarda bien los datos draw
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}