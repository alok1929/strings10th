public class chrome
{
    public static void main ()
    {
        
try {
    Process p = Runtime.getRuntime().exec("\"/Program Files/Google/Chrome/Application/chrome.exe\"");
    p.waitFor();
    System.out.println("Google Chrome launched!");
} catch (Exception e) {
    e.printStackTrace();
}
}
}