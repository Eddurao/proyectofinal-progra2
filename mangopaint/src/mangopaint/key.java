/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mangopaint;

import com.sun.xml.internal.ws.util.StringUtils;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;

/**
 * clase escuchadora de teclado para ingresar caracteres al texto de las cajas de clase UML
 * @author eparr
 */
public class key extends JPanel implements ActionListener, KeyListener{ // ActionListener,
    
    public static int alt;
    
    public static String word;
    
    public JF F;
    
    public key(){
    
    // frame.addKeyListener(this);
    
    
    
    alt = 0;
    
    
    }

    void setJF(JF fri){ F = fri; }

    @Override
    public void keyTyped(KeyEvent ea) {
            
        System.out.println("wiiii");
          
       
       
      //  F.repaint();
     //   System.out.println(e.getKeyChar());
      //  System.out.println(e.getExtendedKeyCode());
       
       // if(e.getKeyChar() == KeyEvent.VK_B){ System.out.println("asdnfasdñoif"); } 
        System.out.println( "noting" );
    }
// AQUI SE HACE USO DEL PATRON OBSERVER
    @Override
    public void keyPressed(KeyEvent ea) {
        
        System.out.println("ENTER ES: " + ea.getKeyCode());
        System.out.println(ea.getKeyChar());
        
       if(ea.getKeyCode() == 10){F.hj.umlCBH.TextAddLine(); System.out.println("ADDED LINE"); F.repaint(); return;} 
       if(ea.getKeyCode() == 8){ F.hj.umlCBH.QuitChar(); System.out.println("QUITED LINE"); F.repaint(); return; }
      
       if( 32 < ea.getKeyChar() && ea.getKeyChar() < 128 && lin.MODE == 15 ){ F.hj.umlCBH.TextEdit( ea.getKeyChar()  );}
       F.repaint();
       
        
        
        
        
        
        
        
        
        
        if(ea.getKeyCode() == KeyEvent.VK_UP){ F.hj.umlCBH.trytochangerow(true); } 
        if(ea.getKeyCode() == KeyEvent.VK_DOWN){ F.hj.umlCBH.trytochangerow(false); } 
        
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("NUUUUU");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("WUJU");
    }
    
    
    
    
}
