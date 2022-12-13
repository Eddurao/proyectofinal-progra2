/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DrawKeepers;

import java.awt.Color;
import java.awt.Graphics;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author eparr
 * Esta clase es usada como tipo de dato de guardado de trazos dibujados con el lapiz
 */
public class DrawData implements Cloneable, Serializable {
    
    ArrayList< Short > RECx1;
    ArrayList< Short > RECy1;
    ArrayList< Short > RECx2;
    ArrayList< Short > RECy2;
    Color tinta;
    int brush;
    
    public DrawData (){
        
        RECx1 = new ArrayList<>();
        RECy1 = new ArrayList<>();
        RECx2 = new ArrayList<>();
        RECy2 = new ArrayList<>();
        tinta = Color.black;
        brush = 0;
        
        
        
    }
    
    /**
     * Metodo que guarda los 2 puntos 2D y el color de tinta del lapiz
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @param color 
     * @param pincel tipo de lapiz
     */
    public void RECcord(int x1, int y1, int x2, int y2, Color color, int pincel){
    
        RECx1.add((short)x1);
        RECy1.add((short)y1);
        RECx2.add((short)x2);
        RECy2.add((short)y2);
        tinta = color;
        brush = pincel;
    }
      
    /**
     * Este metodo se tiene que agregar dentro del paint para pintar el trazo en pantalla
     * @param g Graphics en donde se dibujara
     */
    public void Paintcord(Graphics g){
        
        
        
        for(int i = 0; i<RECx1.size() ;i++){
           
            if(brush == 0){
            g.setColor(tinta);   //AQUI IRAN LOS PINCELES
            g.drawLine(RECx1.get(i), RECy1.get(i), RECx2.get(i), RECy2.get(i));
            }
            if(brush == 25){
                
                g.drawLine(RECx1.get(i), RECy1.get(i), RECx2.get(i), RECy2.get(i));
                g.drawLine(RECx1.get(i)+1, RECy1.get(i)+1, RECx2.get(i)+1, RECy2.get(i)+1);
                g.drawLine(RECx1.get(i)+2, RECy1.get(i)+2, RECx2.get(i)+2, RECy2.get(i)+2);
                MULTICOLOR(g);
                
                
            }
            if(brush == 22){
                
                
                g.setColor(tinta);
                 g.drawLine(RECx1.get(i), RECy1.get(i), RECx2.get(i), RECy2.get(i));
                 g.drawLine(RECx1.get(i)+1, RECy1.get(i)+1, RECx2.get(i)+1, RECy2.get(i)+1);
                 g.drawLine(RECx1.get(i)+1,RECy1.get(i)+1, RECx2.get(i)+1, RECy2.get(i)+1); g.setColor(Color.red);
                 g.drawLine(RECx1.get(i)+2, RECy1.get(i)+2, RECx2.get(i)+2, RECy2.get(i)+2);  g.setColor(Color.orange);
                 g.drawLine(RECx1.get(i)+3,RECy1.get(i)+3, RECx2.get(i)+3, RECy2.get(i)+3);  g.setColor(Color.yellow);
                 g.drawLine(RECx1.get(i)+4, RECy1.get(i)+4, RECx2.get(i)+4, RECy2.get(i)+4);  g.setColor(Color.blue);
             
            }
            if(brush == 26){
                
                g.setColor(tinta);
                 g.drawLine(RECx1.get(i)-2, RECy1.get(i), RECx2.get(i)-2, RECy2.get(i));
                 g.drawLine(RECx1.get(i)-1, RECy1.get(i), RECx2.get(i)-1, RECy2.get(i));
                 g.drawLine(RECx1.get(i), RECy1.get(i), RECx2.get(i), RECy2.get(i));
                 g.drawLine(RECx1.get(i)+1, RECy1.get(i), RECx2.get(i)+1, RECy2.get(i));
                 g.drawLine(RECx1.get(i)+2, RECy1.get(i), RECx2.get(i)+2, RECy2.get(i));
            
                 g.drawLine(RECx1.get(i), RECy1.get(i)-2, RECx2.get(i), RECy2.get(i)-2);           
                 g.drawLine(RECx1.get(i), RECy1.get(i)-1, RECx2.get(i), RECy2.get(i)-1);           
                 g.drawLine(RECx1.get(i), RECy1.get(i), RECx2.get(i), RECy2.get(i));           
                 g.drawLine(RECx1.get(i), RECy1.get(i)+1, RECx2.get(i), RECy2.get(i)+1);           
                 g.drawLine(RECx1.get(i), RECy1.get(i)+2, RECx2.get(i), RECy2.get(i)+2);           
            
            
            
            
            }
            if(brush == 27){
                
           
                g.setColor(tinta); int A = Rint(-10,10);
                 g.drawLine(RECx1.get(i)-2+A, RECy1.get(i)+A, RECx2.get(i)-2+A, RECy2.get(i)+A);
                 g.drawLine(RECx1.get(i)-1+A, RECy1.get(i)+A, RECx2.get(i)-1+A, RECy2.get(i)+A);
                 g.drawLine(RECx1.get(i)+A, RECy1.get(i)+A, RECx2.get(i)+A, RECy2.get(i)+A);
                 g.drawLine(RECx1.get(i)+1+A, RECy1.get(i)+A, RECx2.get(i)+1+A, RECy2.get(i)+A);
                 g.drawLine(RECx1.get(i)+2+A, RECy1.get(i)+A, RECx2.get(i)+2+A, RECy2.get(i)+A);
            
                 g.drawLine(RECx1.get(i)+A, RECy1.get(i)-2+A, RECx2.get(i)+A, RECy2.get(i)-2+A);           
                 g.drawLine(RECx1.get(i)+A, RECy1.get(i)-1+A, RECx2.get(i)+A, RECy2.get(i)-1+A);           
                 g.drawLine(RECx1.get(i)+A, RECy1.get(i)+A, RECx2.get(i)+A, RECy2.get(i)+A);           
                 g.drawLine(RECx1.get(i)+A, RECy1.get(i)+1+A, RECx2.get(i)+A, RECy2.get(i)+1+A);           
                 g.drawLine(RECx1.get(i)+A, RECy1.get(i)+2+A, RECx2.get(i)+A, RECy2.get(i)+2+A);           
            
            
            
            
            }
         
        }
        
    }  
 
