/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Point {

    // attribute
    private double x;
    private double y;

    // operation
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distance(Point point) {
        return Math.sqrt((this.x - point.x) * (this.x - point.x)
                + (this.y - point.y) * (this.y - point.y));
    }

    public double squaredDistance(Point point) {
        return (this.x - point.x) * (this.x - point.x) + (this.y - point.y) * (this.y - point.y);
    }

}
