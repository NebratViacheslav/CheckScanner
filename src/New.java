import java.util.Scanner;
public class New {
    public static String Hello() {
        String usersName2;
        Scanner in = new Scanner(System.in);
        System.out.print("Name: ");
            usersName2 = in.next();
        System.out.println("Hello user " + usersName2 + "!!!");
          return usersName2;
    }
}