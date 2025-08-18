import java.util.Scanner;

public class Palindrom {
    
    public static String reverseString(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return reversed;
    }

    public static boolean isPalindrome(String input) {
        String reversed = reverseString(input);
        return input.equalsIgnoreCase(reversed);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String reversed = reverseString(str);
        System.out.println("Reversed String: " + reversed);

        if (isPalindrome(str)) {
            System.out.println("It is a Palindrome!");
        } else {
            System.out.println("It is NOT a Palindrome.");
        }
    }
}
