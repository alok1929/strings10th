import java.util.*;
public class man
{
    public static void main()
    {
        System.out.println("enter a string");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int len=s.length();
        for(int i=0;i<len;i++)
        {char ch=s.charAt(i);
         if(Character.isLowerCase(ch))
         {
             System.out.print(Character.toUpperCase(ch));
            }else
            {System.out.print(Character.toLowerCase(ch));
            }
        }
    }
}