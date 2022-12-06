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
     ArrayList<Integer> REC;
     int CONTADOREC;
    
  public Graphics g;
  private final int DEFAULT_WIDTH  = 1200;
  private final int DEFAULT_HEIGHT = 600;
  private final Color BACK_COLOR   = Color.WHITE;

  private int x1, y1, x2, y2;

  public MyMouseHandler handler;
  //public Graphics g;
   
  // CONSTRUCTOR
  static Color tarro;   static boolean Multi;
  public lin(){
      CONTADOREC = 0;
     REC = new ArrayList();
      
      
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
    
   for(int id=0; id < REC.size() ;id += 2){ //Aa 
    g.drawLine((int)(REC.get(id))/10000, (REC.get(id))%10000, (int)(REC.get(id+1))/10000, (REC.get(id+1))%10000);
  
   
   }//aa
   
   }

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
    public void mousePressed( MouseEvent e )
    {
      x1 = e.getX();
      y1 = e.getY();

      System.out.println("Presionado en " + x1 + " Y: " + y1);

      setUpDrawingGraphics();

      x2=x1;
      y2=y1;
    }

    public void mouseDragged( MouseEvent e )
    {
      x1 = e.getX();
      y1 = e.getY();        
      REC.add(x1*10000 + y1);  REC.add(x2*10000 + y2);
      System.out.println("" + x1 + " Y: " + y1);  
      
      g.setColor(tarro);
      g.drawLine(x1,y1,x2,y2);
      g.fillOval(x1, y1, 50, 50);
     // g.drawRect(x1,y1,Rint(0,50),Rint(0,50));
     
     
     // g.drawImage(i2.getImage(),x1,y1,20,Rint(0,40),null);
      if(Multi){LGBT();}
      x2=x1;
      y2=y1;
     
      
    }
  }
}