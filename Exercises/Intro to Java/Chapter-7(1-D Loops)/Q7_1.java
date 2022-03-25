import java.util.Scanner;

public class Q7_1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int len = keyboard.nextInt();
        int[] grades = inputGrades(len);
        AssignLetterGrades(grades);
        
    }

    public static int[] inputGrades(int len) {
        int[] grades = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.print("Enter " + i + "th grade: ");
            Scanner kb = new Scanner(System.in);
            grades[i] = kb.nextInt();
        }
        return grades;
    }

    public static int getMax(int[] grades) {
        int max = grades[0];
        for (int i : grades) {
            if (i > max) max = i;
        }
        return max;
    }

    public static void AssignLetterGrades(int[] grades) {
        int max = getMax(grades);
        for (int i = 0; i < grades.length; i++) {
            System.out.print("Student" + i + " score is "
                + grades[i] + " and grade is ");
            if (grades[i] >= max - 10) System.out.println("A");
            else if (grades[i] >= max - 20) System.out.println("B");
            else if (grades[i] >= max - 30) System.out.println("C");
            else if (grades[i] >= max - 40) System.out.println("D");
            else System.out.println("F");
        }
    }

}
