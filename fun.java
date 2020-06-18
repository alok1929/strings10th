import java.util.*;
public class fun
{        
        Scanner ss=new Scanner (System.in);       
        String s=ss.nextLine();
        int len=s.length();
        String l="lahari";int k=0;String v="veman";
       String a="alok";
        
       void cal(){
        for (int i=0;i<len;i++)
        {
            char ch=s.charAt(i); 
            if(s.equalsIgnoreCase(l))
            {
                System.out.println("she awesome but she is a pain in the ass,hehe,kidding");
                k++;
            }
            if(s.equalsIgnoreCase(v)){
               System.out.println("sexxxxxxxyyyyy,lou you mama ");
               k++;
            }
            if(s.equalsIgnoreCase(a))
            {
                System.out.println("handsome boi");k++;
            }
        if(k==0)
        {
            System.out.println("oh good person");
        }
    }
}
        public static void main()
        {
            fun f1=new fun();
           
            f1.cal();
        }
}
