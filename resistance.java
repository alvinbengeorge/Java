import java.util.*;
public class resistance extends qwertyuiop
{
    public static void main()
    {
        clear();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 resistances: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=(a*b)/(a+b);
        System.out.println(c);
    }
}
