import java.util.*;
class Palindrome2 {
    public static void main (String[] args)
    {
        check c = new check();
        c.setData();
        boolean res = c.isPalindrome();
        if (res==true)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not palindrome");

        }
    }
    
    
}

class check 
{
    private int num;
    public void setData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        num = sc.nextInt();
        sc.close();
    }

    public boolean isPalindrome()
    { 
        int org =num;
        int rev = 0;
        
        while (num != 0) { // Correct loop syntax
            int ext = num % 10; // Extract last digit
            rev = rev * 10 + ext; // Append digit to reversed number
            num = num / 10; // Remove last digit
        }
        
        return rev == org;
    }
}
