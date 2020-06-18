import java.io.*;
import java.lang.*;
import java.util.*;
public class MovieMagic
{
   static String title;
   static int year;
   static float rating;
   MovieMagic ()
{
       title=" ";
       year=0;
       rating=0f;
}
   void accept()
{
        System.out.println("enter the title,year and rating of a movie");
        Scanner ss=new Scanner (System.in);
        try{
        title=ss.nextLine();
        year=ss.nextInt();
        rating=ss.nextFloat();
    }
    catch(Exception e)
    {
        System.out.println("thu,manners illa,correct order alli enter madu gubald,thikka thinbeda");
    }
}
    void display()
{
    if (rating>=0.0  && rating <=2.0)
    {
        System.out.println("FLOP");
    }
    if (rating>=2.1 && rating <=3.4)
    {
        System.out.println(" SEMI HIT");
    }
    if(rating >=3.5 && rating<=4.5 )
    {
        System.out.println("HIT");
    }
    if(rating>=4.6 && rating <=5.0)
    {
        System.out.println("SUPER HIT");
    }
}
public static void main () throws ArithmeticException
{
    MovieMagic m1=new MovieMagic ();
    m1.accept();
    m1.display();
}
}
    
        