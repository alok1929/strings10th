import java.util.*;
public class switchstringpattern
{
    public static void main ()
    {
        System.out.println("enter string:");
        Scanner ss=new Scanner (System.in);
        String s=ss.nextLine();System.out.println("enter 1 for triangle and 2 for revrse triangle");
        int object=ss.nextInt();
        switch(object)
        {
            case 1:System.out.println("triangle");
            int len=s.length();
            for(int i=0;i<=len;i++)
            {
                String str=s.substring(0,i);
                System.out.print(str);
                System.out.println();
            }
            break;
            
            case 2:System.out.println("reverse triangle");
            len=s.length();
            for(int i=len;i!= 0;i--)
            {
                String str=s.substring(0,i);
                System.out.print(str);
                System.out.println();
            }
            break;
            default:System.out.println("ERROR");
            break;
        }
        }
    }
        
        