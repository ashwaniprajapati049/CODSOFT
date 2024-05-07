import java.util.Scanner;

public class StudentGradeCalculator {
    public static void ObtainMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Math out of 100:");
        int math = sc.nextInt();
        System.out.println("Enter the number of Physics out of 100:");
        int physics = sc.nextInt();
        System.out.println("Enter the number of Chemistry out of 100:");
        int chemistry = sc.nextInt();
        System.out.println("Enter the number of Hindi out of 100:");
        int hindi = sc.nextInt();
        System.out.println("Enter the number of English out of 100:");
        int english = sc.nextInt();
        int total = math + chemistry + physics + hindi + english;
        float percentage = (float) total / 5;
        System.out.println("Your total marks is \n" + total);
        System.out.println("Your average percentage is\n" + percentage);
        System.out.println("Corresponding Grade is ");

        if (percentage >= 90 && percentage <= 100)
            System.out.println("A+");
        else if (percentage >= 81 && percentage < 90)
            System.out.println("A");
        else if (percentage >= 71 && percentage < 81)
            System.out.println("B+");
        else if (percentage >= 61 && percentage < 71)
            System.out.println("B");
        else if (percentage >= 51 && percentage < 61)
            System.out.println("C");
           else if (percentage >= 34 && percentage < 50)
            System.out.println("C+");
        else
            System.out.println("Fail");
    }

    public static void main(String[] args) {
        ObtainMarks();
    }
}
