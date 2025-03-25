package learning;

import java.util.Scanner;

public class LCM2WhileLoop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The First Number :");
        int n1 = sc.nextInt();
        System.out.print("Enter the Second Number :");
        int n2 = sc.nextInt();
        
        int lcm = 0, i =1;;

        while (true) {
            if (i % n1 == 0 && i % n2 == 0) {
                lcm = i;
                break; 
            }
            i++; 
        }

        System.out.println("LCM of " + n1 + " and " + n2 + " is: " + lcm);
    }
}
