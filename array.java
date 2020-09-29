import java.util.*;
public class array extends qwertyuiop
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        int a[]=new int[10];
        int t=0;
        for(int i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
            t=t+a[i];
        }
        System.out.println("Sum: ");
    }
}