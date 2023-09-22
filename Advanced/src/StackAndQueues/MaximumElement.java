package StackAndQueues;

import java.util.*;

public class MaximumElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        You have an empty sequence, and you will be given N commands. Each command is one of the
//        following types:
//
//          1 X" - Push the element X into the stack.
//•	        "2" - Delete the element present at the top of the stack.
//•	        "3" - Print the maximum element in the stack.
//
//          Input
// •	The first line of input contains an integer N, where 1 ≤ N ≤ 105.
// •	The next N lines contain commands. All commands will be valid and in the format described.
// •	The element X will be in the range 1 ≤ X ≤ 109.
// •	The type of the command will be in the range 1 ≤ Type ≤ 3.
//
//        Output
//•	        For each command of type "3", print the maximum element in the stack on a new line

        int n = Integer.parseInt(scanner.nextLine());
        Deque<Integer> stack = new ArrayDeque<>();


        for (int i = 0; i < n; i++) {

            String[] tokens = scanner.nextLine().split("\\s+");

            switch (tokens[0]) {
                case "1":
                    stack.push(Integer.parseInt(tokens[1]));
                    break;
                case "2":
                    stack.pop();
                    break;
                case "3":
                    System.out.println(Collections.max(stack));
                    break;
            }


        }


    }

}
