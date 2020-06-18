import java.util.*;
public class cha
{
    public static void main ()
    {
        System.out.println("enter string:");
        Scanner ss=new Scanner (System.in);
        String s=ss.nextLine();
        int len=s.length(); 
        String d=s.toUpperCase();
        int count=0;int i,j;
        for( i=0;i<len;i++)
        {           
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z')
            {                        
            for( j=0;j<len;j++)
            {
                char c=d.charAt(j);
                if(c=='A')
                {
                    count ++;
                }
            }
            System.out.println(count);
        }
        }
    }
}      