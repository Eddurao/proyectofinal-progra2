/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DrawKeepers;

import EditTools.key;
import java.awt.Font;
import java.awt.Graphics;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * tipo de dato para guardar cajas de clase
 * @author eparr
 */
public class UMLclassbox implements Cloneable, Serializable {
   public int x,y,xa,ya,line;
    String clase;
    ArrayList<String> propiedades;
    ArrayList<String> capacidades;
    
    final int ts=24;
    final int in=14;
    
    public UMLclassbox(){
    
       propiedades = new ArrayList<>();
       capacidades = new ArrayList<>();
       
       propiedades.add("properties");
       capacidades.add("capacities");
        
        x = 100;
        y = 100;
        xa = 200;
        ya = 200;
        
       clase = "<click here>";
    
    }
    
    
    
    
    
    
    
    /**
     * dibuja la caja uml
     * @param g Graphics en donde dibujar
     */
    public void showclassbox(Graphics g){   //la ptm tengo que manejar las quitaciones y agregaciones 
    x += key.alt; y += key.alt;
        int ps = y + ts + in ;
        g.drawRect(x, y, xa-x, ya-y);
        
        
        g.drawLine(x, y+ts, xa , y+ts);
        Font saveme = g.getFont();
        g.setFont(new Font( "Tahoma", Font.BOLD, 20 ));
        g.drawString( clase , x+10, y+(ts-3));  //TITLE FOR CLASS
        g.setFont(saveme);
        
        for(int i = 0 ; i < propiedades.size() && !propiedades.isEmpty(); i++){
            
            g.drawString(propiedades.get(i), x+2, ps-2); ps+=in;
               
        }
        
        //g.drawString( "PROPERTIE" + key.word + (220 + key.alt),   x+2, ps-2); ps +=in;  //PROPERTIES
        // g.drawString( "PROPERTIE" + key.word + (220 + key.alt),   x+2, ps-2); ps +=in;
        // g.drawString( "PROPERTIE" + key.word + (220 + key.alt),   x+2, ps-2); ps +=in;  //sera un for
        
       g.drawLine(x, y + (ya-y)/2, xa ,y + (ya-y)/2); ps = y + (ya-y)/2; line = ps; ps += in; //SEPARATOR LINE !!!!! crear metodo posicionador
       
       for(int ia = 0; ia < capacidades.size() && !capacidades.isEmpty(); ia++){
            
            g.drawString(capacidades.get(ia), x+2, ps-2); ps+=in;
               
        }
       
       
       
       
       
       //g.drawString( "PROPERTIE" + key.word + (220 + key.alt),   x+2, ps-2); ps +=in;  //CAPACITIES
       //g.drawString( "PROPERTIE" + key.word + (220 + key.alt),   x+2, ps-2); ps +=in;
       //g.drawString( "PROPERTIE" + key.word + (220 + key.alt),   x+2, ps-2); ps +=in;  //sera un for 
    
    
    
    
    
    
    
    }
    
    
    
    
    /**
     * establece el primer punto de la caja de clase UML
     * @param h Abscisa del primer punto
     * @param v Ordenada del primer punto
     */
    public void setPointA(int h, int v){
        x = h;   xa = h + 100;
        y = v;   ya = v + 100;
        
    }
    
    /**
     * establece el segundo punto de la caja de clase UML
     * @param ha Abscisa del primer punto
     * @param va Ordenada del primer punto
     */
    public void setPointB(int ha, int va){
        xa = ha;
        ya = va;
        
    }
    
    /**
     * detecta si se clickeo dentro; en la clase o las propiedades o capacidades
     * @param mouseX Abscisa del MOUSE
     * @param mouseY Ordenada del MOUSE
     * @return   0:NOT_CLICKED 1:CLASS 2:PROPERTIES 3:CAPACITIES
     */
    public int clicking(int mouseX, int mouseY){  //0: is not clicking in1: class 2:propertie 3:capacitie
    
        boolean isin = false;
        
        if( ( x < mouseX && mouseX < xa ) && ( y < mouseY && mouseY < ya ) ){
            if( mouseY < y + ts){return 1;}
            
            if( mouseY < line){return 2;}
        
            return 3;
        
        }
    
        return 0;
    
    
    
    }
    
    
    
