/*
You are given the radius of n circles. Write a program that finds the largest radius and counts how many circles have that radius.
Input
The first line contains a positive integer n, the number of circles. The second line contains n radius.
Output
Print the largest radius and the number of circles with that radius.
Example
Input
8
5 8 9 7 9 5 1 2
Output
9 - 2

 */
import java.util.Scanner;
public class Task1 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int largestRadius = scanner.nextInt();
        int count = 1;
        for (int i = 1; i < n; i++) {
            int radius = scanner.nextInt();

            if (radius > largestRadius) {
                largestRadius = radius;
                count = 1;
            } else if (radius == largestRadius) {
                count++;
            }
        }
        System.out.println(largestRadius + " - " + count);
        scanner.close();
    }
}
