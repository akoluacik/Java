/**
 * (The MyInteger class) Design a class named MyInteger. The class contains:
 * ■ An int data field named value that stores the int value represented by this 
object.
 * ■ A constructor that creates a MyInteger object for the specified int value.
 * ■ A getter method that returns the int value.
 * ■ The methods isEven(), isOdd(), and isPrime() that return true if the 
value in this object is even, odd, or prime, respectively.
 * ■ The static methods isEven(int), isOdd(int), and isPrime(int) that 
return true if the specified value is even, odd, or prime, respectively.
 * ■ The static methods isEven(MyInteger), isOdd(MyInteger), and 
isPrime(MyInteger) that return true if the specified value is even, odd, 
or prime, respectively.
 * ■ The methods equals(int) and equals(MyInteger) that return true if 
the value in this object is equal to the specified value.
 * ■ A static method parseInt(char[]) that converts an array of numeric 
characters to an int value.
 * ■ A static method parseInt(String) that converts a string into an int
value
 */

public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public boolean isEven() {
        return this.value % 2 == 0;
    }

    public boolean isOdd() {
        return !isEven();
    }
    
    public boolean isPrime() {
        if(value != 2 && isEven()) return false;
        
        for(int i = 3; i < Math.sqrt(value); i += 2) {
            if(value % i == 0) return false;
        }
        
        return true;
    }

    public static boolean isEven(int number) {
        return new MyInteger(number).isEven();
    }

    public static boolean isOdd(int number) {
        return !isEven(number);
    }

    public static boolean isPrime(int number) {
        return new MyInteger(number).isPrime();
    }
    
    public static boolean isEven(MyInteger myInt) {
        return myInt.isEven();
    }

    public static boolean isOdd(MyInteger myInt) {
        return myInt.isOdd();
    }

    public static boolean isPrime(MyInteger myInt) {
        return myInt.isPrime();
    }

    public boolean equals(int number) {
        return value == number;
    }

    public boolean equals(MyInteger myInt) {
        return this.value == myInt.value;
    }

    public static int parseInt(char[] nums) {
        int number = 0;

        for (int i = 0; i < nums.length; ++i) {
            if(nums[i] >= '0' && nums[i] <= '9') {
                number = number * 10 + (nums[i] - '0');
            } else {
                number = -1;
                throw new IllegalArgumentException("Items must be numeric");
            }
        }

        return number;
    }

    public static int parseInt(String number) {
        char[] digits = number.toCharArray();
        return parseInt(digits);
    }

    public static void main(String[] args) {
        char[] digits = {'1', '2', '3', '4'};
        System.out.println("Char:" + parseInt(digits));
        System.out.println("String:" + parseInt("1234"));
        System.out.println(isEven(12) + " " + isEven(15));
        System.out.println(isOdd(12) + " " + isOdd(15));
        System.out.println(isPrime(2) + " " + isPrime(3) + " " + isPrime(13) +
                           " " + isPrime(18));
        System.out.println(isPrime(new MyInteger(2)) + " " + isPrime(new MyInteger(3))
                            + " " + isPrime(new MyInteger(16)));
    }

}
