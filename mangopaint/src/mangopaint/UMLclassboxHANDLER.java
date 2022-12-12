/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mangopaint;

import java.awt.Graphics;
import java.util.ArrayList;

/**
 * manejador, administrador, dibujador de cajas de clase UML
 * @author eparr
 */
public class UMLclassboxHANDLER {
    
    ArrayList<UMLclassbox> cboxAL;
    boolean click; 
    
    public UMLclassboxHANDLER() {   //error capsioso sab 13:40  no tenia en cuanta que se seteABAN LAS FLECHAS

            cboxAL = new ArrayList<>();
            click = true;  //true for 1 and false for 2 case 
            
    }
    //crear counter para clickear 2 veces
    public void createClassBox(){  //MODE 10   !!!!
        if(click){ click = false;
        cboxAL.add(new UMLclassbox());
        UMLclassbox cubox = cboxAL.get(cboxAL.size()-1);         //cubox : current box
        cubox.setPointA(lin.cx, lin.cy);
        
        System.out.println("SETEADO A"+click);
        return;
        }
        System.out.println("almenos");
        if(!click){ click = true;
            System.out.println("llegue");
        UMLclassbox cubax = cboxAL.get(cboxAL.size()-1);
        cubax.setPointB(lin.cx, lin.cy);
        
            System.out.println("SETEADO B");
      
        }
        
        
        
    
    }
    


    /**
     * Dibuja todas las cajas de clase UML
     * @param g Graphics en donde dibujar 
     */
     public void showUMLclassboxes(Graphics g){
         
        
         
        for(int ih = 0; ih < cboxAL.size() ; ih++){
            
            (cboxAL.get(ih)).showclassbox(g);
            
              
        }
        
     if(lin.MODE == 15){
           
         int zonespace = 0;
        if(zoneID == 1) { zonespace = 0;}
        if(zoneID == 2) { zonespace = 24;}
        if(zoneID == 3) { zonespace = (cboxAL.get(editID)).line - (cboxAL.get(editID)).y ;}
         
        g.drawString("-> Write with Keyboard", (cboxAL.get(editID)).x , (cboxAL.get(editID)).y - 10 ); 
        
        g.drawString(" Writting HERE -> ", (cboxAL.get(editID)).x -100 , (cboxAL.get(editID)).y +12 + filaID*14
                    + zonespace                                            ); 
        
        
        
     }
      
      
      
      
      
      }  

     
     
     
     
     /**
      * Muestra en vivo la construccion de la caja de clase UML (mouse moved)
      * @param g Graphics en donde dibujar
      * @param rep Lienzo en donde se dibuja
      */
     public void UMLliveshow(Graphics g, lin rep){if(!click){ 
        
         UMLclassbox cubox = (cboxAL.get(cboxAL.size()-1));
         
         cubox.setPointB(lin.mx, lin.my);
         cubox.showclassbox(g);  rep.repaint();
         
        }//if 
     }//UMLliveshow
    
    int editID;
    int zoneID;
    int filaID;
    
    
    /**
     * Esta funcion se pone en MousePresed, para buscar y setear la direccion del campo UMLclassbox a editar
     *  establece editID zoneID y filaID en caso de encontrar un UMLclassbox
     */
     public void UMLsetoedit(){  //of this array //clicking
         System.out.println("searching...");
         for(int i = 0; i < cboxAL.size() ; i++  ){
             UMLclassbox cubox = cboxAL.get(i);
             
             if(cubox.clicking(lin.cx, lin.cy) == 0){continue;}
             
             if(cubox.clicking(lin.cx, lin.cy) == 1){  System.out.println("Finded CLASS !");
               editID = i; zoneID = 1; filaID = 0; lin.MODE = 15; return;
                
             }
             if(cubox.clicking(lin.cx, lin.cy) == 2){
               editID = i; zoneID = 2; filaID = cubox.propiedades.size() -1 ; lin.MODE = 15; return;      //editing text ON mode  15
             
             }
             if(cubox.clicking(lin.cx, lin.cy) == 3){
               editID = i; zoneID = 3; filaID = cubox.capacidades.size() -1 ; lin.MODE = 15; return;
             
             }
             
         }
     
     
     
     
     
     
     
     }
     
     /**
      * Esta funcion fue pensada para ser puesta en el KeyListener
      * con un if(MODE == 15) MODE 15: hay una direccion valida para editar
      * Se utiliza el concepto de patron OBSERVADOR
      * @param letra caracter que el KeyEvent tiene que poner 
      */
     public void TextEdit(char letra){  //falta agregar el quit y el enter
     
     
         (cboxAL.get(editID)).addChar(zoneID, filaID, letra);
     
         System.out.println("TEXTING");
     
     
     
     }
     
     /**
      * Añade una linea a la zona seleccionada de la caja clase UML seleccionada por UMLsetoedit
      */
     public void TextAddLine(){
     
     (cboxAL.get(editID)).addLine(zoneID);
     filaID ++;
     
     }
     
     
     public void QuitChar(){
         
        
         (cboxAL.get(editID)).quitChar(zoneID, filaID);
     
         
         
     }
     
     
     /**
      * future use in newest versions
      */
     public void TextQuitLine(){
         
         
         (cboxAL.get(editID)).addLine(zoneID);
         filaID --;
         
     }
     
     
     
     
     /**
      * Cambia de fila solo si se puede
      * @param UP_or_DOWN TRUE: SUBIR  FALSE: BAJAR
      */
     public void trytochangerow( boolean UP_or_DOWN){
         
         int cuRows = (cboxAL.get(editID)).getRows(zoneID);
         
         
         
         if(UP_or_DOWN && filaID != 0){ filaID --;}
         
         if( ! UP_or_DOWN && filaID != cuRows-1 ){ filaID ++;}
         
         
         
     }
     
     
    
}
