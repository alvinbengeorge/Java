import java.util.*;
public class tables extends qwertyuiop
{
    public static void main()
    {
        clear();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to print the table of that number: ");
        int a=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            tables(a,i,2);
            sleep(300);
        }
    }
}