import java.util.*;
public class addition extends qwertyuiop
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");int a,s=0;
        for(int i=0;i<10;i++)
        {
            a=sc.nextInt();
            s=s+a;
        }  
        System.out.println("SUM: "+s);
    }
}