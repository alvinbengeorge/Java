import java.util.Scanner;
import java.lang.Integer;
import java.util.ArrayList;

class User {
    public String name;
    public String email;
    public int age;
    
    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public void display() {
        System.out.println("======================");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Email: " + this.email);
    }
}

class Database {
    public ArrayList<User> database;

    public Database() {
        this.database = new ArrayList<>();
        System.out.println("Database initialized");
    }

    public void append(String name, int age, String email) {
        this.database.add(new User(name, age, email));
    }

    public void display() {
        for (User user: this.database) {
            user.display();
        }
    }

    public void take_input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Enter your email: ");
        String email = sc.nextLine();
        this.append(name, age, email);
        sc.close();
    }
}

public class OOPSpractice {
    public static void main(String args[]) {
        Database database = new Database();
        database.take_input();
        database.display();
    }
}