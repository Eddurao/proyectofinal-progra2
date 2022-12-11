/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mangopaint;

import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author eparr
 */
public class UMLclassbox {
    int x,y,xa,ya,line;
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
    
    
    
    
    
    public void setPointA(int h, int v){
        x = h;   xa = h + 100;
        y = v;   ya = v + 100;
        
    }
    
    public void setPointB(int ha, int va){
        xa = ha;
        ya = va;
        
    }
    
    
    public int clicking(int mouseX, int mouseY){  //0: is not clicking in1: class 2:propertie 3:capacitie
    
        boolean isin = false;
        
        if( ( x < mouseX && mouseX < xa ) && ( y < mouseY && mouseY < ya ) ){
            if( mouseY < y + ts){return 1;}
            
            if( mouseY < line){return 2;}
        
            return 3;
        
        }
    
        return 0;
    
    
    
    }
    
    
    
    
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
    
    
    public void quitChar(int zone, int fila){
    
         if(zone == 1){clase = clase.substring(0, clase.length()-1);}
        if(zone == 2){ propiedades.set(fila, (propiedades.get(fila)).substring(0, (propiedades.get(fila)).length() - 1 )      )  ;  }
        if(zone == 3){ capacidades.set(fila, (capacidades.get(fila)).substring(0, (capacidades.get(fila)).length() - 1 )      )  ; }
    
    
    
    
    
    }
    
    
    public int getRows(int zone){
        
        
        if(zone == 2){ return propiedades.size(); }
        if(zone == 3){ return capacidades.size(); }
        
        
        
        return 1;
        
        
        
    }
    
    
    
   // public void addChar( ) // al key
    
    
    
    
    
    
    
}