    /**
     * 
     * 
     * @param x1 absciza del punto inicial del rectangulo selector
     * @param y1 ordenada del punto inicial del rectangulo selector
     * @param x2 absciza del punto final del selector
     * @param y2 ordenada del punto final del selector
     * @return true: esta dentro del rectangulo indicado
     * @return false: no esta del todo o no esta dentro del rectangulo indicado
     */
    public boolean estoyDentro(int x1, int y1,int x2,int y2){
       
        for(int i=0 ; i<RECx1.size() ; i++){
            if( x1 < RECx1.get(i) && RECx1.get(i) < x2 ){}else{return false;}
            if( y1 < RECy1.get(i) && RECy1.get(i) < y2 ){}else{return false;}
        }
        
        return true;
       
    }
    
    
    
   /**
    * esta funcion esta en desuso
    * @param x1
    * @param y1
    * @param x2
    * @param y2
    * @return 
    */
    public boolean tengoDentro(int x1, int y1, int x2, int y2){
        
         
        for(int i=0 ; i<RECx1.size() ; i++){
            if( x1 < RECx1.get(i) && RECx1.get(i) < x2 ){return true;}
            if( y1 < RECy1.get(i) && RECy1.get(i) < y2 ){return true;}
        }
        
        return false;
        
        
        
    }
    
    /**
     * 
     * @param xd absciza del MOUSE
     * @param yd ordenada del MOUSE
     * @param copia Objeto de referencia para mover el objeto acorde a donde se selecciono inicialmente
     */
    public void correcord(int xd, int yd, DrawData copia){
        
        int momx1;
        int momy1;
        int momx2;
        int momy2;
        
        
        for(int i=0 ; i<RECx1.size() ; i++){
            
           momx1 = copia.RECx1.get(i);
            momy1 = copia.RECy1.get(i);
           momx2 = copia.RECx2.get(i);
            momy2 = copia.RECy2.get(i);
            
            RECx1.set(i, (short)(momx1 + xd));
            RECy1.set(i, (short)(momy1 + yd));
            RECx2.set(i, (short)(momx2 + xd));
            RECy2.set(i, (short)(momy2 + yd));
            
            
        }
        
        
        
        
    
    
       
        
        
        
        
    }

    
    
    
   /**
    * Clona el objeto
    * 
    * @return una copia del objeto
    */
    public DrawData clone(){
        DrawData obj=null;
        try{
            obj=(DrawData)super.clone();
        }catch(CloneNotSupportedException ex){
            System.out.println(" no se puede duplicar");
        }
        obj.RECx1=(ArrayList< Short >)obj.RECx1.clone();
        obj.RECy1=(ArrayList< Short >)obj.RECy1.clone();
        obj.RECx2=(ArrayList< Short >)obj.RECx2.clone();
        obj.RECy2=(ArrayList< Short >)obj.RECy2.clone();
        obj.tinta=tinta;  //!!!!!!!!!!!
        obj.brush = brush;
        return obj;
    }
    
    
    
    /**
     * modo multicolor
     * @param g Graphics en donde hacer el multicolor
     */
    
    public void MULTICOLOR(Graphics g){
      switch(Rint(0,7)){
          case 1: g.setColor(Color.red);break;
          case 2: g.setColor(Color.orange);break;
          case 3: g.setColor(Color.yellow);break;
          case 4: g.setColor(Color.green);break;
          case 5: g.setColor(Color.blue);break;
          case 6: g.setColor(Color.magenta);break;
      }
      
      
  }
    
    
    
    /**
   * Devuelve Numero aleatorio entre los dos numeros indicados
   * @param i cota inferior
   * @param top cota superior
   * @return numero aleatorio entre i y top
   */
  public int Rint(int i, int top){
    int diff = top - i;
    int R = (int)(i + Math. random()*diff+1);
    return(R);
  }


}
    
    
    
    
    
    

