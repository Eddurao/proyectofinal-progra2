/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mangopaint;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author eparr
 */
public abstract class UMLarrows {
    short[] x;
    short[] y;
    short count;
    
    final int P = 10;
    public UMLarrows(){

     x = new short[10];
     y = new short[10];
     count = 0;


    }    
    
    abstract void showarrow(Graphics g);
        
        
        
    public void setPoint(int xa , int ya){
     
        if(count < 10){
        
        x[count]= (short)xa;
        y[count]= (short)ya;
            System.out.println("seted"+count);
        count++; }
    }    
    
    public void driveCurrentPoint(int an , int ya){
        if(count > 0 && count < 10){
         x[count]= (short)an;
         y[count]= (short)ya;
        }
        
    }
    
    public void deleteAllPoints(){ //ARREGLAR ERROR
        x = new short[10];
        y = new short[10];
        count = -1; 
    }
    
    public byte oneDirection(){ if(count > 0){
        byte Dir,Dir2;
        if( x[count -1] < x[count]){Dir = 2;}
        else{ Dir = 4;}
        
        if(y[count -1] < y[count]){Dir2 = 3;}
        else{Dir2 = 1;}
        
        int dex = x[count -1] - x[count]; if(dex < 0){dex = -dex;}
        int dey = y[count -1] - y[count]; if(dey < 0){dey = -dey;}
        
        if(dey < dex){return Dir;}
        else{return Dir2;}
        
        
    
    
        
    
    
    } return 0; }
    
    public short penPointx(int X){
        if(count > 0){return x[count -1];}
        return (short)X;
    }
    
    public short penPointy(int Y){
        if(count > 0){return y[count -1];}
        return (short)Y;
    }
    
    public void restaUNO(){
        
        count--;
        
    }
    
    
    
    
}//general

class aLIN extends UMLarrows{
    
    public aLIN(){
        super();
    
    }

    @Override
    void showarrow(Graphics g) {
       if(count > 0 && count < 9 ){
           for(int i = 0; i < count  ; i++){ // ERRRRORRRR
               
               if(x[i+1] != 0){
               g.drawLine(x[i], y[i], x[i+1], y[i+1]);
               g.drawLine(x[i]+1, y[i]+1, x[i+1]+1, y[i+1]+1);
               
               
               }
           }
           
       }
        
       short xo =       x[count];
       short ya =      y[count];       
        System.out.println("ONE DIRECTION"+oneDirection());
       if(oneDirection() == 1){
           g.drawLine(xo, ya, xo+P, ya+P);
           g.drawLine(xo+1, ya+1, xo+P+1, ya+P+1);
           g.drawLine(xo, ya, xo-P, ya+P);
           g.drawLine(xo+1, ya+1, xo-P+1, ya+P+1);
           g.drawLine(xo-P, ya+P, xo+P, ya+P);
           g.drawLine(xo-P+1, ya+P+1, xo+P+1, ya+P+1);
           
           g.setColor(Color.white);
           g.drawLine(xo, ya+2, xo, ya+P);
           g.drawLine(xo+1, ya+1+2, xo+1, ya+P+1);}
           g.setColor(Color.black);
           
           
           
       
       if(oneDirection() == 2){
           g.drawLine(xo, ya, xo-P, ya-P);
           g.drawLine(xo+1, ya+1, xo-P+1, ya-P+1);
           g.drawLine(xo, ya, xo-P, ya+P);
           g.drawLine(xo+1, ya+1, xo-P+1, ya+P+1);
           g.drawLine(xo-P, ya-P, xo-P, ya+P);
           g.drawLine(xo-P+1, ya-P+1, xo-P+1, ya+P+1);
       }
        if(oneDirection() == 3){
           g.drawLine(xo, ya, xo+P, ya-P);
           g.drawLine(xo+1, ya+1, xo+P+1, ya-P+1);
           g.drawLine(xo, ya, xo-P, ya-P);
           g.drawLine(xo+1, ya+1, xo-P+1, ya-P+1);
           g.drawLine(xo-P, ya-P, xo+P, ya-P);
           g.drawLine(xo-P+1, ya-P+1, xo+P+1, ya-P+1);
       }
       if(oneDirection() == 4){
           g.drawLine(xo, ya, xo+P, ya-P);
           g.drawLine(xo+1, ya+1, xo+P+1, ya-P+1);
           g.drawLine(xo, ya, xo+P, ya+P);
           g.drawLine(xo+1, ya+1, xo+P+1, ya+P+1);
           g.drawLine(xo+P, ya-P, xo+P, ya+P);
           g.drawLine(xo+P+1, ya-P+1, xo+P+1, ya+P+1);
       }
    
    
    }
   
    
    
    
    
    
} //aLIN






// aLIN, aDER, aHER, aCIR
// aIMP, aASO, aAGR, aCOM