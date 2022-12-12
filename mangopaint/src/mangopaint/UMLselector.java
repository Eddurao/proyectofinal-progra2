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


public class UMLselector {
    
    lin rey;
    int sex,sey,wide,putin,corrido,enterrado;
    byte selec;
    int sid;
   
    int cux;
    int cuy;
    int cuxa;
    int cuya;
    
    public UMLselector(lin k){
    rey = k;
    selec = 0;
    corrido =0;
    enterrado =0;
    cux = -1;
    sid = -1;
        
    
    }
    
    /**
     * Muestra el rectangulo selector en vivo
     * @param go Graphics en donde dibujar
     */
    public void showSelector(Graphics go){
        
        if(lin.MODE != 60 && selec == 1){
            
          
    selec = 0;
    corrido =0;
    enterrado =0;
   
    sid = -1;
            
            
            
        }
        
        if(lin.MODE == 60){
        
        
         
        if(lin.MOUSESTATE == 2 && selec == 1){corrido = lin.ux - lin.cx; enterrado = lin.uy - lin.cy ;
        if(cux != -1){ (rey.umlCBH.cboxAL.get(sid)).correCB(corrido, enterrado, cux, cuy, cuxa, cuya);             }
        
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
          
            
               //recore y pregunta si esta dentro da true
           for(int id = 0; id < rey.umlCBH.cboxAL.size() ; id++){   // littleBig error se me olvido cambiar este array
            if((rey.umlCBH.cboxAL.get(id)).EstoyDentro(sex, sey, sex+wide, sey+putin)){sid = id;}
            //fixed littlebig error. else inadecuado.
           }
           
           System.out.println("searchedUML" + sid);
           
           if(sid != -1 ){
             cux =  (rey.umlCBH.cboxAL.get(sid)).x ;  //comparador para arrastrar
             cuy =  (rey.umlCBH.cboxAL.get(sid)).y ;
             cuxa =  (rey.umlCBH.cboxAL.get(sid)).xa ;
             cuya =  (rey.umlCBH.cboxAL.get(sid)).ya ;
                     
               System.out.println("echo");
           }else{
           
           
           
           
           }
        
        
        }
        
        
        
        
    } }
 
    
    
   
    /**
     * Elimina trazo seleccionado por el rectangulo seleccionador
     */
public void ELIMINAR(){

    if(sid != -1){
rey.umlCBH.cboxAL.remove(sid);
    }





}
    
    

      
   
 
        
        
    }//class
    
            
            
            
    
    
   
    
    
    
    
    
    
    
    

