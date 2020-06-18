import java.util.*;
public class tofindasciiword
{
    public static void main ()
    {
        System.out.println("enter string");
        Scanner ss=new Scanner (System.in);
        String s=ss.nextLine();
        int len=s.length();
        for(int i=0;i<len;i++)
        {
            char ch=s.charAt(i);
            int m=(int)ch;
            System.out.println(ch + "= " + m);
        }
    }
}