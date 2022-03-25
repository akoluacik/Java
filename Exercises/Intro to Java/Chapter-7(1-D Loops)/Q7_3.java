import java.util.Scanner;
import java.util.Arrays;
public class Q7_3 {
    public static void main(String[] args) {
        Q7_3Handler();
    }

    public static void Q7_3Handler() {
        int[] arr = new int[100];
        
        Scanner keyboard = new Scanner(System.in);
        int number, len=0;

        while((number = keyboard.nextInt()) != 0) {
            arr[len++] = number;
        }

        Arrays.sort(arr, 0, len);

        int[] freq = new int[len];
        
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if( arr[i] == arr[j] && arr[i] != 0 ) {
                    freq[j]++;
                    arr[i] = 0;
                }
            }
        }

        for (int i = 0; i < len; i++) {
            if( arr[i] == 0) continue;
            System.out.println(arr[i] + " occurs " + (freq[i] + 1) + ( ( (freq[i] + 1) > 1) ? " times":" time") );
        }

    }
}
