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
import java.awt.event.MouseMotionListener;
import javax.swing.JPanel;

/**
 *
 * @author eparr
 */


public class Selector {
    
    lin rey;
    int sex,sey,wide,putin,corrido,enterrado;
    byte selec;
    public Selector(lin k){
    rey = k;
    selec = 0;
    corrido =0;
    enterrado =0;
    }
    
    public void showSelector(Graphics go){if(lin.MODE == 60){
         
        if(lin.MOUSESTATE == 2 && selec == 1){corrido = lin.ux - lin.cx; enterrado = lin.uy - lin.cy ;}
        if(lin.MOUSESTATE == 3 && selec == 1){sex += corrido; sey += enterrado; corrido = 0; enterrado = 0;}
        if(lin.MOUSESTATE == 1 || lin.MOUSESTATE == 2 && selec == 0){
           corrido = 0;  enterrado = 0;
        go.drawRect(lin.cx, lin.cy,lin.ux-lin.cx, lin.uy-lin.cy); go.drawRect(lin.cx+1, lin.cy+1,lin.ux-lin.cx, lin.uy-lin.cy);
    
        }
        
        if(lin.MOUSESTATE == 3 && selec == 0){
            sex = lin.cx;
            sey = lin.cy;
            wide = lin.ux - sex;
            putin = lin.uy - sey;
            selec = 1;    
        }
    
        if(selec == 1){
        go.drawRect(sex + corrido , sey + enterrado,wide, putin); go.drawRect(sex+1+corrido, sey+1+enterrado,wide+1, putin+1);
        }
        
        
        
        
    }}
 
    
    
   
    

   
      
   
 
        
        
    }//class
    
            
            
            
    
    
   
    
    
    
    
    
    
    
    

