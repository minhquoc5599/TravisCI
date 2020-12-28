/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class main {
    public static void main(String[] args) {
        Point a = new Point(1, 1);
        Point b = new Point(2, 3);
        Point c = new Point(4, 1);
        System.out.println(a.distance(b));
        System.out.println(b.distance(c));
        System.out.println(c.distance(a));
        Triangle triangle = new Triangle(a, b, c);
        System.out.println(triangle.perimeter());
        triangle.type();
        
    }
    
}
