/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mangopaint;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author eparr
 */
public class DrawData {
    
    ArrayList< Short > RECx1;
    ArrayList< Short > RECy1;
    ArrayList< Short > RECx2;
    ArrayList< Short > RECy2;
    Color tinta;
    
    
    public DrawData (){
        
        RECx1 = new ArrayList<>();
        RECy1 = new ArrayList<>();
        RECx2 = new ArrayList<>();
        RECy2 = new ArrayList<>();
        
        
        
        
        
    }
    
    
    public void RECcord(int x1, int y1, int x2, int y2, Color color){
    
        RECx1.add((short)x1);
        RECy1.add((short)y1);
        RECx2.add((short)x2);
        RECy2.add((short)y2);
        tinta = color;
    
    }
      
    public void Paintcord(Graphics g){
        
        
        
        for(int i = 0; i<RECx1.size() ;i++){
            
            g.setColor(tinta);
            g.drawLine(RECx1.get(i), RECy1.get(i), RECx2.get(i), RECy2.get(i));
            
         
        }
        
    }  
 

    public boolean estoyDentro(int x1, int y1,int x2,int y2){
        int A = 0;
        for(int i=0 ; i<RECx1.size() ; i++){
            if( x1 < RECx1.get(i) && RECx1.get(i) < x2 ){}else{return false;}
            if( y1 < RECy1.get(i) && RECy1.get(i) < y2 ){}else{return false;}
        }
        
        return true;
       
    }
    
    public boolean tengoDentro(int x1, int y1, int x2, int y2){
        
         
        for(int i=0 ; i<RECx1.size() ; i++){
            if( x1 < RECx1.get(i) && RECx1.get(i) < x2 ){return true;}
            if( y1 < RECy1.get(i) && RECy1.get(i) < y2 ){return true;}
        }
        
        return false;
        
        
        
    }
    
    
}
