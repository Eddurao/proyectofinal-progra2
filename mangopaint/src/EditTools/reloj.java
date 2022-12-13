/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EditTools;

import javax.swing.JFrame;
import mangopaint.JF;

/**
 *
 * @author eparr
 */
public class reloj extends JFrame implements java.awt.event.ActionListener {

    JF jo;
public void iniciaReloj(JF jo) {
   long retrazo = 10; // milisegundos entre cada evento
   javax.swing.Timer reloj = new javax.swing.Timer((int) retrazo, this);
   reloj.start(); this.jo = jo;
}
@Override
public void actionPerformed(java.awt.event.ActionEvent eventoDeReloj) {
    jo.repaint();
    
   /// Thread.sleep(10);   Este ya no se requiere!!!
}

}
