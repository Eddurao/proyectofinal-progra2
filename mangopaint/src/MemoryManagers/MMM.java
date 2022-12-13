/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MemoryManagers;


import DrawKeepers.DrawData;
import DrawKeepers.UMLarrows;
import java.io.Serializable;
import java.util.ArrayList;
import mangopaint.JF;
import DrawKeepers.UMLclassbox;
import mangopaint.lin;

/**
 * Master Memory Manager
 * @author eparr
 */
public class MMM implements Serializable, Cloneable{
    
    ArrayList<  ArrayList<DrawData>  > DDbinder;
    ArrayList<  ArrayList<UMLarrows>  > Abinder;
    ArrayList<  ArrayList<UMLclassbox>  > CBbinder;
    
    int master;
    int CU;
    JF THE;  //AQUI DEBE ESTAR EL PROBLEMAA !!!!!!!
    boolean isNOsaved;
  public MMM(JF UX){

        DDbinder = new ArrayList<  ArrayList<DrawData>  >();
   Abinder = new   ArrayList<  ArrayList<UMLarrows>  >();
    CBbinder = new  ArrayList<  ArrayList<UMLclassbox>  >();
      
     
      
      
      THE = UX;
      
      master = -1;
      CU = 0;
      isNOsaved = true;


}
    
        public void reRef(JF UX){
            
            
            
            
            THE = UX;
            
            
            
            
            
            
        }
    
    public void SAVEone (){
        if(!isNOsaved){ CU= master; THE.hj.DELETE_ALL_DRAWINGS(); THE.pc.setBText("ADDED!"+ (CU+2) + " /" + (master+1)); isNOsaved = true; return; }
        if(lin.MODE == 15){ lin.MODE = 14;}  //fix text bug
        DDbinder.add(    THE.hj.StealMemo()             );
        Abinder.add(    THE.hj.umlAD.StealMemo()             );
        CBbinder.add(    THE.hj.umlCBH.StealMemo()             );
        
        master ++; 
       if( isNOsaved) CU = master; //seria para mover auto a adelante
        
        System.out.println(master + "---" + CU);
        THE.pc.setBText("ADDED!"+ (CU+2) + " /" + (master+1));
        isNOsaved=true;
    }
    
    public void CHANGEtoTHIS(int ID){
        
        THE.hj.memoCHAN(  DDbinder.get(ID)   );
        THE.hj.umlAD.memoCHAN(   Abinder.get(ID)    );
        THE.hj.umlCBH.memoCHAN(    CBbinder.get(ID)   );
        
     
       THE.pc.setBText((CU+1) + " /" + (master+1));
        isNOsaved = false;
    }
    
    
    public void NEXTpage(){
        
         System.out.println(master + "---" + CU);
        if(CU != master && master != -1){
            System.out.println(DDbinder.size() + " entrando a " + CU);
        CU ++;
        CHANGEtoTHIS(CU);
        isNOsaved = false;
        
        }
         System.out.println(master + "---" + CU);
        
    }
    
    
    public void BACKpage(){
         System.out.println(master + "---" + CU);
       // if(CU == master){CU++;}
         if(CU != 0 ){
      
            if(CU == master && isNOsaved) {SAVEone(); isNOsaved=false;  }  //solucionar error se salta osea no error falta mas implementacion
             
        CU--;       
        CHANGEtoTHIS(CU);
        isNOsaved = false;
        
        }
         if(CU == 0 && CU == master){
            SAVEone();
            CU--;
             CHANGEtoTHIS(CU);
         
         
         }
        if(CU == 0 && CU != master){ isNOsaved = false; }
        
         System.out.println(master + "---" + CU); 
    }
    
    
    @Override
    public MMM clone(){
        
         MMM obj=null;
        try{
            obj=(MMM)super.clone();
        }catch(CloneNotSupportedException ex){
            System.out.println(" no se puede duplicar");
        }
       
       
       
        return obj;
        
        
        
        
        
    }
    
    
    
    
    
}

