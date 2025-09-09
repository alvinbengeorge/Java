import java.util.Scanner;
import java.util.HashMap;
import java.lang.String;

public class HashMapdemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);        
        HashMap<String, HashMap<String, Object>> var = new HashMap<>();
        String name_input = new String();
        String password_input = new String();
        String email_input = new String();
        int age_input;
        for (int i=0; i<3; i++) {
            System.out.println("==========================");
            System.out.println("Enter your name: ");
            name_input = sc.nextLine();
            System.out.println("Enter your password: ");
            password_input = sc.nextLine();
            System.out.println("Enter your email: ");
            email_input = sc.nextLine();
            System.out.println("Enter your age: ");
            age_input = Integer.parseInt(sc.nextLine());
            HashMap<String, Object> temp = new HashMap<>();
            temp.put("name", name_input);
            temp.put("password", password_input);
            temp.put("email", email_input);
            temp.put("age", age_input);
            var.put(name_input, temp);
        }
        System.out.println(var);
        sc.close();
    }
}