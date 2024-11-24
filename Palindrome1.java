import java.util.*;
class Palindrome1 {
    public static void main (String[] args)
    {
        StringCheck c = new StringCheck();
        c.setData();
        boolean res = c.isPalindrome();
        if (res == true)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println(" Not Palindrome");

        }
    }
    
}

class StringCheck
{
    private String str;
    public void setData()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a sentence");
        str = sc.nextLine();
        
    }

    public boolean isPalindrome()
    {
        String rev = "";
        for(int i = str.length()-1;i>=0;i--)
        {
            char ext = str.charAt(i);
            rev = rev + ext;
        }
        if (rev.equalsIgnoreCase(str))
         {
            return(true);
            
        }else
        {
            return(false);

        }
    }
}
