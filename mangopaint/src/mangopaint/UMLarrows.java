/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mangopaint;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

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
        
        
        
    public void setPoint(int xa , int ya){  //a las 9 se arruina
     
        if(count < 10){
        
        x[count]= (short)xa;
        y[count]= (short)ya;
            System.out.println("seted"+count);
        count++; }else{count = 0;}
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

class aLIN extends UMLarrows{  //LIN LIN LIN LIN LIN LIN LIN LIN LIN LIN LIN LIN 
    
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
   
    
    
    
    
    
} //aLIN LIN LIN LIN LIN LIN LIN LIN LIN LIN LIN LIN LIN 







class aDEP extends UMLarrows{  // O.K
    
    public aDEP(){
        super();
    
    }

    @Override
    void showarrow(Graphics g) {
        
        
        Graphics2D g2d = (Graphics2D)g;
        
        
      
           float guiones[] = {20,15};
           BasicStroke BASA = (BasicStroke)g2d.getStroke();
           
           g2d.setStroke(new BasicStroke(2,BasicStroke.CAP_BUTT,BasicStroke.JOIN_ROUND,0,guiones,0));
           
       
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
           //g.drawLine(xo-P, ya+P, xo+P, ya+P);
           //g.drawLine(xo-P+1, ya+P+1, xo+P+1, ya+P+1);
       }   
                    
           
           
       
       if(oneDirection() == 2){
           g.drawLine(xo, ya, xo-P, ya-P);
           g.drawLine(xo+1, ya+1, xo-P+1, ya-P+1);
           g.drawLine(xo, ya, xo-P, ya+P);
           g.drawLine(xo+1, ya+1, xo-P+1, ya+P+1);
          // g.drawLine(xo-P, ya-P, xo-P, ya+P);
          // g.drawLine(xo-P+1, ya-P+1, xo-P+1, ya+P+1);
       }
        if(oneDirection() == 3){
           g.drawLine(xo, ya, xo+P, ya-P);
           g.drawLine(xo+1, ya+1, xo+P+1, ya-P+1);
           g.drawLine(xo, ya, xo-P, ya-P);
           g.drawLine(xo+1, ya+1, xo-P+1, ya-P+1);
          // g.drawLine(xo-P, ya-P, xo+P, ya-P);
         //  g.drawLine(xo-P+1, ya-P+1, xo+P+1, ya-P+1);
       }
       if(oneDirection() == 4){
           g.drawLine(xo, ya, xo+P, ya-P);
           g.drawLine(xo+1, ya+1, xo+P+1, ya-P+1);
           g.drawLine(xo, ya, xo+P, ya+P);
           g.drawLine(xo+1, ya+1, xo+P+1, ya+P+1);
          // g.drawLine(xo+P, ya-P, xo+P, ya+P);
         //  g.drawLine(xo+P+1, ya-P+1, xo+P+1, ya+P+1);
       }
    
    g2d.setStroke(BASA);
    }
   
    
    
    
    
    
} //aDEP









class aHER extends UMLarrows{  //
    
    public aHER(){
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
           g.drawLine(xo+1, ya+1+2, xo+1, ya+P+1);
       
       }
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
   
    
    
    
    
    
} //aHER










class aCIR extends UMLarrows{  //poneme el circulo
    
    public aCIR(){
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
   
    
    
    
    
    
} //aCIR




class aIMP extends UMLarrows{
    
    public aIMP(){
        super();
    
    }

    @Override
    void showarrow(Graphics g) {
        
        
        Graphics2D g2d = (Graphics2D)g;
        
        
      
           float guiones[] = {20,15};
           BasicStroke BASA = (BasicStroke)g2d.getStroke();
           
           g2d.setStroke(new BasicStroke(2,BasicStroke.CAP_BUTT,BasicStroke.JOIN_ROUND,0,guiones,0));
           
       
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
    
    g2d.setStroke(BASA);
    }
   
    
    
    
    
    
} //aIMP






class aASO extends UMLarrows{  // O.K
    
    public aASO(){
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
           //g.drawLine(xo-P, ya+P, xo+P, ya+P);
           //g.drawLine(xo-P+1, ya+P+1, xo+P+1, ya+P+1);
      }
                    
           
           
       
       if(oneDirection() == 2){
           g.drawLine(xo, ya, xo-P, ya-P);
           g.drawLine(xo+1, ya+1, xo-P+1, ya-P+1);
           g.drawLine(xo, ya, xo-P, ya+P);
           g.drawLine(xo+1, ya+1, xo-P+1, ya+P+1);
          // g.drawLine(xo-P, ya-P, xo-P, ya+P);
          // g.drawLine(xo-P+1, ya-P+1, xo-P+1, ya+P+1);
       }
        if(oneDirection() == 3){
           g.drawLine(xo, ya, xo+P, ya-P);
           g.drawLine(xo+1, ya+1, xo+P+1, ya-P+1);
           g.drawLine(xo, ya, xo-P, ya-P);
           g.drawLine(xo+1, ya+1, xo-P+1, ya-P+1);
          // g.drawLine(xo-P, ya-P, xo+P, ya-P);
         //  g.drawLine(xo-P+1, ya-P+1, xo+P+1, ya-P+1);
       }
       if(oneDirection() == 4){
           g.drawLine(xo, ya, xo+P, ya-P);
           g.drawLine(xo+1, ya+1, xo+P+1, ya-P+1);
           g.drawLine(xo, ya, xo+P, ya+P);
           g.drawLine(xo+1, ya+1, xo+P+1, ya+P+1);
          // g.drawLine(xo+P, ya-P, xo+P, ya+P);
         //  g.drawLine(xo+P+1, ya-P+1, xo+P+1, ya+P+1);
       }
    
    
    
    }
   
    
    
    
    
    
} //aASO







