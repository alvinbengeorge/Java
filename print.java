import java.util.*;
public class print extends qwertyuiop
{           
    public static void palindrome()
    {
        clear();
        System.out.println("\u000C");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check if it is a palindrome: ");
        int a=sc.nextInt();
        int b=a,c=0,d=0;
        while(b!=0)
        {            
            c=b%10;
            b=b/10;            
            d=d*10+c;            
        }
        if(d==a)
        System.out.println("PALINDROME");
        else
        System.out.println("NOT PALINDROME");
    }
}