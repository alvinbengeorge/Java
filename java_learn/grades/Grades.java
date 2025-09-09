import java.util.Scanner;
public class Grades {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number: ");
        int input = sc.nextInt();
        System.out.print("Grade: ");
        if (input > 90) {
            System.out.println("O");
        } else if (input > 80) {
            System.out.println("A+");
        } else if (input > 70) {
            System.out.println("A");
        } else if (input > 60) {
            System.out.println("B");
        } else if (input > 50) {
            System.out.println("C");
        } else {
            System.out.println("F");
        }
    }
}