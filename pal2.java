import java.util.*;
public class pal2
{
    public static void main ()
    {
        System.out.println("enter string:");
        Scanner ss=new Scanner (System.in);
        String s=ss.next();
        int len=s.length();
        String b="";
        for(int i=len-1;i>=0;i--)
        {
            char ch=s.charAt(i);
            b=b+ch;
        }
        if(s.equalsIgnoreCase(b))
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not a palindrome");
            }
            }
        }