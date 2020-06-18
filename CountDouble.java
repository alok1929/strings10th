 import java.util.*;
public class CountDouble
{
public static void main()
{
Scanner ss = new Scanner(System.in);
int i,c=0,l;
System.out.println("Enter a string:");
String str = ss.nextLine();
String str1 = str.toUpperCase();
l = str.length();
char ch1,ch2;
for(i=0;i<l-1;i++)
{
  ch1 = str1.charAt(i);
ch2 = str1.charAt(i+1);

if(ch1==ch2)
{
c++;
}
}
System.out.println("Total number of double numbers: " +c);
}
}