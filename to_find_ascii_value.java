import java.util.*;
public class to_find_ascii_value
{
    public static void main ()
    {
        Scanner ss=new Scanner (System.in);
          System.out.println("enter string :");
            String s=ss.nextLine();
          int len=s.length();
          while(len!=0)
           for(int i=0;i<len;i++)
          {
       
           char newc=s.charAt(i);
           int newd=(char)newc;
           System.out.println(newd);
            String exit="exit";
        
               if(s.equalsIgnoreCase(exit))
              {
                System.out.println("bye");
                break;
            }
    
    else{
        s=ss.nextLine();
        if(s.equals(exit))
        {
            break;
        }
    }
}
}
}






