import java.util.*;
class Odd
{
    public static void main (String [] args)
    {
        count c = new count ();
        c.setData();
        double res = c.countOddDigit();
        System.out.println("Total odd digits ="+res);
    }
    
}

class count
{private int num;
 public void setData()
 {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    num = sc.nextInt();
 } 
 
 public int countOddDigit()
 {
    int count = 0;
    while (num != 0)
    {
        int ext = num%10;
        if (ext % 2 != 0)
        {
            count ++;
        }
        num = num/10;
    }
    return (count);
 }

}
