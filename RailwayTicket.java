import java.util.*;
public class RailwayTicket {
    String name, coach;
    long mobno;
    int amt, totalamt;

    void accept(String name, String coach, int amt, long mobno) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name:");
        name = sc.nextLine();
        System.out.println("enter coach name:");
        coach = sc.nextLine();
        System.out.println("enter amount:");
    }
}

