import java.util.Scanner;
public class simpleInterest {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int p, r, t;
            System.out.println("Enter P, R and T:");
            p = sc.nextInt();
            r = sc.nextInt();
            t = sc.nextInt();
            final float si = (p * r * t) / 100;
            System.out.println("Simple Interest: " + si);
        }
    }
}