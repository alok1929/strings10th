import java.util.*;
public class seriousprog
{
    public static void main ()
    {
        System.out.println("enter string:");
        Scanner ss=new Scanner(System.in);
        String s=ss.nextLine();String m="alok";
        int len=s.length();
        if(s.charAt(0)=='p'||s.charAt(0)=='P'||s.charAt(0)=='v'||s.charAt(0)=='V'||s.charAt(0)=='s'||s.charAt(0)=='S')
        {
            System.out.println("tunne tinnu");
        }
        if((s).equalsIgnoreCase(m))
        {
            System.out.println("the name is just as handsome as the person");
        }
        
        }
    }