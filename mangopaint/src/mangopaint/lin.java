/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mangopaint;

/**
 *
 */ // @author eparr
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


public class lin extends JPanel    //lin for LIENZO
{
  // PROPERTIES 
       //drawea botones
    
    
    
     int CONTADOREC;
    
   
     int cx,cy,T,ux,uy;
  public Graphics g;
  public static byte MODE;
  private final int DEFAULT_WIDTH  = 1200;
  private final int DEFAULT_HEIGHT = 600;
  private final Color BACK_COLOR   = Color.WHITE;

  private int x1, y1, x2, y2;

  public ArrayList<DrawData> MASTERddarray;
  
  public MyMouseHandler handler;
  //public Graphics g;
   
  // CONSTRUCTOR
  static Color tarro;   static boolean Multi;
  public lin(){
      
      MODE = -1; T=0;
     MASTERddarray = new ArrayList<>();
     
      CONTADOREC = 0; 
     
      
                                                   
      Multi = false;
    setBackground( BACK_COLOR ); //
    setPreferredSize( new Dimension( DEFAULT_WIDTH, DEFAULT_HEIGHT ) );

    handler  = new MyMouseHandler();

    this.addMouseListener( handler );
    this.addMouseMotionListener( handler );
  }

  // METHOD
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    
    if(MODE == 60){g.drawRect(cx, cy,ux-cx, uy-cy); g.drawRect(cx+1, cy+1,ux-cx, uy-cy);}
    
   
   for(int ide =0; ide < MASTERddarray.size() ; ide++){
       
       (MASTERddarray.get(ide)).Paintcord(g);
   }
   
  
      System.out.println(MASTERddarray.size());
   
   
   if(MASTERddarray.size() > 2){
       DrawData tama = MASTERddarray.get(MASTERddarray.size()-1);
       int tamaño = tama.RECx1.size();
       
       
       
       
       
       g.fillOval(tama.RECx1.get(tamaño-1), tama.RECy1.get(tamaño-1), 60, 60);
       
       
       
       
   }//if
   
   
   
   
   
   }//

          //HH System.out.println("SAVETHEQUEEN");
  int opIndex;
  void setOpIndex(int i) {
        opIndex = i;
    }
  
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
            

public BufferedImage createImage(JPanel panel) {

    panel.invalidate();
    panel.setIgnoreRepaint(true);
    int w = panel.getWidth();
    int h = panel.getHeight();
    BufferedImage bi = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
    Graphics2D g = bi.createGraphics();
    panel.paint(g);
    g.dispose();
    return bi;
}
     











  
  
           //HH
  
  
  public int Rint(int i, int top){
      
      int diff = top - i;
     int R = (int)(i + Math. random()*diff+1);
      
      return(R);
      
  }
  
  
  public void LGBT(){
      switch(Rint(0,7)){
          case 1: tarro=Color.red; break;
          case 2: tarro=Color.orange; break;
          case 3: tarro=Color.yellow; break;
          case 4: tarro=Color.green; break;
          case 5: tarro=Color.blue; break;
          case 6: tarro=Color.magenta; break;
          
          
          
          
      }
      
      
  }
  
  
  
  
  
  
  
  private void setUpDrawingGraphics()
  {
    g = getGraphics();
  }

    private BufferedImage getMyImage() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  // INNER CLASS
  private class MyMouseHandler extends MouseAdapter
  { 
      
      
 
      
      DrawData grab;
      
    public void mousePressed( MouseEvent e )
    {
      x1 = e.getX();  cx = x1; ux = cx;
      y1 = e.getY();  cy = y1; uy = cy;

      System.out.println("Presionado en " + x1 + " Y: " + y1);

      setUpDrawingGraphics();

      x2=x1;
      y2=y1;
      
     if(MODE==0){ grab = new DrawData();
      MASTERddarray.add(grab);
      }//0
     
    }

    public void mouseDragged( MouseEvent e ){
       x1 = e.getX();
        y1 = e.getY(); 
      if(MODE == 0){ //0  
        
      
      grab.RECcord(x1, y1, x2, y2, tarro);
      
      System.out.println("" + x1 + " Y: " + y1);  
      
      g.setColor(tarro);
      g.drawLine(x1,y1,x2,y2);
      
      
      g.drawLine(x1+1, y1+1, x2+1, y2+1); g.setColor(Color.red);
      g.drawLine(x1+2, y1+2, x2+2, y2+2);  g.setColor(Color.orange);
      g.drawLine(x1+3, y1+3, x2+3, y2+3);  g.setColor(Color.yellow);
      g.drawLine(x1+4, y1+4, x2+4, y2+4);  g.setColor(Color.blue);
            //vhs mode
      // g.fillOval(x1, y1, 50, 50);
     // g.drawRect(x1,y1,Rint(0,50),Rint(0,50));
     
     
     // g.drawImage(i2.getImage(),x1,y1,20,Rint(0,40),null);
      if(Multi){LGBT();}
      
      }//0
      
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
  }
}