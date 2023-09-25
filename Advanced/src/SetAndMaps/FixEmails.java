package SetAndMaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<String, String> emails = new LinkedHashMap<>();

        String name = scanner.nextLine();

        while (!"stop".equals(name)) {
            String email = scanner.nextLine();
            if (!email.contains(".us") && !email.contains(".uk") && !email.contains(".com")) {
                emails.put(name, email);
            }

            name = scanner.nextLine();
        }

        emails.forEach((key,value) -> System.out.printf("%s -> %s\n", key,value));

    }

}
