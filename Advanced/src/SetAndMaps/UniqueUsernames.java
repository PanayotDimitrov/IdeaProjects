package SetAndMaps;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Set<String> set = new LinkedHashSet<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            set.add(input);
        }

        for (String element : set) {
            System.out.println(element);
        }

    }
//    test
}
