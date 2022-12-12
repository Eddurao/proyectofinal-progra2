/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mangopaint;

/**
 * El panel de dibujo. Aqui se mostrara y se dibujaran todos los trazos, UML, etc
 */ // @author eparr

//import java.awt.Graphics2D;
//import java.awt.BasicStroke;



import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import static java.lang.String.format;
import java.util.ArrayList;
import javax.swing.*;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;
import java.util.*;


public class lin extends JPanel   //lin for LIENZO
{
  // PROPERTIES 
       //drawea botones
    
    
    
    int CONTADOREC; 
    static int cx,cy,T,ux,uy,fx,fy,mx,my;
    public Graphics g;
    public static byte MODE;
    private final int DEFAULT_WIDTH  = 1200;
    private final int DEFAULT_HEIGHT = 600;
    private final Color BACK_COLOR   = Color.WHITE;
    public static int x1, y1, x2, y2;
    public ArrayList<DrawData> MASTERddarray;
    public MyMouseHandler handler;
    static Color tarro;                        
    static boolean Multi; 
    
    public Selector sele;
    public static byte MOUSESTATE;
    public lin este;
    
    public UMLarrowDRAWER umlAD;
    public UMLclassboxHANDLER umlCBH;
    public key kin;
    public UMLselector umlselector;
//public Graphics g;
   
  // CONSTRUCTOR
  
  public lin(){//CONSTRUCTOR-CONSTRUCTOR-CONSTRUCTOR-CONSTRUCTOR-
      
    MODE = -1; MOUSESTATE = 0;
    T=0;                                 // sele = new Selector(this);
    MASTERddarray = new ArrayList<>();
    CONTADOREC = 0;
    Multi = false;
    
    setBackground( BACK_COLOR ); //
    setPreferredSize( new Dimension( DEFAULT_WIDTH, DEFAULT_HEIGHT ) );

    handler  = new MyMouseHandler();  kin = new key();

    this.addMouseListener( handler );
    this.addMouseMotionListener( handler );
      // AQUI NO FUNCIONA setUpDrawingGraphics(); // !!!!!!!!
     
      sele = new Selector(this);
      umlselector = new UMLselector(this);
      umlAD = new UMLarrowDRAWER(this);
      umlCBH = new UMLclassboxHANDLER();
      este = this;
      
   
    this.addKeyListener(kin);
      this.addKeyListener(kin);
      this.addKeyListener(kin);
      
      
     
     
    
     
  } //CONSTRUCTOR-CONSTRUCTOR-CONSTRUCTOR-CONSTRUCTOR-CONSTRUCTOR-

  
  public void DELETE_ALL_DRAWINGS(){
        MASTERddarray = new ArrayList<>();
      
      
      
      
  }
  
  
  
  // METHOD
  public void paintComponent(Graphics g){
    super.paintComponent(g); //setUpDrawingGraphics();   FUNCIONA AQUI :)
    
    
    
    //TEST ZONE TEST ZONE TEST ZONE TEST ZONE TEST ZONE TEST ZONE TEST ZONE ini
    
   
    
    
    
    
    
    
    //TEST ZONE TEST ZONE TEST ZONE TEST ZONE TEST ZONE TEST ZONE TEST ZONE end
    
    umlCBH.showUMLclassboxes(g);
    umlselector.showSelector(g);
    //if(MODE == 60){g.drawRect(cx, cy,ux-cx, uy-cy); g.drawRect(cx+1, cy+1,ux-cx, uy-cy);}
   
    sele.showSelector(g);
    
    umlAD.showUMLarrows(g);
    
    for(int ide =0; ide < MASTERddarray.size() ; ide++){
       (MASTERddarray.get(ide)).Paintcord(g);
    }
   
    System.out.println(MASTERddarray.size());  // FLAG
   
   
    if(MASTERddarray.size() > 2){
        DrawData tama = MASTERddarray.get(MASTERddarray.size()-1);
        int tamaño = tama.RECx1.size();
       // g.fillOval(tama.RECx1.get(tamaño-1), tama.RECy1.get(tamaño-1), 60, 60);
    }//if
   
   
   
   
   
  }//paintComponent

