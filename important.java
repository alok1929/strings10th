import java.util.*;
public class important
{
    public static void main () throws StringIndexOutOfBoundsException
    {
        System.out.println("enter string");
        Scanner ss=new Scanner (System.in);
        String a=ss.nextLine();
        int len=a.length();
        int i;char q;String m="";
        for(i=0;i<=len;i++)
        {
            try{
            q=a.charAt(i);
        
            if(q=='a' || q=='i' ||q=='o'||q=='u'||q=='e')
            {
                m= a.replace(a.charAt(i),'p');
               
            }
        }
        catch(Exception e)
        {
            System.out.print("");
        }
       
    }
     
     String we=m.toUpperCase();
     System.out.println("resultant string  is " +  m );
   
     
}}
