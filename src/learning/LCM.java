package learning;

import java.util.Scanner;

class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The First Number :");
        int n1 = sc.nextInt();
        System.out.print("Enter the Second Number :");
        int n2 = sc.nextInt();

        int lcm = lcmOfTwoNumbers(n1, n2, 1);
        System.out.println("LCM of " + n1 + " and " + n2 + " is: " + lcm);
    }

    public static int lcmOfTwoNumbers(int n1, int n2, int i) {

        if (i % n1 == 0 && i % n2 == 0) {
            return i;
        } else {
            return lcmOfTwoNumbers(n1, n2, i + 1);
        }
    }
}
