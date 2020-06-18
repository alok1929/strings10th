import java.util.*;
public class frw
{
    public static void main ()
    {
        System.out.println("enter string:");
        Scanner ss=new Scanner (System.in);
        String s=ss.nextLine();
        int len=s.length();
        int low=0,up=0,sp=0;
        for(int i=0;i<len;i++)
        {
            char ch=s.charAt(i);
            if(Character.isUpperCase(ch))
            {
                up++;
            }
            if(Character.isLowerCase(ch))
            {
                low++;
            }
            if(ch=='!' || ch=='@' || ch=='#' || ch=='$' || ch=='%'||ch=='^'||ch=='&'||ch=='*'||ch==')')
            {
                sp++;
            }
        }
        System.out.println("uppercase " + up + "lowercase: " + low);
        System.out.println("special characters: " + sp);
        
    }}