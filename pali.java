import java.util.*;
public class pali
{
    public static void main ()
    {
        System.out.println("enter string");
        Scanner ss=new Scanner (System.in);
        String a ,b="";
        a=ss.nextLine();
        int n=a.length();
        for (int i=n-1;i>=0;i--)
        {
            b=b + a.charAt(i);
        }
        if(a.equalsIgnoreCase(b))
        {
            System.out.println("palindrome it is");
        }
        else
        {
            System.out.println("not a palindrome");
        }
    }
}
        