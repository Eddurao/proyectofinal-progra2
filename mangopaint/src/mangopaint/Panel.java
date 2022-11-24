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
import javax.swing.*;

public class Panel extends JPanel
{
  // PROPERTIES
  private final int DEFAULT_WIDTH  = 800;
  private final int DEFAULT_HEIGHT = 800;
  private final Color BACK_COLOR   = Color.WHITE;

  private int x1, y1, x2, y2;

  private MyMouseHandler handler;
  private Graphics g;

  // CONSTRUCTOR
  public Panel()
  {
    setBackground( BACK_COLOR );
    setPreferredSize( new Dimension( DEFAULT_WIDTH, DEFAULT_HEIGHT ) );

    handler  = new MyMouseHandler();

    this.addMouseListener( handler );
    this.addMouseMotionListener( handler );
  }

  // METHOD
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
  }

  private void setUpDrawingGraphics()
  {
    g = getGraphics();
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

      System.out.println("" + x1 + " Y: " + y1);  

      g.drawLine(x1,y1,x2,y2);

      x2=x1;
      y2=y1;
    }
  }
}