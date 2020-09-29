import java.util.*;
public class int_char_convertor extends qwertyuiop
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a=sc.nextInt();
        char c=convertor(a);
        System.out.println("\u000C"+c);
        
    }
}
