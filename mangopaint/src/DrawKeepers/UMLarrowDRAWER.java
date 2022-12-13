/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DrawKeepers;


import java.awt.Graphics;
import java.io.Serializable;
import java.util.ArrayList;
import mangopaint.lin;

/**
 * Dibujador y mostrador de flechas UML
 * @author eparr
 */
public class UMLarrowDRAWER implements Serializable{
    byte MODE;
    byte arroW;
    int rulepointx;
    int rulepointy;
    lin rei;
   public ArrayList<UMLarrows> arrowAL;
    UMLarrows currentARROW;
    public UMLarrowDRAWER(lin rei){
        MODE = lin.MODE;
        arroW = -1;
        arrowAL = new ArrayList<>();
        this.rei = rei;
        
        
    }
    
    
    public ArrayList<UMLarrows> StealMemo(){
        
        ArrayList<UMLarrows> copia = new ArrayList<UMLarrows>();
        copia = (ArrayList<UMLarrows>)arrowAL.clone();
        arrowAL = new ArrayList<UMLarrows>();
        return copia;
        
    }
    
    public void memoCHAN(ArrayList<UMLarrows> datin){
        
        arrowAL = datin;
        
        
        
    }
    
    
    /**
     * 
     * funcion que define los puntos de los vertices de las flechas
     * 
     * X e Y son leidos desde las variables estaticas de lin: cx , cy
     */
    public void setPoint(){    
        
        if(arroW < 0){
            if(lin.MODE == 1){ arrowAL.add(new aLIN()); arroW++;}
            if(lin.MODE == 2){arrowAL.add(new aDEP()); arroW++;}   // pasa a 0
            if(lin.MODE == 3){arrowAL.add(new aHER()); arroW++;}   // pasa a 0
            if(lin.MODE == 4){arrowAL.add(new aCIR()); arroW++;}   // pasa a 0
            if(lin.MODE == 5){arrowAL.add(new aIMP()); arroW++;}   // pasa a 0
            if(lin.MODE == 6){arrowAL.add(new aASO()); arroW++;}   // pasa a 0
            if(lin.MODE == 7){arrowAL.add(new aAGR()); arroW++;}   // pasa a 0
            if(lin.MODE == 8){arrowAL.add(new aCOM()); arroW++;}   // pasa a 0
             
        }
        
        if(arroW == 0){
            rulepointx = lin.cx; rulepointy = lin.cy;
            (arrowAL.get(arrowAL.size()-1)).setPoint(lin.cx, lin.cy);
        } //TE HACE EL PRIMER PUNTO
         //aqui falta el comprobador de esquina  Y PASA A SER 1
        
        if(arroW == 9 ){ arrowAL.remove(arrowAL.size()-1); arroW = -1; return;  } //problema aaa ya se porque .. le falta un return
            
        if(arroW > 0){
            int H = lin.cx - rulepointx ; 
            int V = lin.cy - rulepointy ; 
            int Habs,Vabs;
        if(H < 0){Habs = -H;}else{Habs = H;}
        if(V < 0){Vabs = -V;}else{Vabs = V;}
        
        short ansx = (arrowAL.get(arrowAL.size()-1)).penPointx(200);
        short ansy = (arrowAL.get(arrowAL.size()-1)).penPointy(200);
        
        if( (ansx-50 < lin.cx) && (lin.cx < ansx+50) &&
               (ansy-50 < lin.cy) && (lin.cy < ansy+50) ){arroW = -1; rei.repaint(); 
              (arrowAL.get(arrowAL.size()-1)).restaUNO(); return; }
        
        if(Vabs < Habs){(arrowAL.get(arrowAL.size()-1)).setPoint(lin.cx,ansy); }
        if(Habs < Vabs){(arrowAL.get(arrowAL.size()-1)).setPoint(ansx,lin.cy); }

        }
            
        
         
        rulepointx = lin.cx;
        rulepointy = lin.cy;
            
        arroW++;  
            
            
            
            
            
            
           
            
            
            
            
            
            
            
            
    }
        
        
        
        
        
        
    
    
    /**
     * dibuja las flechas UML en la pantalla
     * 
     * @param g Graphics donde se dibujara
     */
    public void showUMLarrows(Graphics g){   
        
        
        
        
        
        for(int ih = 0; ih < arrowAL.size() ; ih++){
            
            (arrowAL.get(ih)).showarrow(g);
            
              
        }
        
        
        
        
    }
    
    /**
     * dibuja en vivo la creacion de la flecha
     * (concepto de patron observador)
     * 
     * @param g Graphics donde se dibujara
     * @param rep Panel donde se dibuja, su funcionalidad es hacer posible el repaint 
     */
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
