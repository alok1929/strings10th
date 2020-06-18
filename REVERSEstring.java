import java.util.*;
public class REVERSEstring
{
    public static void main ()
    {
        System.out.print("enter string to be reversed:");
        Scanner ss=new Scanner (System.in);
        String a=ss.nextLine();
        String b="";
        int n=a.length();
        for(int i=n-1;i>=0;i--)
        {
            b=b + a.charAt(i);
        }
        System.out.println(b);
    }
}