          //HH System.out.println("SAVETHEQUEEN");
  // borrar int opIndex;
  //void setOpIndex(int i) {
    //    opIndex = i;
    //}
  /**
   * Desplega panel para elejir ruta y
   * Renderiza y guarda dibujo como imagen JPG
   */
public void SaveImage() {
    
             /* Save the filtered image in the selected format.
              * The selected item will be the name of the format to use
              */
            
             /* Use the format name to initialise the file suffix.
              * Format names typically correspond to suffixes
              */
             File saveFile = new File("savedimage.jpg");
             JFileChooser chooser = new JFileChooser();
             
             chooser.setSelectedFile(saveFile);
             chooser.showSaveDialog(this);
                      
             
                 saveFile = chooser.getSelectedFile();
                 /* Write the filtered image in the selected format,
                  * to the file chosen by the user.
                  */
                 try {
                     ImageIO.write(createImage(this), "jpg", saveFile);
                 } catch (IOException ex) {}//ImageIO.write(biFiltered, format, saveFile);

                 
             }
            

// ATENTION: USABA g ENVEZ DE g2d !!!!!!!!!!!!!!!!!!!!!!!!!!!!!! ERROR FIXED ????

/**
 * Convierte el panel de dibujo a imagen
 * @param panel panel para convertir a imagen
 * @return 
 */
public BufferedImage createImage(JPanel panel) {

    panel.invalidate();
    panel.setIgnoreRepaint(true);
    int w = panel.getWidth();
    int h = panel.getHeight();
    BufferedImage bi = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
    Graphics2D g2d = bi.createGraphics();
    panel.paint(g2d);
    g2d.dispose();
    return bi;
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
   * inicializa g
   */
  public void setUpDrawingGraphics()
  {
    g = getGraphics();
  }

  /**
   * funcion en desuso
   * @return BufferedImage
   */
    private BufferedImage getMyImage() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    
    
    
    
    
  // INNER CLASS
    
    /**
     * Clase para escuchar al MOUSE
     */
  private class MyMouseHandler extends MouseAdapter
  { 
      
      
    
      
      DrawData grab;
      
    public void mousePressed( MouseEvent e )
    { MOUSESTATE = 1;
      x1 = e.getX();  cx = x1; ux = cx;   //OJO AQUI
      y1 = e.getY();  cy = y1; uy = cy;

      System.out.println("Presionado en " + x1 + " Y: " + y1);

     setUpDrawingGraphics(); 

      x2=x1;
      y2=y1;
      
     if(MODE==0 || MODE == 25 || MODE == 22){ grab = new DrawData();
      MASTERddarray.add(grab);
      }//0
     
     sele.showSelector(getGraphics());
     umlselector.showSelector(getGraphics());       //no lo creo necesario peroooo....
     
     if(0 < MODE  &&  MODE < 9){umlAD.setPoint(); }    //error capsioso tenia doble } y no la vi
     if( MODE == 10){umlCBH.createClassBox();}
     if( MODE == 14 || MODE == 15){umlCBH.UMLsetoedit();}          //Modo 14 : clickea algun punto
     if( MODE == 15){repaint();}
     
    }

    public void mouseDragged( MouseEvent e ){
       MOUSESTATE = 2;
        x1 = e.getX();
        y1 = e.getY(); 
      if(MODE == 0){ //0  
        
      
      grab.RECcord(x1, y1, x2, y2, tarro, 0);
      
      
      
      g.setColor(tarro);
      g.drawLine(x1,y1,x2,y2);
      
      
     
            //vhs mode
      // g.fillOval(x1, y1, 50, 50);
     // g.drawRect(x1,y1,Rint(0,50),Rint(0,50));
     
     
     // g.drawImage(i2.getImage(),x1,y1,20,Rint(0,40),null);
      
      
      }//0
      
      if(MODE == 25){
         grab.RECcord(x1, y1, x2, y2, tarro, 25);
         g.drawLine(x1,y1,x2,y2);
        
         MULTICOLOR(g);
  
         
      
      }
      
      if(MODE == 22){
          
         grab.RECcord(x1, y1, x2, y2, tarro, 22);
          
         g.setColor(tarro);
         g.drawLine(x1, y1, x2, y2);
          g.drawLine(x1+1, y1+1, x2+1, y2+1); g.setColor(Color.red);
      g.drawLine(x1+2, y1+2, x2+2, y2+2);  g.setColor(Color.orange);
      g.drawLine(x1+3, y1+3, x2+3, y2+3);  g.setColor(Color.yellow);
      g.drawLine(x1+4, y1+4, x2+4, y2+4);  g.setColor(Color.blue);

         
         
         
          
          
          
      }
      
      
      if(MODE == 60){
       
        repaint();
      //if(x1>ux){ux=x1;}
      //if(y1>uy){uy=y1;}
      ux = x1;
      uy = y1;
       
     
        
          
      }//60
      
      
      
      
      
      
      
      x2 = x1;
      y2 = y1;
    }//dragged
    
    
    public void mouseReleased(MouseEvent e){ kin = new key();
    MOUSESTATE = 3;
    
    fx = e.getX();
    fy = e.getY();
    
    sele.showSelector(getGraphics());
    
    umlselector.showSelector(getGraphics());         //deberas que selector automaticamente detecta cuando le toca.
    
    
    
    
    }
    
    public void mouseMoved(MouseEvent e){
        MOUSESTATE = 4;
        
        mx = e.getX();
        my = e.getY();
        
        if(0 < MODE  &&  MODE < 12){umlAD.UMLliveshow(g, este); umlCBH.UMLliveshow(g, este);  }  //
        
        
    }
    
    
    
    
    
    
  }
}