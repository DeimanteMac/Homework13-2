/*
Task 2. Residents on a Street
There are n houses on a street, numbered from 1 to n. Houses with odd numbers are on the left side of the street, and houses with even numbers are on the right side.

Write a program that calculates and prints:

The total number of residents on the street.

The number of residents on each side of the street.

The average number of residents per house on each side of the street.

First, read all the input data into an array or arrays. Perform the calculations using the stored data.

Input
The first line contains a positive integer n, the number of houses. Each of the following n lines contains the number of residents in the corresponding house, in house-number order.

Output
Print the requested totals and averages. If there are no houses on one side of the street, print N/A for the average on that side.

Example
Input

5
2
4
3
6
7
Output

Total residents: 22
Residents on the left: 12
Residents on the right: 10
Average per house on the left: 4
Average per house on the right: 5


*/
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] residents = new int[n];

        for (int i = 0; i < n; i++) {
            residents[i] = scanner.nextInt();
        }
        int totalResidents = 0;
        int leftResidents = 0;
        int rightResidents = 0;
        int leftHouses = 0;
        int rightHouses = 0;

        for (int i = 0; i < n; i++) {
            totalResidents += residents[i];

            if (i % 2 == 0) {
                leftResidents += residents[i];
                leftHouses++;
            } else {
                rightResidents += residents[i];
                rightHouses++;
            }
        }
        System.out.println("Total residents: " + totalResidents);
        System.out.println("Residents on the left: " + leftResidents);
        System.out.println("Residents on the right: " + rightResidents);

        if (leftHouses == 0) {
            System.out.println("Average per house on the left: N/A");
        } else {
            double leftAverage = (double) leftResidents / leftHouses;
            System.out.println("Average per house on the left: " + leftAverage);
        }

        if (rightHouses == 0) {
            System.out.println("Average per house on the right: N/A");
        } else {
            double rightAverage = (double) rightResidents / rightHouses;
            System.out.println("Average per house on the right: " + rightAverage);
        }

        scanner.close();
    }
}
