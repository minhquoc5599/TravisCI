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
public class PointTest {

    public PointTest() {
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
     * Test of getX method, of class Point.
     */
    /**
     * Test of distance method, of class Point.
     */
    @Test
    public void testDistance() {
        Point point = new Point(2, 3);
        Point instance = new Point(3, 2);
        double expResult = Math.sqrt(2);
        double result = instance.distance(point);
        assertEquals(expResult, result);
    }

    @Test
    public void testDistance1() {
        Point point = new Point(5, 3);
        Point instance = new Point(3, 2);
        double expResult = Math.sqrt(3);
        double result = instance.distance(point);
        assertEquals(expResult, result);
    }

    @Test
    public void testDistance2() {
        Point point = new Point(5.5, 3.5);
        Point instance = new Point(3, 2);
        double expResult = Math.sqrt(8.5);
        double result = instance.distance(point);
        assertEquals(expResult, result);
    }

    @Test
    public void testDistance3() {
        Point point = new Point(5.8, 3.5);
        Point instance = new Point(3, 2);
        double expResult = Math.sqrt(8.5);
        double result = instance.distance(point);
        assertEquals(expResult, result);
    }

    @Test
    public void testDistance4() {
        Point point = new Point(5.5, 3.7);
        Point instance = new Point(3.5, 2.7);
        double expResult = Math.sqrt(5);
        double result = instance.distance(point);
        assertEquals(expResult, result);
    }

    @Test
    public void testDistance5() {
        Point point = new Point(5.4, 3.7);
        Point instance = new Point(3.5, 2.7);
        double expResult = Math.sqrt(5);
        double result = instance.distance(point);
        assertEquals(expResult, result);
    }

}
