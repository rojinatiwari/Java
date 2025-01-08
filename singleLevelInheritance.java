import java.util.*;
public class singleLevelInheritance {
        public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter length,breadth & height");
        int length= sc.nextInt();
        int breadth = sc.nextInt();
        int height= sc.nextInt();
        BedRoom b = new BedRoom ();
        b.setData(length,breadth,height);
        int res_area= b.area();
        int res_vol= b.volume();
        System.out.println("Area :"+res_area+"Volume :"+res_vol);

    }

   static class Room
    {protected int length,breadth;
        public int area()
        {
            return (length*breadth);
        }

    }

   static class BedRoom extends Room
    {
        private int height;
        public void setData(int length,int breadth,int height)
        {
            this.length=length;
            this.breadth=breadth;
            this.height=height;
        }

        public int volume()
        {
            return (area()*height);
        }
    }
    
}

    

