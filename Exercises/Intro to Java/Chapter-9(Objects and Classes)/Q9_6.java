/**
 *  (Use the Random class) Write a program that creates a Random object with seed 
 * 1000 and displays the first 50 random integers between 0 and 100 using the 
 * nextInt(100) method.
 */

 /**
  * ANSWER
  * See also StopWatch.java file.
  */

import java.util.Random;

public class Q9_6 {
    public static void main(String[] args) {
        StopWatch sw = new StopWatch();
        Random rd = new Random();
        int arr[] = new int[100000];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(10000);
        }
        
        /*for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            //if(i % 21 == 0) System.out.println();
        }*/

        System.out.println("Start time: " + sw.getStartTime());

        int min, min_index = 0;
        for (int i = 0; i < arr.length; i++) {
            min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < min) {
                    min = arr[j];
                    min_index = j;
                }
            }
            arr[min_index] = arr[i];
            arr[i] = min;
        }

        /*System.out.println("\nAfter sorting\n");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }*/
        
        sw.stop();
        System.out.println("End time: " + sw.getEndTime());        
        System.out.println(sw.getElapsedTime());
        
    }
}
