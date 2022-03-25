import java.util.Scanner;

/**
 * Q7_21
 */
public class Q7_21 {

    public static void main(String[] args) {
        int route; // 0-> L, 1->R
        int numberOfBalls, numberOfSlots;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number of balls to drop: ");
        numberOfBalls = keyboard.nextInt();
        System.out.print("Enter the number of slots in the bean machine: ");
        numberOfSlots = keyboard.nextInt();
        
        for (int i = 0; i < numberOfSlots - 1; i++) {
            route = (int)(Math.random()*2);
            if(route == 0) System.out.print("L"); else System.out.print("R");
        }
    }
}