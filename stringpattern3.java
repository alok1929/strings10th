import java.util.*;
public class stringpattern3
{
    public static void main ()
    {
        System.out.println("enter string");
        Scanner ss=new Scanner (System.in);
        String s=ss.nextLine();
        int len=s.length();
        int i;
        for(i=len;i != 0;i--)
        {
            String str=s.substring(0,i);
            System.out.print(str);
            System.out.println();
        }
    }
}
    