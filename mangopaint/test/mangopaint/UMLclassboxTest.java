/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package mangopaint;

import DrawKeepers.UMLclassbox;
import java.awt.Graphics;
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
public class UMLclassboxTest {
    
    public UMLclassboxTest() {
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
     * Test of showclassbox method, of class UMLclassbox.
     */
    @Test
    public void testShowclassbox() {
        System.out.println("showclassbox");
        Graphics g = null;
        UMLclassbox instance = new UMLclassbox();
        instance.showclassbox(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPointA method, of class UMLclassbox.
     */
    @Test
    public void testSetPointA() {
        System.out.println("setPointA");
        int h = 0;
        int v = 0;
        UMLclassbox instance = new UMLclassbox();
        instance.setPointA(h, v);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPointB method, of class UMLclassbox.
     */
    @Test
    public void testSetPointB() {
        System.out.println("setPointB");
        int ha = 0;
        int va = 0;
        UMLclassbox instance = new UMLclassbox();
        instance.setPointB(ha, va);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clicking method, of class UMLclassbox.
     */
    @Test
    public void testClicking() {
        System.out.println("clicking");
        int mouseX = 0;
        int mouseY = 0;
        UMLclassbox instance = new UMLclassbox();
        int expResult = 0;
        int result = instance.clicking(mouseX, mouseY);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addChar method, of class UMLclassbox.
     */
    @Test
    public void testAddChar() {
        System.out.println("addChar");
        int zone = 0;
        int fila = 0;
        char letra = ' ';
        UMLclassbox instance = new UMLclassbox();
        instance.addChar(zone, fila, letra);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addLine method, of class UMLclassbox.
     */
    @Test
    public void testAddLine() {
        System.out.println("addLine");
        int zone = 0;
        UMLclassbox instance = new UMLclassbox();
        instance.addLine(zone);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of quitChar method, of class UMLclassbox.
     */
    @Test
    public void testQuitChar() {
        System.out.println("quitChar");
        int zone = 0;
        int fila = 0;
        UMLclassbox instance = new UMLclassbox();
        instance.quitChar(zone, fila);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRows method, of class UMLclassbox.
     */
    @Test
    public void testGetRows() {
        System.out.println("getRows");
        int zone = 0;
        UMLclassbox instance = new UMLclassbox();
        int expResult = 0;
        int result = instance.getRows(zone);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of correCB method, of class UMLclassbox.
     */
    @Test
    public void testCorreCB() {
        System.out.println("correCB");
        int dix = 0;
        int diy = 0;
        int refx = 0;
        int refy = 0;
        int refxa = 0;
        int refya = 0;
        UMLclassbox instance = new UMLclassbox();
        instance.correCB(dix, diy, refx, refy, refxa, refya);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of EstoyDentro method, of class UMLclassbox.
     */
    @Test
    public void testEstoyDentro() {
        System.out.println("EstoyDentro");
        int xo = 10;
        int yo = 10;
        int xi = 400;
        int yinping = 400;
        UMLclassbox instance = new UMLclassbox();
        boolean expResult = false;
        boolean result = instance.EstoyDentro(xo, yo, xi, yinping);
       // assertEquals(false, ));
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
