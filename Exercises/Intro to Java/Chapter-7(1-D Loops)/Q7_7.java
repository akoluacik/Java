public class Q7_7 {
    public static void main(String[] args) {
        int[] freqOfNumbers = new int[10];
        
        /* Creating array with random numbers */
        for (int i = 0; i < 100; i++) {
            int number = (int)(Math.random() * 10);
            freqOfNumbers[number]++;
        }

        /* Displaying frequency */
        System.out.println("Frequency of the randomly generated numbers: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ":"+ freqOfNumbers[i]);
        }
    }
}
