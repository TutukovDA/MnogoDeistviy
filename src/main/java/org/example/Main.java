package org.example;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Vvedite pervoe chislo: ");
        int num1 = in.nextInt();
        System.out.print("Vvedite vtoroe chislo: ");
        int num2 = in.nextInt();

        System.out.println(num1 + "X" + num2 + "=" + num1 * num2);

        System.out.println(num1 + "-" + num1 + "=" + (num1 - num2));

        System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));

        int b = (num1 % num2);

        if (b > 0) {
            System.out.println(num1 + "/" + num2 + "=" + (num1 / num2) + " ostatok " + (num1 % num2));
        }
        System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
    }
}
