import java.util.*;
public class pat
{
    public static void main ()
    {
        System.out.println("enter string:");
        Scanner ss=new Scanner (System.in);
        String s=ss.next();
        String b="";
        int len=s.length();
        for(int i=0;i<len;i++)
        {
            b=b+s.charAt(i);
            System.out.print(b);
            System.out.println();
        }
    }
}