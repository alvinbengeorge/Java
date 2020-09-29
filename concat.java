import java.util.*;
public class concat extends qwertyuiop
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 strings: ");
        String a=sc.nextLine();
        String b=sc.nextLine();
        b=a.concat(b);
        System.out.println(b);
    }
}