    /**
     * Agregar caracter en la zona especificada
     * generalmente se usa en el KeyListener
     * @param zone 1:CLASS  2:PROPERTIES  3:CAPACITIES
     * @param fila La fila de las propiedades o capacidades
     * @param letra Caracter a añadir
     */
    public void addChar(int zone, int fila, char letra){
        
        if(zone == 1){clase = clase+(letra+""); System.out.println("aded");}
        if(zone == 2){ propiedades.set(fila, (propiedades.get(fila)) + letra )  ; }
        if(zone == 3){ capacidades.set(fila, (capacidades.get(fila)) + letra )  ;  }
        
        
        
        
    }
    
    /**
     * Esta funcion agrega una linea String en la zona deseada por zone
     * @param zone 1: clase 2: properties 3:capacitie 
     */
    public void addLine(int zone){
    
        if(zone == 1){ }
        if(zone == 2){ propiedades.add(new String()); }
        if(zone == 3){ capacidades.add(new String()); }
    
    
    
    
    }
    
    /**
     * Quita el ultimo caracter del String especificado por fila, en la zona especificada
     * @param zone 1:CLASS 2:PROPERTIE 3:CAPACITIE
     * @param fila Fila en donde QUITAR el ultimo caracter
     */
    public void quitChar(int zone, int fila){
    
         if(zone == 1 && clase.length() != 0){clase = clase.substring(0, clase.length()-1);}
        if(zone == 2 && (propiedades.get(fila)).length() != 0){ propiedades.set(fila, (propiedades.get(fila)).substring(0, (propiedades.get(fila)).length() - 1 )      )  ;  }
        if(zone == 3 && (capacidades.get(fila)).length() != 0){ capacidades.set(fila, (capacidades.get(fila)).substring(0, (capacidades.get(fila)).length() - 1 )      )  ; }
    
    
    
    
    
    }
    
    /**
     * Devuelve el numero de filas que tiene la zona especificada
     * @param zone zona en donde contar 1:CLASS 2:PROPERTIES 3:CAPACITIES
     * @return  numero de filas
     */
    public int getRows(int zone){
        
        
        if(zone == 2){ return propiedades.size(); }
        if(zone == 3){ return capacidades.size(); }
        
        
        
        return 1;
        
        
        
    }
    
    /**
     * Correr la caja de clase segun la cantidad especificada
     * @param dix desplazamiento Horizontal del MOUSE
     * @param diy desplazamiento Vertical del MOUSE
     * @param refx Abscisa del punto inicial de la caja de clase UML inicial
     * @param refy Ordenada del punto inicial de la caja de clase UML inicial
     * @param refxa Abscisa del punto final de la caja de clase UML inicial
     * @param refya Ordenada del punto final de la caja de clase UML inicial
     */
    public void correCB(int dix , int diy , int refx ,int refy ,int refxa ,int refya ){
        x = dix + refx ;
        y = diy + refy;
        xa = dix + refxa;
        ya = diy + refya;   // System.out.println("me corro");
    }
    
    /**
     * Detecta si esta dentro de el rectangulo definido por los puntos especificados
     * @param xo Absciza del punto inicial del rectangulo seleccionador
     * @param yo Ordenada del punto inicial del rectangulo seleccionador
     * @param xi Absciza del punto final del  rectangulo seleccionador
     * @param yinping Ordenada del punto final del primer punto del rectangulo seleccionador
     * @return TRUE: si se encuentra dentro  FALSE: no se encuentra dentro o solo una parte
     */
    public boolean EstoyDentro(int xo ,int yo ,int xi ,int yinping){
    
      
            if( xo < x && x < xi  &&  xo < xa && xa < xi                ){}else{return false;}
            if( yo < y && y < yinping  &&  yo < ya && ya < yinping           ){}else{return false;}
        
            
            
            
            
        
        return true;
       
    
    
    
    }
    
   
    
   // public void addChar( ) // al key
    
    
    
    
    
    
    
}
