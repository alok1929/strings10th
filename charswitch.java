import java.util.*;
public class charswitch
{
    public static void main ()
    {
        System.out.println("enter character");
        Scanner ss=new Scanner (System.in);
        String str=ss.nextLine();
       
        switch(str)
        {
            case "hello":System.out.println("hi");
            break;
            case "exit":System.out.println("bye");
            break;
        }
    }
}
