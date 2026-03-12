import java.util.HashMap;
import java.util.Scanner;

public class SocialMedia{

    public static void main(String[] args) {

        HashMap<String, Integer> emails = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        // Existing email accounts
        emails.put("john@gmail.com", 1);
        emails.put("admin@gmail.com", 2);
        emails.put("alex@gmail.com", 3);

        System.out.print("Enter email address: ");
        String email = sc.nextLine();

        if (emails.containsKey(email)) {

            System.out.println("Email '" + email + "' is already registered.");

            // Suggestions
            String name = email.split("@")[0];

            System.out.println("Suggested email addresses:");
            System.out.println(name + "123@gmail.com");
            System.out.println(name + "2026@gmail.com");
            System.out.println(name + "_official@gmail.com");
            System.out.println("real_" + name + "@gmail.com");

        } else {

            emails.put(email, emails.size() + 1);
            System.out.println("Email '" + email + "' registered successfully!");
        }

        sc.close();
    }
}