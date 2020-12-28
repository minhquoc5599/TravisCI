/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Admin
 */
public class PointTest {
    
    private Point A = new Point(2, 3);
    private Point B = new Point(3, 2);
    
    @Test
    public void testConstructorX(){
        double x = A.getX();
        assertEquals(2, x);
    }
    
    @Test
    public void testConstructorY(){
        double x = A.getY();
        assertEquals(3, x);
    }
    
    @Test
    public void testDistance() {
        double expResult = Math.sqrt(2);
        double result = A.distance(B);
        assertEquals(expResult, result);
    }

//    @Test
//    public void testDistance1() {
//        Point point = new Point(5, 3);
//        Point instance = new Point(3, 2);
//        double expResult = Math.sqrt(3);
//        double result = instance.distance(point);
//        assertEquals(expResult, result);
//    }
//
//    @Test
//    public void testDistance2() {
//        Point point = new Point(5.5, 3.5);
//        Point instance = new Point(3, 2);
//        double expResult = Math.sqrt(8.5);
//        double result = instance.distance(point);
//        assertEquals(expResult, result);
//    }
//
//    @Test
//    public void testDistance3() {
//        Point point = new Point(5.8, 3.5);
//        Point instance = new Point(3, 2);
//        double expResult = Math.sqrt(8.5);
//        double result = instance.distance(point);
//        assertEquals(expResult, result);
//    }
//
//    @Test
//    public void testDistance4() {
//        Point point = new Point(5.5, 3.7);
//        Point instance = new Point(3.5, 2.7);
//        double expResult = Math.sqrt(5);
//        double result = instance.distance(point);
//        assertEquals(expResult, result);
//    }
//
//    @Test
//    public void testDistance5() {
//        Point point = new Point(5.4, 3.7);
//        Point instance = new Point(3.5, 2.7);
//        double expResult = Math.sqrt(5);
//        double result = instance.distance(point);
//        assertEquals(expResult, result);
//    }

}
