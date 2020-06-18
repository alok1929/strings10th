import java.util.*;
public class spalimdrome
{
    public static void main ()
    {
        System.out.print("enter the string to be tested:");
        Scanner ss=new Scanner (System.in);
        String a=ss.nextLine();
        String b="";
        int n=a.length();
        for(int i=0;i<n-1;i++)
        {
            b=a.charAt(i)+b;
        }
        if(a.equalsIgnoreCase(b))
        {
            System.out.println("String is palindrome");
        }
        else
        {
            System.out.println("String is not a palindrome");
        }
    }
}