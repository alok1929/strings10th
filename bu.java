import java.util.*;
public class bu
{
    public static void main ()
    {
        System.out.println("enter string");
        Scanner ss=new Scanner (System.in);
        String a,b="";
        a=ss.next();
        int len=a.length();
        for(int i=len-1;i>=0;i--)
        {
            b=b+a.charAt(i);            
        }
        if(a.equalsIgnoreCase(b))
        {
            System.out.println("it is a palindrome");
        }
        else
        {
            System.out.println("not a palindrome");
        }
    }
}