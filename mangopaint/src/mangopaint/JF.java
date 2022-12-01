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
    
    pan pc;
    lin hj;
    public JF(){
        super();
        setVisible(true);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(3);
        
        pc = new pan(this);
        hj = new lin();
        add(pc ,BorderLayout.NORTH);
        add(hj ,BorderLayout.CENTER);
        hj.setIgnoreRepaint(false);
        
        
        setSize(1200,600); // setSize va al final porque ponerlo al principi causa leves errores
    }
    
    
}