import java.util.*;
public class Arrays {
    public static void main(String args[]) {
        int array[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<5; i++) {
            System.out.println("Enter "+i+" number: ");
            array[i] = sc.nextInt();
        }
        System.out.println("Numbers:");
        for (int n: array) {
            System.out.println(n);
        }

    }    
}
