import java.util.*;
class constructor {
    public static void main (String[] args)
    {
        Rectangle r = new Rectangle(4,5);
        double ar = r.getArea();
        double per = r.getPerimeter();
        System.out.println("Area = "+ar);
        System.out.println("Perimeter="+per);
    }
    
}
class Rectangle
{
    private double len,bre;
    public Rectangle() 
    {
        len=0;
        bre=0;
    }
    public Rectangle(double len, double bre)
    {
        this.len=len;
        this.bre=bre;
    }
    public double getArea()
    {
        return (len*bre);
    }
    public double getPerimeter()
    {
        return (2*(len+bre));
    }
}