import java.util.*;
public class Character_finder extends qwertyuiop
{
    public static void main()
    {
        clear();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String a=sc.nextLine();
        System.out.println("Enter a Character to find: ");
        String b=sc.next();
        char c=b.charAt(0);
        finder(a,c);        
    }
}
        