import java.util.*;
public class adla
{
    public static void main()
    {
        System.out.println("enter string:");
        Scanner ss=new Scanner (System.in);
        String s=ss.nextLine();
        int len=s.length();
        for(int i=0;i<len;i++)
        {
            char ch=s.charAt(i);
            if(Character.isUpperCase(ch))
            {
                System.out.println("uppercase letter");
            }
            if(Character.isLowerCase(ch))
            {
                System.out.println("lowercase letter");
            }            
        }
    }
}