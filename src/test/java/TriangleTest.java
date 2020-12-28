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
public class TriangleTest {

    // tam giac vuong can
    @Test
    public void testType01() {
        System.out.println("Kiem tra phan loai tam giac vuong can");
        Point a = new Point(1, 1);
        Point b = new Point(1, 2);
        Point c = new Point(2, 1);
        Triangle triangle = new Triangle(a, b, c);
        String expResult = "Day la tam giac vuong can";
        assertEquals(expResult, triangle.classify());
    }

    @Test
    public void testPerimeter01() {
        System.out.println("Tinh chu vi tam giac vuong can");
        Point a = new Point(1, 1);
        Point b = new Point(1, 2);
        Point c = new Point(2, 1);
        Triangle triangle = new Triangle(a, b, c);
        double expResult = 2 + Math.sqrt(2);
        double result = triangle.perimeter();
        assertEquals(expResult, result);
    }
    
    // tam giac deu
    @Test
    public void testType02() {
        System.out.println("Kiem tra phan loai tam giac deu");
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(2, Math.sqrt(12));
        Triangle triangle = new Triangle(a, b, c);
        String expResult = "Day la tam giac deu";
        assertEquals(expResult, triangle.classify());
    }
    
    @Test
    public void testPerimeter02() {
        System.out.println("Tinh chu vi tam giac deu");
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(2, Math.sqrt(12));
        Triangle triangle = new Triangle(a, b, c);
        double expResult = 12;
        double result = triangle.perimeter();
        assertEquals(expResult, result);
    }
    
    // tam giac vuong
    @Test
    public void testType03() {
        System.out.println("Kiem tra phan loai tam giac vuong");
        Point a = new Point(1, 1);
        Point b = new Point(1, 4);
        Point c = new Point(5, 1);
        Triangle triangle = new Triangle(a, b, c);
        String expResult = "Day la tam giac vuong";
        assertEquals(expResult, triangle.classify());
    }
    
    @Test
    public void testPerimeter03() {
        System.out.println("Tinh chu vi tam giac vuong");
        Point a = new Point(1, 1);
        Point b = new Point(1, 4);
        Point c = new Point(5, 1);
        Triangle triangle = new Triangle(a, b, c);
        double expResult = 12;
        double result = triangle.perimeter();
        assertEquals(expResult, result);
    }
    
    // tam giac can
    @Test
    public void testType04() {
        System.out.println("Kiem tra phan loai tam giac can");
        Point a = new Point(1, 1);
        Point b = new Point(2, 3);
        Point c = new Point(3, 1);
        Triangle triangle = new Triangle(a, b, c);
        String expResult = "Day la tam giac can";
        assertEquals(expResult, triangle.classify());
    }
    
    @Test
    public void testPerimeter04() {
        System.out.println("Tinh chu vi tam giac can");
        Point a = new Point(1, 1);
        Point b = new Point(2, 3);
        Point c = new Point(3, 1);
        Triangle triangle = new Triangle(a, b, c);
        double expResult = 2 + Math.sqrt(20);
        double result = triangle.perimeter();
        assertEquals(expResult, result);
    }
    
    // tam giac tu
    @Test
    public void testType05() {
        System.out.println("Kiem tra phan loai tam giac tu");
        Point a = new Point(0, 1);
        Point b = new Point(2, 3);
        Point c = new Point(5, 1);
        Triangle triangle = new Triangle(a, b, c);
        String expResult = "Day la tam giac tu";
        assertEquals(expResult, triangle.classify());
    }
    
    @Test
    public void testPerimeter05() {
        System.out.println("Tinh chu vi tam giac tu");
        Point a = new Point(0, 1);
        Point b = new Point(2, 3);
        Point c = new Point(5, 1);
        Triangle triangle = new Triangle(a, b, c);
        double expResult =  Math.sqrt(8) + Math.sqrt(13) + 5;
        double result = triangle.perimeter();
        assertEquals(expResult, result);
    }
    
    // tam giac nhon
    @Test
    public void testType06() {
        System.out.println("Kiem tra phan loai tam giac nhon");
        Point a = new Point(1, 1);
        Point b = new Point(2, 3);
        Point c = new Point(4, 1);
        Triangle triangle = new Triangle(a, b, c);
        String expResult = "Day la tam giac nhon";
        assertEquals(expResult, triangle.classify());
    }
    
    @Test
    public void testPerimeter06() {
        System.out.println("Tinh chu vi tam giac nhon");
        Point a = new Point(1, 1);
        Point b = new Point(2, 3);
        Point c = new Point(4, 1);
        Triangle triangle = new Triangle(a, b, c);
        double expResult =  Math.sqrt(8) + Math.sqrt(5) + 3;
        double result = triangle.perimeter();
        assertEquals(expResult, result);
    }
    
    // day khong phai tam giac
    @Test
    public void testType07() {
        System.out.println("Kiem tra phan loai voi 3 diem khong tao "
                + "thanh tam giac");
        Point a = new Point(1, 1);
        Point b = new Point(2, 2);
        Point c = new Point(3, 3);
        Triangle triangle = new Triangle(a, b, c);
        String expResult = "Day khong phai tam giac";
        assertEquals(expResult, triangle.classify());
    }
    
    @Test
    public void testPerimeter07() {
        System.out.println("Tinh chu vi voi 3 diem khong tao thanh tam giac ");
        Point a = new Point(1, 1);
        Point b = new Point(2, 2);
        Point c = new Point(3, 3);
        Triangle triangle = new Triangle(a, b, c);
        double expResult =  0;
        double result = triangle.perimeter();
        assertEquals(expResult, result);
    }
    
    
    
    
    
    
    

}