class aAGR extends UMLarrows{  //
    
    public aAGR(){
        super();
    
    }

    @Override
    void showarrow(Graphics g) {
        
        Graphics2D g2d = (Graphics2D)g;
        
        
      
         
           BasicStroke BASA = (BasicStroke)g2d.getStroke();
           
           g2d.setStroke(new BasicStroke(2,BasicStroke.CAP_BUTT,BasicStroke.JOIN_ROUND,0,null,0)); //este null podria fallar
        
        
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
          
          
          g.setColor(Color.WHITE);
           g.drawLine(xo, ya, xo, ya+P+P+P+P);
           g.drawLine(xo+1, ya+1, xo+1, ya+P+P+P+P+1);
           g.setColor(Color.BLACK);                         //pequeño bug visual
           
           g.drawLine(xo, ya, xo+P, ya+P+P);
           g.drawLine(xo+1, ya+1, xo+P+1, ya+P+P+1);
           g.drawLine(xo, ya, xo-P, ya+P+P);
           g.drawLine(xo+1, ya+1, xo-P+1, ya+P+P+1);
           //g.drawLine(xo-P, ya+P, xo+P, ya+P);
           //g.drawLine(xo-P+1, ya+P+1, xo+P+1, ya+P+1);
           g.drawLine(xo, ya+P+P+P+P, xo+P, ya+P+P);
           g.drawLine(xo+1, ya+P+P+P+P+1, xo+P+1, ya+P+P+1);
           g.drawLine(xo, ya+P+P+P+P, xo-P, ya+P+P);
           g.drawLine(xo+1, ya+P+P+P+P+1, xo-P+1, ya+P+P+1);
           
           
      }           
           
           
       
       if(oneDirection() == 2){
          
           g.setColor(Color.WHITE);
           g.drawLine(xo, ya, xo-P-P-P-P, ya);
           g.drawLine(xo+1, ya+1, xo-P-P-P-P+1, ya+1);
           g.setColor(Color.BLACK);                         //pequeño bug visual
           
           g.drawLine(xo, ya, xo-P-P, ya-P);
           g.drawLine(xo+1, ya+1, xo-P-P+1, ya-P+1);
           g.drawLine(xo, ya, xo-P-P, ya+P);
           g.drawLine(xo+1, ya+1, xo-P-P+1, ya+P+1);
           //g.drawLine(xo-P, ya+P, xo+P, ya+P);
           //g.drawLine(xo-P+1, ya+P+1, xo+P+1, ya+P+1);
           g.drawLine(xo-P-P-P-P, ya, xo-P-P, ya-P);
           g.drawLine(xo-P-P-P-P, ya+1, xo-P-P+1, ya-P+1);
           g.drawLine(xo-P-P-P-P, ya, xo-P-P, ya+P);
           g.drawLine(xo-P-P-P-P+1, ya+1, xo-P-P+1, ya+P+1);
           
           
       }
        if(oneDirection() == 3){
          g.setColor(Color.WHITE);
           g.drawLine(xo, ya, xo, ya-P-P-P-P);
           g.drawLine(xo+1, ya+1, xo+1, ya-P-P-P-P+1);
           g.setColor(Color.BLACK);                         //pequeño bug visual
           
           g.drawLine(xo, ya, xo+P, ya-P-P);
           g.drawLine(xo+1, ya+1, xo+P+1, ya-P-P+1);
           g.drawLine(xo, ya, xo-P, ya-P-P);
           g.drawLine(xo+1, ya+1, xo-P+1, ya-P-P+1);
           //g.drawLine(xo-P, ya+P, xo+P, ya+P);
           //g.drawLine(xo-P+1, ya+P+1, xo+P+1, ya+P+1);
           g.drawLine(xo, ya-P-P-P-P, xo+P, ya-P-P);
           g.drawLine(xo+1, ya-P-P-P-P+1, xo+P+1, ya-P-P+1);
           g.drawLine(xo, ya-P-P-P-P, xo-P, ya-P-P);
           g.drawLine(xo+1, ya-P-P-P-P+1, xo-P+1, ya-P-P+1);
           
       }
       if(oneDirection() == 4){
           g.setColor(Color.WHITE);
           g.drawLine(xo, ya, xo+P+P+P+P, ya);
           g.drawLine(xo+1, ya+1, xo+P+P+P+P+1, ya+1);
           g.setColor(Color.BLACK);                         //pequeño bug visual
           
           g.drawLine(xo, ya, xo+P+P, ya-P);
           g.drawLine(xo+1, ya+1, xo+P+P+1, ya-P+1);
           g.drawLine(xo, ya, xo+P+P, ya+P);
           g.drawLine(xo+1, ya+1, xo+P+P+1, ya+P+1);
           //g.drawLine(xo-P, ya+P, xo+P, ya+P);
           //g.drawLine(xo-P+1, ya+P+1, xo+P+1, ya+P+1);
           g.drawLine(xo+P+P+P+P, ya, xo+P+P, ya-P);
           g.drawLine(xo+P+P+P+P, ya+1, xo+P+P+1, ya-P+1);
           g.drawLine(xo+P+P+P+P, ya, xo+P+P, ya+P);
           g.drawLine(xo+P+P+P+P+1, ya+1, xo+P+P+1, ya+P+1);
       }
    
    g2d.setStroke(BASA);
    } 

}//aAGR






class aCOM extends UMLarrows{  //
    
    public aCOM(){
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
           g.drawLine(xo+1, ya+1+2, xo+1, ya+P+1);
       
       }
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
   

    
    
    
    
} //aCOM












// aLIN, aDER, aHER, aCIR
// aIMP, aASO, aAGR, aCOM