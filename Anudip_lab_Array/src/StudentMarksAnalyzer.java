import java.util.Scanner;
public class StudentMarksAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        int total = 0;
        int highest, lowest;
        System.out.println("Enter marks of 5 students:");
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
            total += marks[i];
        }
        highest = marks[0];
        lowest = marks[0];
        for (int i = 1; i < 5; i++) {
            if (marks[i] > highest)
                highest = marks[i];
            if (marks[i] < lowest)
                lowest = marks[i];
        }
        double average = total / 5.0;
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Highest Mark: " + highest);
        System.out.println("Lowest Mark: " + lowest);
        sc.close();
    }
}
