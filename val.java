import java.util.*;
public class val
{
	public static void main(String[]args)
	{
		System.out.println("enter the string:");
		Scanner ss=new Scanner(System.in);
		String str=ss.nextLine();
		char m[]=str.toCharArray();
		for(int i=0;i<m.length;i++)
		System.out.println(m[i]);
	}
}