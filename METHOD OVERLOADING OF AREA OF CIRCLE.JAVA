import java.io.*;
class Circle
{
    static final double PI=Math.PI;
    void Area(double r) {
        double A =PI * r * r;
    }
    void Area (float r) {
        double A =PI * r * r;
        System.out.println("Area of circle is:" + A);
    }
}
class GFG
{
    public static void main(String args[])
    {
        Circle obj=new Circle();
        obj.Area(5);
        obj.Area(2.5);
    }
}
