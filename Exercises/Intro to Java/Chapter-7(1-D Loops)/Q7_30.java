import java.util.Scanner;

public class Q7_30 {
    public static void main(String[] args) {
        int len;
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        len = kb.nextInt();
        int[] numbers = new int[len];
        System.out.print("Enter the values: ");
        for (int i = 0; i < len; i++) {
            numbers[i] = kb.nextInt();
        }
        System.out.println("The list has" + (isConsecutiveFour(numbers) ? "" : " no") + " consecutive fours");
    }

    public static boolean isConsecutiveFour(int[] values) {
        for (int i = 0; i < values.length - 4; i++) {
            
            int start = i; // to group the list by 4 element
            int end = start + 4;
            int count = 1;
            // 5 5 5 5
            for (int j = start; j < end - 1; j++) {
                if( values[j] == values[ j + 1 ]) ++count;
            }
            if (count == 4) return true;
        }
        return false;
    }
}
