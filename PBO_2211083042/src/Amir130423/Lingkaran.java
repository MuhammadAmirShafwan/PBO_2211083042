/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Amir130423;

/**
 *
 * @author ASUS iD
 */
public class Lingkaran implements Relation {
    private double x1;
    private double x2;
    private double y1;
    private double y2;
    
    public Lingkaran (){
    
    }
    public Lingkaran(double x1) {
        this.x1 = x1;
    }
    public double getLength() {
        double luas = (3.14*x1*x1);
        return luas;
    }

    public boolean isGreater(Object a, Object b) {
        double aLen = ((Lingkaran) a).getLength();
        double bLen = ((Lingkaran) b).getLength();
        return (aLen > bLen);
    }

    public boolean isLess(Object a, Object b) {
        double aLen = ((Lingkaran) a).getLength();
        double bLen = ((Lingkaran) b).getLength();
        return (aLen < bLen);

    }

    public boolean isEqual(Object a, Object b) {
        double aLen = ((Lingkaran) a).getLength();
        double bLen = ((Lingkaran) b).getLength();
        return (aLen == bLen);
    }
}
