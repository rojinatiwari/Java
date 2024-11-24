
import java.util.*;
class Demo{
    public static void main (String [] args)
    {
        circle c = new circle();
        c.setData();
        double res = c.getArea();
        System.out.println("Area of the circle is :"+res);
    }
    
}
class circle 
{
    private double radius;
    public void setData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius");
        radius = sc.nextDouble();
        sc.close();
    }
    public double getArea()
    {
        double area = 3.14*Math.pow(radius,2);
        return (area);
    }
}
