import java.util.HashMap;
import java.util.Scanner;

public class SocialMedia {

    public static void main(String[] args) {

        HashMap<String, Integer> users = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        // Existing usernames in the system
        users.put("john_doe", 101);
        users.put("admin", 102);
        users.put("alex", 103);

        System.out.print("Enter username to check: ");
        String username = sc.nextLine();

        // Check availability
        if (users.containsKey(username)) {

            System.out.println("checkAvailability(\"" + username + "\") → false (already taken)");

            // Suggest alternatives
            System.out.println("Suggested usernames:");
            System.out.println(username + "1");
            System.out.println(username + "2");
            System.out.println(username + "123");

            String modified = username.replace('_', '.');
            System.out.println(modified);

        } else {

            System.out.println("checkAvailability(\"" + username + "\") → true (available)");
        }

        sc.close();
    }
}