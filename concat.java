import java.util.*;
public class concat
{
    public static void main ()
    {
        System.out.println("enter two strings to concatenate:");
        Scanner ss=new Scanner (System.in);
        String s1=new String ();
        String s2=new String ();
        s1=ss.nextLine();
        s2=ss.nextLine();
        String s3=s1.concat(s2);
        System.out.println(s3);
    }
}