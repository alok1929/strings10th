import java.util.*;
public class tofindASCII
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the character");
        String s=sc.next();
        char ch=s.charAt(0);
        int i=(int)(ch);
         System.out.println(i);
        }
    }