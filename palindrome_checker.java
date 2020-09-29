import java.util.*;
public class palindrome_checker
{
    public static void sleep(int time)
    {
        try
        {
            Thread.sleep(time);
        }catch(Exception e) {}
    }
    public static void palindrome(int a)
    {
        int b=a,c=0,d=0;
        while(b!=0)
        {
            c=b%10;
            b=b/10;
            d=d*10+c;
        }
        if(d==a)
        System.out.println("Palindrome");
        else 
        System.out.println("Not palindrome");
    }
    public static void main()
    {
        System.out.println("\u000C");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check if it is a palindrome: ");
        int a=sc.nextInt();
        palindrome(a);
    }
}