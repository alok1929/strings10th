import java.util.*;
public class rs
{
    public static void main ()
    {
        System.out.println("enter string");
        Scanner ss=new Scanner (System.in);
        String a,b="";
        a=ss.nextLine();
        int len=a.length();
        for(int i=len-1;i>=0;i--)
        {
            b=b+a.charAt(i);
        }
        System.out.println(b);
    }
}