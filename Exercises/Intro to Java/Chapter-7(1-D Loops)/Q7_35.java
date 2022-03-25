import java.util.Scanner;

public class Q7_35 {
    public static void main(String[] args) {
        String[] words = {"write", "that", "program", "game", "java", "string"};
        int index = (int)(Math.random() * words.length);
        System.out.println("Word is:" + words[index]);
        int wrong_guess = 0;
        String printed_word = "*".repeat(words[index].length());
        Scanner keyboard = new Scanner(System.in);
        char c;

        while (printed_word.indexOf('*') >= 0) {
            System.out.print("(Guess) Enter a letter in word " + printed_word + ": ");
            c = keyboard.next().charAt(0);
            System.out.println("c is : " + c + " and words[index].indexOf(" + c +") is " + words[index].indexOf(c));
            if(words[index].indexOf(c) >= 0) {
                printed_word = change_string(words[index], c);
            } else {
                ++wrong_guess;
            }
        }
        System.out.println("The word is " + words[index] + 
            ". You missed " + wrong_guess + ((wrong_guess > 1) ? "times":"time") );
    }

    public static String change_string( String s , char key) {
        for( int i = 0; i < s.length(); ++i ) {
            System.out.println("s.charAt(" + i + ") = " + s.charAt(i));
            if(s.charAt(i) == key) {
                s =  s.substring(0, i) + key + s.substring(i + 1);
                System.out.println("if in the method and new s is " + s);
            }
        }
        return s;
    }
}
