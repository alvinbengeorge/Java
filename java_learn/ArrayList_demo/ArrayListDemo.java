import java.util.ArrayList;
import java.lang.Integer;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String args[]) {
        ArrayList<Integer> arr = new ArrayList<>();
        String str = new String("");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers from here: ");
        while (str != "exit") {
            str = sc.nextLine();
            try {
                arr.add(Integer.parseInt(str));
            } catch (Exception e) {
                break;
            }
        }
        arr.sort(null);
        System.out.println("Sorted Array: " );
        for (int a: arr) {
            System.out.println(a);
        }
        sc.close();
    }
}