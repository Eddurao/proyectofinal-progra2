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
    
    JButton rojo;
    JButton naranjo;
    JButton amarillo;
    JButton verde;
    JButton azul;
    JButton morado;
            
    JButton negro;       
    JButton gris;       
    JButton blanco;       
    JButton griso;       
    JButton grisc;       
    JButton rosado;       
            
            
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
        
        rojo = new JButton(" "); rojo.setBackground(red);
        naranjo = new JButton(" "); naranjo.setBackground(orange);
        amarillo = new JButton(" "); amarillo.setBackground(YELLOW);
        verde = new JButton(" "); verde.setBackground(GREEN);
        azul = new JButton(" "); azul.setBackground(BLUE);
        morado = new JButton(" "); morado.setBackground(magenta);
        
        negro = new JButton(" "); negro.setBackground(black);
        gris = new JButton(" "); gris.setBackground(gray);
        blanco = new JButton(" "); blanco.setBackground(white);
        griso = new JButton(" "); griso.setBackground(darkGray);
        grisc = new JButton(" "); grisc.setBackground(lightGray);
        rosado = new JButton(" "); rosado.setBackground(pink);
        
        
        Buml.addActionListener(this);
        Bpint.addActionListener(this);
        Bborr.addActionListener(this);
        Bselc.addActionListener(this);
        Bmath.addActionListener(this);
        Brule.addActionListener(this);
        
        rojo.addActionListener(this);
        naranjo.addActionListener(this);
        amarillo.addActionListener(this);
        verde.addActionListener(this);
        azul.addActionListener(this);
        morado.addActionListener(this);
        negro.addActionListener(this);
        blanco.addActionListener(this);
        grisc.addActionListener(this);
        griso.addActionListener(this);
        rosado.addActionListener(this);
        gris.addActionListener(this);
        
        
        
        
        
        
        
        
        
        
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
        
        spaPINT.setBackground(BLUE);
        spaPINT.setLayout(new FlowLayout(3));
        FlowLayout fint = (FlowLayout) spaPINT.getLayout();
        fint.setHgap(20);
        spa P1 = new spa();
        spaPINT.add(P1);
        P1.add(rojo);
        P1.add(new JButton("petroleo"));
        P1.add(new JButton("chile"));
        
        spa P2 = new spa();
        P2.setAlignmentX(2f);
        P2.setAlignmentY(3);
        spaPINT.add(P2);
        P2.add(new JButton("persom"));
        P2.add(new JButton("perrito"));
        tlis P3 = new tlis(2,1);
        spaPINT.add(P3);               //tenemos un grave ERROR !!! REPAINT EN EL LIENZO
        P3.add(new JButton("hello"));
        P3.add(new JButton("no"));
        //P3.add(new JButton("hello"));
        
        
        tlis paletaColor = new tlis(2,6);
        paletaColor.add(rojo);
        paletaColor.add(naranjo);
        paletaColor.add(amarillo);
        paletaColor.add(verde);
        paletaColor.add(azul);
        paletaColor.add(morado);
        paletaColor.add(negro);
        paletaColor.add(griso);
        paletaColor.add(gris);
        paletaColor.add(grisc);
        paletaColor.add(blanco);
        paletaColor.add(rosado);
        spaPINT.add(paletaColor);
        
       
        
        
        
        
        //spaPINT.add(new JButton());
       // spaPINT.add(new JButton());     
        



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
         
         if(e.getSource() == Buml || e.getSource() == Bpint || e.getSource() == Bborr || e.getSource() == Bselc || 
                 e.getSource() == Bmath || e.getSource() == Brule ){
         remove(spaUML);
         remove(spaPINT);
         remove(spaBORR);
         remove(spaSELC);
         remove(spaMATH);
         remove(spaRULE);
         repaint();
     }
         if(e.getSource() == Buml){ add(spaUML); System.out.println("fff"); revalidate();}
         if(e.getSource() == Bpint){ add(spaPINT); System.out.println("faf"); revalidate();}
         if(e.getSource() == Bborr){ add(spaBORR); System.out.println("fff"); revalidate();}
         if(e.getSource() == Bselc){ add(spaSELC); System.out.println("fff"); revalidate();}
         if(e.getSource() == Bmath){ add(spaMATH); System.out.println("fff"); revalidate();}
         if(e.getSource() == Brule){ add(spaRULE); System.out.println("fff"); revalidate();}
         
         if(e.getSource() == rojo){VIP.hj.tarro = Color.red;}
         if(e.getSource() == naranjo){VIP.hj.tarro = Color.orange;}
         if(e.getSource() == amarillo){VIP.hj.tarro = Color.yellow;}
         if(e.getSource() == verde){VIP.hj.tarro = Color.green;}
         if(e.getSource() == azul){VIP.hj.tarro = Color.blue;}
         if(e.getSource() == morado){VIP.hj.tarro = Color.magenta;}
         if(e.getSource() == negro){VIP.hj.tarro = Color.black;}
         if(e.getSource() == griso){VIP.hj.tarro = Color.darkGray;}
         if(e.getSource() == gris){VIP.hj.tarro = Color.gray;}
         if(e.getSource() == grisc){VIP.hj.tarro = Color.lightGray;}
         if(e.getSource() == blanco){VIP.hj.tarro = Color.white;}
         if(e.getSource() == rosado){VIP.hj.tarro = Color.pink;}
         
         
         
         
         
         
         
         
     }
    
    
    
    
    
    
}


class spa extends JPanel {
    
    JButton JB;
    
    public spa(){
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        
        
        
        
    }
    
    
    public void setButton(JButton TT){
        
        this.JB = TT;
        JB.setBounds(600,5,20,20);
        add(JB);
    }
    
    
    
    
}

class tlis extends JPanel{

   public tlis(int FILA,int COLU){
     
    setLayout(new GridLayout(FILA,COLU));



   }
}

class fvi extends JFrame{
    
    public fvi(){
        setVisible(true);
        
        
    }
    
    
    
}