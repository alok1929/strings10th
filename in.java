import java.io.*;
import java.lang.*;
import java.util.*;
public class in
{
    public static void main ()
    {
        Scanner ss=new Scanner (System.in);
        System.out.println("name batha:");
        String s=ss.nextLine();
        int len=s.length();
        String con="alok";int attempt=0;
       for(int i=0;i<len;i++)
        {

           if(s.equalsIgnoreCase(con)){
                System.out.println("namskara anna");
                break;
            }
            
            
            else {
                System.out.println("nah");
                s=ss.next();
                attempt++;
                if(attempt==3)
                {
                    System.out.println("ur wrong,its alok");
                  
                }
                if(s.equals(con))
                {
                    System.out.println("namskara anna");
           
            break;
        }
    }
    }
}
}