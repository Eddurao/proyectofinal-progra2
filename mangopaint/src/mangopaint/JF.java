/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mangopaint;

import javax.swing.*;
import java.awt.*;
/**
 *
 * @author eparr
 */
public class JF extends JFrame {
    
    public JF(){
        super();
        setVisible(true);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(3);
        
        add(new pan(),BorderLayout.NORTH);
        add(new lin(),BorderLayout.CENTER);
        
        
        setSize(1200,600); // setSize va al final porque ponerlo al principi causa leves errores
    }
    
    
}
