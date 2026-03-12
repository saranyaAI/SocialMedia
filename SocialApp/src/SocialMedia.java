import java.util.HashMap;
import java.util.Scanner;

public class SocialMedia {

    public static void main(String[] args) {

        HashMap<String, Integer> gamers = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        // Existing gamer usernames
        gamers.put("DragonSlayer", 201);
        gamers.put("ShadowNinja", 202);
        gamers.put("ProGamer", 203);

        System.out.print("Enter gamer username: ");
        String username = sc.nextLine();

        if (gamers.containsKey(username)) {

            System.out.println("Username '" + username + "' is already taken.");

            // Suggestions
            System.out.println("Suggested gamer tags:");
            System.out.println(username + "99");
            System.out.println(username + "X");
            System.out.println("Pro_" + username);
            System.out.println(username + "_Gaming");

        } else {

            gamers.put(username, gamers.size() + 200);
            System.out.println("Gamer username '" + username + "' registered successfully!");
        }

        sc.close();
    }
}