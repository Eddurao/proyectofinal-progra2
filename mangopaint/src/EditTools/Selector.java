/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EditTools;

import DrawKeepers.DrawData;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.io.Serializable;
import javax.swing.JPanel;
import mangopaint.lin;

/**
 * Selector rectangular para trazos (DrawData)
 * @author eparr
 */


public class Selector implements Serializable{
    
    lin rey;
    int sex,sey,wide,putin,corrido,enterrado;
    byte selec;
    int sid;
    DrawData sdraw;
    public Selector(lin k){
    rey = k;
    selec = 0;
    corrido =0;
    enterrado =0;
    sdraw = null;
    sid = -1;
    
    
    }
    
    /**
     * Dibuja el rectangulo del selector en pantalla
     * se activa preferentemente con repaints en un mouseDragg
     * @param go Graphics donde se mostrara el rectangulo del selector 
     */
    public void showSelector(Graphics go){
        
        if(lin.MODE != 60 && selec == 1){
            
          
    selec = 0;
    corrido =0;
    enterrado =0;
    sdraw = null;
    sid = -1;
            
            
            
        }
        
        if(lin.MODE == 60){
        
        
         
        if(lin.MOUSESTATE == 2 && selec == 1){corrido = lin.ux - lin.cx; enterrado = lin.uy - lin.cy ;
        if(sdraw != null){ (rey.MASTERddarray.get(sid)).correcord(corrido, enterrado , sdraw);             }
        
        }
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
        
        if(lin.MOUSESTATE == 3 && selec == 1){
          
            
            
           for(int id = 0; id < rey.MASTERddarray.size() ; id++){
            if((rey.MASTERddarray.get(id)).estoyDentro(sex, sey, sex+wide, sey+putin)){sid = id;}
            //fixed littlebig error. else inadecuado.
           }
            
           if(sid != -1 ){
             sdraw = (rey.MASTERddarray.get(sid)).clone();    //comparador para arrastrar
                 
               System.out.println("echo");
           }else{
           
           
           
           
           }
        
        
        }
        
        
        
        
    } }
 
    
    
   
   /**
    * Elimina el DataDraw dentro del rectangulo
    */ 
public void ELIMINAR(){

    if(sid != -1){
rey.MASTERddarray.remove(sid);
    }





}
    
    

      
   
 
        
        
    }//class
    
            
            
            
    
    
   
    
    
    
    
    
    
    
    

