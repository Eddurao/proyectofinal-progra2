/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mangopaint;


import javax.swing.*;
import java.awt.*;
import static java.awt.BorderLayout.WEST;
import static java.awt.Color.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author eparr
 */


public class pan extends JPanel implements ActionListener{
    
    JF VIP;
    
    JButton Buml;
    JButton Bpint;
    JButton Bborr;
    JButton Bselc;
    JButton Bmath;
    JButton Brule;
            
    spa spaUML;     //PANELES SECUNDARIOS APARECIBLES
    spa spaPINT;
    spa spaBORR;
    spa spaSELC;
    spa spaMATH;
    spa spaRULE;
    
    public pan(JF jf){
        VIP = jf;
        FlowLayout flow = new FlowLayout(3);
        this.setLayout(flow);                      //CONFIG PRINCIPANEL
        this.setBackground(ORANGE);
        
        
        Buml = new JButton("UML"); Buml.setBackground(CYAN);
        Bpint = new JButton("Pint");   Bpint.setBackground(YELLOW);   //INIC JBUTTONS INIMENU
        Bborr = new JButton("Borr");   Bborr.setBackground(GRAY);
        Bselc = new JButton("Selc");   Bselc.setBackground(WHITE);
        Bmath = new JButton("Math");   Bmath.setBackground(BLUE);
        Brule = new JButton("Rule");   Brule.setBackground(GREEN);
        
        Buml.addActionListener(this);
        Bpint.addActionListener(this);
        Bborr.addActionListener(this);
        Bselc.addActionListener(this);
        Bmath.addActionListener(this);
        Brule.addActionListener(this);
        
        
        
        
        
        
        
        
        
        
        
        
        spa spaM = new spa();//PAN 6
        spa spa1 = new spa(); //PAN MENU     
        spaUML = new spa();     //PANELES SECUNDARIOS APARECIBLES
        spaPINT = new spa();
        spaBORR = new spa();
        spaSELC = new spa();
        spaMATH = new spa();
        spaRULE = new spa();
        
        
        spaUML.setLayout(new FlowLayout());
        spaUML.add(new JButton("VEANME"));
        spaUML.add(new JButton("VEANME"));
        spaUML.add(new JButton("VEANME"));
        spaUML.add(new JButton("VEANME"));



//Creacion de Secondary PAnels
        
        
       
        
       
        spa1.setSize(40,50);
        flow.setHgap(20);
        add(spa1);   //Panel Secundario 1   //Si dan problemas dar vuelta el add !
        spa1.add(new JButton("transformation") );
        spa1.add(new JButton("center"));
        
        
        add(spaM);
        spaM.setLayout(new GridLayout(3,2));
        spaM.add(Buml);
        spaM.add(Bpint);
        spaM.add(Bborr);
        spaM.add(Bselc);
        spaM.add(Bmath);
        spaM.add(Brule);
        
        
        
        //add(spa2);   //Panel secundario 2
        //spa2.add(new JButton("would yu") );
        //spa2.add(new JButton("shake"));
        //spa2.add(new JButton("a poor sinors hand ?"));
        
        
        
        
        
        
        
        
        
        
        
 
    }
    
    
    
    
    
    
    
    
     public  void actionPerformed(ActionEvent e){
         
         remove(spaUML);
         remove(spaPINT);
         remove(spaBORR);
         remove(spaSELC);
         remove(spaMATH);
         remove(spaRULE);
         VIP.repaint();
         
         if(e.getSource() == Buml){ add(spaUML); System.out.println("fff"); VIP.revalidate();}
         
         
         
         
         
         
         
         
         
     }
    
    
    
    
    
    
}


class spa extends JPanel {
    
    public spa(){
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        
        
        
        
    }
    
    
    
    
    
    
    
}