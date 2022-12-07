/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mangopaint;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;

/**
 *
 * @author eparr
 */


public class Selector {
    
    lin REY;
    Graphics gg;
    int X1;
    int Y1;
    int X2;
    int Y2;

    
    
    public Selector(lin principal) {
        
          
        REY = principal;
        gg = REY.getGraphics();
       
      
        
        
    }
    
    
    private void setUpDrawingGraphics()
  {
   gg = REY.getGraphics();
  }
      
 
      
   
      
    public void mousePressed( MouseEvent e ){
        X1 = e.getX();
        Y1 = e.getY();
        System.out.println("fjasdkjlñfjdaskljaklsdf");
       setUpDrawingGraphics();
    }

    public void mouseDragged( MouseEvent e ){
        X2 = e.getX();
        Y2 = e.getY();
        gg.setColor(Color.black);
        gg.drawRect(X1, Y1, X2, Y2);
        
        
        
        
        
    }
    
            
            
            
    
    public void mouseReleased( MouseEvent e ){
    
    
    
    
    }
    
    
    
    
   
    
    
    
    
    
    
    
    

}