package DefiningClasses.OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> allPeople = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {

            String[] tokens = scanner.nextLine().split("\\s+");

            String personName = tokens[0];
            int personAge = Integer.parseInt(tokens[1]);

            Person person = new Person(personName, personAge);

            allPeople.add(person);
        }


        for (int i = 0; i < allPeople.size(); i++) {

            if (allPeople.get(i).getAge() >= 30) {


                //da sortiram imenata vuv vuzhodqsht red

                System.out.println(allPeople.get(i));
            }
        }
    }
}
