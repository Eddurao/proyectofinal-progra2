/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mangopaint;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author eparr
 */
public class Welcome extends JFrame{
   
    ImageIcon i;
    JPanel cp;
    public Welcome(){
         super(); 
      
      // getContentPane().setBackground( Color.white);
        setVisible(true);
       this.setLocation(200,20);
       // setDefaultCloseOperation(3);
        setTitle("MangoPaint");
        welcomepanel wp = new welcomepanel();
        wp.setBackground(Color.red);
        add(wp);
      
       i = new ImageIcon("src/img/mango22.png");   //drawea fondo
       
        
        this.setIconImage( i.getImage() );
     
        
       
    
        
    
    
    
   
     
     setSize(700,650);
     
     
    }
        
        
    
   
    
       

   
     
        
        

}


class welcomepanel extends JPanel {
    
    
    
    public welcomepanel(){
       
        
         setBackground(Color.GREEN); 
        
        
        
       
        
        
    }
    
    
    @Override
    public void paintComponent(Graphics g){
      g.setColor(Color.WHITE);
        g.fillRect(0, 0, 1000, 1000);
         ImageIcon i = new ImageIcon("src/img/mangologo.png");
      ImageIcon   i2 = new ImageIcon("src/img/destrakllina.jpg");
      ImageIcon wel1 = new ImageIcon("src/img/wel1.png");
        
        
        
        g.drawImage(i.getImage(),0,30,200,200,this);   //funciono
        
        g.drawImage(i2.getImage(), 200, 200,500,500, this);
        
        g.drawImage(wel1.getImage(),300 ,20 , this);
        
       g.setColor(Color.blue);
       g.drawString("Dibujo, Diagramas, Arte" , 10 , 340 );
       g.drawString("Animaciones, UML" , 10 , 355 );
       g.drawString("Incluso Estudiar" , 10 , 370 );
       g.drawString("no hay nada que este " , 10 , 385 );
       g.drawString("programa no logre hacer" , 10 , 400 );
       g.drawString("PROFESOR A CARGO:" , 10 , 450 );
       g.drawString("GEOFFREY JEAN-PIERRE" , 10 , 465 );
       g.drawString("Proximamente Quizas hayan mas actualizaciones" , 10 , 500 );
       g.drawString("Es muy interesante lo que se puede lograr con java" , 10 , 520 );
       g.drawString("MangoPaint Official Release v1.0.0        -Dedicated to Dear N.J.J.E" , 10 , 600 );
    }
    
    
    
    
    
   
    
    
}