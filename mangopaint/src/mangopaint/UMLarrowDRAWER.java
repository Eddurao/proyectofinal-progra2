/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mangopaint;

import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author eparr
 */
public class UMLarrowDRAWER {
    byte MODE;
    byte arroW;
    int rulepointx;
    int rulepointy;
    ArrayList<UMLarrows> arrowAL;
    UMLarrows currentARROW;
    public UMLarrowDRAWER(){
        MODE = lin.MODE;
        arroW = -1;
        arrowAL = new ArrayList<>();
        
        
        
    }
    
    
    public void setPoint(){
        
        if(arroW < 0){
            if(lin.MODE % 10 == 1){ arrowAL.add(new aLIN()); arroW++;} // pasa a 0
             
        }
        
        if(arroW == 0){
            rulepointx = lin.cx; rulepointy = lin.cy;
            (arrowAL.get(arrowAL.size()-1)).setPoint(lin.cx, lin.cy);
        } //TE HACE EL PRIMER PUNTO
         //aqui falta el comprobador de esquina  Y PASA A SER 1
        
            
            
        if(arroW > 0){
            int H = lin.cx - rulepointx ; 
            int V = lin.cy - rulepointy ; 
            int Habs,Vabs;
        if(H < 0){Habs = -H;}else{Habs = H;}
        if(V < 0){Vabs = -V;}else{Vabs = V;}
        
        short ansx = (arrowAL.get(arrowAL.size()-1)).penPointx(200);
        short ansy = (arrowAL.get(arrowAL.size()-1)).penPointy(0);
        
        if( (ansx-80 < lin.cx) && (lin.cx < ansx+80) &&
               (ansy-80 < lin.cy) && (lin.cy < ansy+80) ){arroW = -1;System.out.println("CANCEWLADO");
              (arrowAL.get(arrowAL.size()-1)).restaUNO(); return; }
        
        if(Vabs < Habs){(arrowAL.get(arrowAL.size()-1)).setPoint(lin.cx,ansy); }
        if(Habs < Vabs){(arrowAL.get(arrowAL.size()-1)).setPoint(ansx,lin.cy); }

        }
            
         
        rulepointx = lin.cx;
        rulepointy = lin.cy;
            
        arroW++;  
            
            
            
            
            
            
           
            
            
            
            
            
            
            
            
    }
        
        
        
        
        
        
    
    
    
    public void showUMLarrows(Graphics g){   //el live drawing se hara por aca
        
        
        
        
        
        
        
        
        
        
        for(int ih = 0; ih < arrowAL.size() ; ih++){
            
            (arrowAL.get(ih)).showarrow(g);
            
            
            
        }
        
        
        
        
    }
    
    
    public void UMLliveshow(Graphics g, lin rep){if(arroW > 0){ //BUG VISUAL FIX PLIS (fixed a medias)
        
        short ansx = (arrowAL.get(arrowAL.size()-1)).penPointx(400);
        short ansy = (arrowAL.get(arrowAL.size()-1)).penPointy(407);
        
        int H = lin.mx - ansx ; 
        int V = lin.my - ansy ; 
        int Habs,Vabs;
        if(H < 0){Habs = -H;}else{Habs = H;}
        if(V < 0){Vabs = -V;}else{Vabs = V;}
        
        if(Vabs < Habs){(arrowAL.get(arrowAL.size()-1)).driveCurrentPoint(lin.mx,ansy);}
        if(Habs < Vabs){(arrowAL.get(arrowAL.size()-1)).driveCurrentPoint(ansx,lin.my);}
        
        
            
            
           
        
        
        
        (arrowAL.get(arrowAL.size()-1)).showarrow(g);  rep.repaint();  //quitar el repaint plis
    
             //h5     ALGO SIGUE MAAAAL
    } }//arroW
    
    
    
    
    
    
}
