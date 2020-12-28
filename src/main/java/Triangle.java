/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Triangle {

    //attribute
    private Point a;
    private Point b;
    private Point c;

    //operation
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public double perimeter() {
        double abab = this.a.squaredDistance(b);
        double bcbc = this.b.squaredDistance(c);
        double caca = this.c.squaredDistance(a);
        if (Math.sqrt(abab) < Math.sqrt(bcbc) + Math.sqrt(caca)
                && Math.sqrt(bcbc) < Math.sqrt(abab) + Math.sqrt(caca)
                && Math.sqrt(caca) < Math.sqrt(abab) + Math.sqrt(bcbc)) {
            return Math.sqrt(abab) + Math.sqrt(bcbc) + Math.sqrt(caca);
        } else {
            return 0;
        }
    }

    public String type() {
        double abab = this.a.squaredDistance(b);
        double bcbc = this.b.squaredDistance(c);
        double caca = this.c.squaredDistance(a);
        if (Math.sqrt(abab) < Math.sqrt(bcbc) + Math.sqrt(caca)
                && Math.sqrt(bcbc) < Math.sqrt(abab) + Math.sqrt(caca)
                && Math.sqrt(caca) < Math.sqrt(abab) + Math.sqrt(bcbc)) {
            if ((abab == bcbc + caca && Math.sqrt(bcbc) == Math.sqrt(caca))
                    || (bcbc == abab + caca && Math.sqrt(abab) == Math.sqrt(caca))
                    || (caca == abab + bcbc && Math.sqrt(abab) == Math.sqrt(bcbc))) {
                return "Day la tam giac vuong can";
            } else if (Math.sqrt(abab) == Math.sqrt(bcbc) && Math.sqrt(bcbc) == Math.sqrt(caca)) {
                return "Day la tam giac deu";
            } else if (abab == bcbc + caca || bcbc == abab + caca || caca == abab + bcbc) {
                return "Day la tam giac vuong";
            } else if (Math.sqrt(abab) == Math.sqrt(bcbc) || Math.sqrt(bcbc) == Math.sqrt(caca) || Math.sqrt(abab) == Math.sqrt(caca)) {
                return "Day la tam giac can";
            } else if (abab > bcbc + caca || bcbc > abab + caca || caca > abab + bcbc) {
                return "Day la tam giac tu";
            } else {
                return "Day la tam giac nhon";
            }
        } else {
            return "Day khong phai tam giac";
        }
    }
}
