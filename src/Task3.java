/*
Task 3. Student Grades
Write a program that analyzes the grades of a group of students.

Input
The first line contains two positive integers: the number of subjects and the number of students, in that order.

Each following line contains one student’s grades: one grade for each subject.

Output
Calculate and print:

Each student’s average grade.

The group’s average grade.

The number of the student with the highest average grade. If several students have the same highest average, print all their numbers.

The numbers of all students who have at least one grade below 5. If there are none, print None.

Students are numbered starting from 1, in the order in which their grades appear in the input.

Example
Input

3 4
8 9 7
7 8 9
10 10 10
10 9 8
Output

Student averages:
8
8
10
9

Group average:
8.75

Highest-performing student:
3

Students with at least one grade below 5:
None
*/
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int subjectCount = scanner.nextInt();
        int studentCount = scanner.nextInt();

        double totalOfAverages = 0;
        int didSum = Integer.MIN_VALUE;
        String didStudents = "";
        String studentsBelowFive = "";

        System.out.println("Student averages:");

        for (int student = 1; student <= studentCount; student++) {
            int sum = 0;
            boolean hasGradeBelowFive = false;

            for (int subject = 0; subject < subjectCount; subject++) {
                int grade = scanner.nextInt();
                sum += grade;


                if (grade < 5) {
                    hasGradeBelowFive = true;
                }
            }


            if (hasGradeBelowFive) {
                if (!studentsBelowFive.isEmpty()) {
                    studentsBelowFive += " ";
                }
                studentsBelowFive += student;
            }

            double average = (double) sum / subjectCount;
            totalOfAverages += average;

            if (sum > didSum) {
                didSum = sum;
                didStudents = String.valueOf(student);
            } else if (sum == didSum) {
                didStudents += " " + student;
            }

            System.out.println(formatAverage(average));
        }

        double groupAverage = totalOfAverages / studentCount;
        System.out.println("\nGroup average:");
        System.out.println(formatAverage(groupAverage));

        System.out.println("\nHighest-performing student:");
        System.out.println(didStudents);


        System.out.println("\nStudents with at least one grade below 5:");
        if (studentsBelowFive.isEmpty()) {
            System.out.println("None");
        } else {
            System.out.println(studentsBelowFive);
        }
    }


    private static String formatAverage(double average) {
        if (average == (int) average) {
            return String.valueOf((int) average);
        }
        return String.valueOf(average);
    }
}
