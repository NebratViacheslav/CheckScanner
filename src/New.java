import java.util.Scanner;
public class New {
    public static void Hello() {
        String usersName2;
        Scanner in = new Scanner(System.in);
        System.out.print("Name: ");
            usersName2 = in.next();
        System.out.println("Hello user " + usersName2 + "!!!");
    }
}