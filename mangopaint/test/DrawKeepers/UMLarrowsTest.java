/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package DrawKeepers;

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
public class UMLarrowsTest extends TestCase {
    
    public UMLarrows flecha = new aASO();
    
    public void escenario(){
        
        flecha.setPoint(0, 0);
        flecha.setPoint(500, 248);
        flecha.setPoint(800, 300);
        
        
        
        
        
        
    }
    
    
    public UMLarrowsTest() {
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
     * Test of showarrow method, of class UMLarrows.
     */
    @Test
    public void testShowarrow() {
        System.out.println("showarrow");
        Graphics g = null;
        UMLarrows instance = new UMLarrowsImpl();
        instance.showarrow(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPoint method, of class UMLarrows.
     */
    @Test
    public void testSetPoint() {
        System.out.println("setPoint");
        int xa = 0;
        int ya = 0;
        UMLarrows instance = new UMLarrowsImpl();
        instance.setPoint(xa, ya);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of driveCurrentPoint method, of class UMLarrows.
     */
    @Test
    public void testDriveCurrentPoint() {
        System.out.println("driveCurrentPoint");
        int an = 0;
        int ya = 0;
        UMLarrows instance = new UMLarrowsImpl();
        instance.driveCurrentPoint(an, ya);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAllPoints method, of class UMLarrows.
     */
    @Test
    public void testDeleteAllPoints() {
        System.out.println("deleteAllPoints");
        UMLarrows instance = new UMLarrowsImpl();
        instance.deleteAllPoints();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of oneDirection method, of class UMLarrows.
     */
    @Test
    public void testOneDirection() {
        System.out.println("oneDirection");
        escenario();
        System.out.println(flecha.oneDirection());
        
       assertTrue(flecha.oneDirection() == 4 );
    }

    
    
    
    
    /**
     * Test of penPointx method, of class UMLarrows.
     */
    @Test
    public void testPenPointx() {
        System.out.println("penPointx");
        int X = 0;
        UMLarrows instance = new UMLarrowsImpl();
        short expResult = 0;
        short result = instance.penPointx(X);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of penPointy method, of class UMLarrows.
     */
    @Test
    public void testPenPointy() {
        System.out.println("penPointy");
        int Y = 0;
        UMLarrows instance = new UMLarrowsImpl();
        short expResult = 0;
        short result = instance.penPointy(Y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of restaUNO method, of class UMLarrows.
     */
    @Test
    public void testRestaUNO() {
        System.out.println("restaUNO");
        UMLarrows instance = new UMLarrowsImpl();
        instance.restaUNO();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class UMLarrowsImpl extends UMLarrows {

        public void showarrow(Graphics g) {
        }
    }
    
}
