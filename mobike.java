import java.util.*;
public class mobike
{
    static int bno;
    static long pno;
    static String name;
    static int days;
    static int charge;
    void input()
    {
        System.out.println("bike number,phone number,name ,number of days");
        Scanner ss=new Scanner (System.in);
        bno=ss.nextInt();
        pno=ss.nextLong();
        name=ss.next();
        days=ss.nextInt();
    }
    void compute()
    {
        if(days>=0 && days<=5 )
        {
            charge=500;
        }
        if(days>5 && days<=10)
        {
            charge=500+400;
        }
        if(days>10)
        {
            charge=500+400+200;
        }
    }
        void display()
        {
            System.out.println("bike number:" + bno);
            System.out.println("phone number:" + pno);
            System.out.println("number of days:" + days);
            System.out.println(" total charge:" + charge);
        }
        public static void main()
        {
            mobike m1=new mobike();
        
            m1.input();
            m1.compute();
            m1.display();
        }
    }
    
        