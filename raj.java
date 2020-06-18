import java.util.*;

    public class raj 
    {
        public static void main()
        { 
            
          String str;
          String xyz;
          Scanner sc=new  Scanner (System.in);
          System.out.println("enter the string");
          str=sc.nextLine();
          xyz=sc.nextLine();
          String s=str.concat(xyz);
          String r="weds";
          String m=s.concat(r);
          System.out.println(m);
        }
    }