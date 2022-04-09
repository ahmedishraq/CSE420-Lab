
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

/**
 *
 * @author Roman
 */

public class lab02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input: ");

        int input = scan.nextInt();

        String st[] = new String[input];

        int errorChecks = 0;

        Stack<Integer> lineNumEmail = new Stack<Integer>();
        Stack<Integer> lineNumWeb = new Stack<Integer>();

        for (int a = 0; a < input; a++) {
            // Inserting a integer for lines of strings
            st[a] = scan.next();
        }

        System.out.println();
        System.out.println("Output: ");

        for (int b = 0; b < input; b++) {
            // Detecting website line
            if (st[b].startsWith("www.") && st[b].endsWith(".com")) {
                String[] inspect = st[b].split("\\.");

                char[] asc = inspect[1].toCharArray();

                for (int index = 0; index < asc.length; index++) {
                    int a = (int) asc[index];

                    if ((a >= 65 && a <= 90) || (a >= 97 && a <= 122) || (a >= 48 && a <= 57)) {
                    } else {
                        errorChecks++;
                    }
                }

                if (errorChecks == 0) {
                    lineNumWeb.push(b);

                } else {
                    errorChecks = 0;

                }
            }
            // Detecting Email line
            else if (st[b].contains("@") && st[b].endsWith(".com")) {
                lineNumEmail.push(b);
            }

            else {
                System.out.println("Invalid");
            }
        }

        for (int count = 0; count <= lineNumEmail.size(); count++) {
            System.out.println("Email, " + (lineNumEmail.pop() + 1));
        }

        for (int count = 0; count <= lineNumWeb.size(); count++) {
            System.out.println("Web, " + (lineNumWeb.pop() + 1));
        }

    }
}