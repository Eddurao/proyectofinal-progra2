/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MemoryManagers;

import java.io.Serializable;
import javax.swing.JFileChooser;
import mangopaint.JF;

/**
 * Master Memory Manager Manager
 * @author eparr
 */
public class M4 implements Serializable {
     
   JF F;
    
    public M4(JF F){
        
        this.F = F;
        
       
        
        
        
        
    }
    
    
    
    public void cargar(){
        
        
         
            // File saveFile = new File("savedimage.jpg");
             
             JFileChooser chooser = new JFileChooser("src/OUTPUT_BINDER");
             
          //chooser.setSelectedFile(saveFile);
          chooser.setName("hola1.mango");
           
        int resultado = chooser.showOpenDialog(F);
             
            //     saveFile = chooser.getSelectedFile();
                 /* Write the filtered image in the selected format,
                  * to the file chosen by the user.
                  */
            //     try {
             //        ImageIO.write(createImage(this), "jpg", saveFile);
            //     } catch (IOException ex) {}//ImageIO.write(biFiltered, format, saveFile);

                 
            String nombre = chooser.getSelectedFile().getName();
            


        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       F.MASTER_MEMORY_MANAGER.THE = null;
        
       F.MASTER_MEMORY_MANAGER = SerializarObjeto.deserializarObjeto(nombre, MMM.class );
        
       F.MASTER_MEMORY_MANAGER.THE = F;
        
        
        
    }
    
    
    
    public void guardar(){
        
        
       
    
          
            // File saveFile = new File("savedimage.jpg");
             
             JFileChooser chooser = new JFileChooser("src/OUTPUT_BINDER");
             
          //chooser.setSelectedFile(saveFile);
         // chooser.setName("hola1.mango");
             chooser.showSaveDialog(F.hj);
                    
             
            //     saveFile = chooser.getSelectedFile();
                 /* Write the filtered image in the selected format,
                  * to the file chosen by the user.
                  */
            //     try {
             //        ImageIO.write(createImage(this), "jpg", saveFile);
            //     } catch (IOException ex) {}//ImageIO.write(biFiltered, format, saveFile);

                 
            String nombre = chooser.getSelectedFile().getName();
            


        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        System.out.println(nombre);
        
        
        
        
        
        
        
        F.MASTER_MEMORY_MANAGER.THE = null;
        
        MMM COPY = F.MASTER_MEMORY_MANAGER.clone();
        
        SerializarObjeto.serializarObjeto(nombre, COPY );  // F.MASTER_MEMORY_MANAGER
        
        F.MASTER_MEMORY_MANAGER.reRef(F);
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
}
