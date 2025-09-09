import java.util.Scanner;
public class PalindromChecker {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();
        int length = input.length();
        boolean flag = true;
        for (int i=0; i<length; i++) {
            if (input.charAt(i) != input.charAt(length-i-1)) {
                System.out.println("Not palindrome");
                flag = false;
            }
        }
        if (flag) System.out.println("It is a palindrome");
    }
}
