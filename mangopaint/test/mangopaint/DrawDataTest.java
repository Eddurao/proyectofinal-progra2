/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package mangopaint;

import DrawKeepers.DrawData;
import java.awt.Color;
import java.awt.Graphics;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eparr
 */
public class DrawDataTest extends TestCase {
    
    private DrawData trazo;
    
    public void escenario(){
        trazo = new DrawData();
        //se creara un trazo muy grando dentro de los puntos
        // X entre 100 y 800 
        // y ente 50 y 300
        int ax;
        int ay;
        int bx;
        int by;
        
        
        
        for(int i = 0; i<999999999 ; i++){
            
            ax = trazo.Rint(100, 800);
            ay = trazo.Rint(50, 300);
            bx = trazo.Rint(100, 800);
            by = trazo.Rint(50, 300);
            
            
            
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
    public DrawDataTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of RECcord method, of class DrawData.
     */
    @Test
    public void testRECcord() {
        System.out.println("RECcord");
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        Color color = null;
        int pincel = 0;
        DrawData instance = new DrawData();
        instance.RECcord(x1, y1, x2, y2, color, pincel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Paintcord method, of class DrawData.
     */
    @Test
    public void testPaintcord() {
        System.out.println("Paintcord");
        Graphics g = null;
        DrawData instance = new DrawData();
        instance.Paintcord(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

   
    
     /**
     * Test of estoyDentro method, of class DrawData.
     */
    @Test
    public void testEstoyDentro() {
        escenario();
        System.out.println("estoyDentro");
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        DrawData instance = new DrawData();
        boolean expResult = false;
        boolean result = instance.estoyDentro(x1, y1, x2, y2);
       // assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
        assertTrue(trazo.estoyDentro(100, 800, 50, 300) == true);
        //Aqui se comprueba con un trazo de 999999999 puntos
    }
    
    
    
    
    

    /**
     * Test of tengoDentro method, of class DrawData.
     */
    @Test
    public void testTengoDentro() {
        System.out.println("tengoDentro");
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        DrawData instance = new DrawData();
        boolean expResult = false;
        boolean result = instance.tengoDentro(x1, y1, x2, y2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of correcord method, of class DrawData.
     */
    @Test
    public void testCorrecord() {
        System.out.println("correcord");
        int xd = 0;
        int yd = 0;
        DrawData copia = null;
        DrawData instance = new DrawData();
        instance.correcord(xd, yd, copia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clone method, of class DrawData.
     */
    @Test
    public void testClone() {
        System.out.println("clone");
        DrawData instance = new DrawData();
        DrawData expResult = null;
        DrawData result = instance.clone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MULTICOLOR method, of class DrawData.
     */
    @Test
    public void testMULTICOLOR() {
        System.out.println("MULTICOLOR");
        Graphics g = null;
        DrawData instance = new DrawData();
        instance.MULTICOLOR(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Rint method, of class DrawData.
     */
    @Test
    public void testRint() {
        System.out.println("Rint");
        int i = 0;
        int top = 0;
        DrawData instance = new DrawData();
        int expResult = 0;
        int result = instance.Rint(i, top);
      
        // TODO review the generated test code and remove the default call to fail.
        
    }

   
    
}
