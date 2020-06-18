


import java.util.*;
public class spac
{
    public static void main ()
 
    
    {
        System.out.println("enter string");
        Scanner ss=new Scanner(System.in);
        String s=ss.next();//alok ada al
        String r=s.toUpperCase();
        int len=s.length();
        char w=' ';int ws=0,m;
        int k=0;
        for(int i=0;i<len;i++)
        {
            char cha=r.charAt(i);
            if(cha>='B' && cha<='Z')
            {
                continue;
            }
            else
            {
                k++;
            }            
                 m=r.indexOf(' ');                
               try{
               int q=r.indexOf(m-1);
                     String sma=r.substring(q);
                     String ma=sma.toUpperCase();
                    
                for(int j=0;j<len;j++)                
                {
                   char ch=ma.charAt(0);
                   if(cha=='A')
            {
                k++;
            }
           
        }
    }

   catch(Exception e)
   {
       System.out.print("");
}
System.out.println(k);
}
}
}



    
                    
                    
                    
        
        