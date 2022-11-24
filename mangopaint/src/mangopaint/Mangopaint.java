/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mangopaint;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author eparr
 */
public class Mangopaint {

    /**
     * @param args the command line arguments
     */
   
       
        
public static void main(String[] args){
    JFrame frame = new JFrame( "Run Panel" );
    frame.setDefaultCloseOperation(3);

    Panel  panel = new Panel();
    frame.add( panel );

    frame.pack();
    frame.setVisible( true );
  
    }
    
}
