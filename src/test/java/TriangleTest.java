/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Admin
 */
public class TriangleTest {
    
    public TriangleTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    
    /**
     * Test of perimeter method, of class Triangle.
     */
    @Test
    public void testPerimeter() {
        Point a = new Point(1, 1);
        Point b = new Point(1, 4);
        Point c = new Point(6, 1);
        Triangle triangle = new Triangle(a, b, c);
        double expResult = 12;
        double result = triangle.perimeter();
        assertEquals(expResult, result);
    }

    /**
     * Test of type method, of class Triangle.
     */
    @Test
    public void testType() {
        Point a = new Point(1, 1);
        Point b = new Point(1, 4);
        Point c = new Point(6, 1);
        Triangle triangle = new Triangle(a, b, c);
        String expResult = "Day la tam giac vuong";
        assertEquals(expResult, triangle.type());
    }
    
}
