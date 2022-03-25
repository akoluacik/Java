public class Q7_13 {
    public static void main(String[] args) {
        System.out.println("The random number is " + getRandom(new int[]{2,3,4,5}));
    }

    public static int getRandom(int... numbers) {

        int randomNumber = (int)(1 + Math.random() * 54);
        int i = 0;
        while (i < numbers.length) {
            //(int)(1 + Math.random() * 54)
            if (numbers[i] == randomNumber) {
                randomNumber = (int)(1 + Math.random() * 54);
                i = 0;
            }
            i++;
        }
        return randomNumber;
    }
}
