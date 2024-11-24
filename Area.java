
import java.util.*;

class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle r = new Rectangle();
        System.out.println("Enter length and breadth of the rectangle");
        int len = sc.nextInt();
        int bre = sc.nextInt();
        int area = r.getArea(len, bre);
        System.out.println("Area = " + area);
        sc.close();

    }

}

class Rectangle {
    public int getArea(int l, int b) {
        return (l * b);
    }

}
