import java.util.*;
public class calculator extends qwertyuiop
{
    public static void main()
    {
        clear();Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter 1 for addition ");
        System.out.println("Enter 2 for subtraction");
        System.out.println("Enter 3 for multiplication");
        System.out.println("Enter 4 for division");
        System.out.println("Enter 5 for multiplication in table format"); 
        System.out.println("Enter 6 for regular division"); 
        System.out.println("Enter 7 for checking if both numbers are prime numbers or not");
        System.out.println("Enter 8 for factors of the two numbers");
        int c=sc.nextInt();int d=0,e=0;
        if(c<=4)
        d=icalculator(a,b,c);
        else if (c==5)
        tables(a,b,2);        
        else if(c==6)
        h_divide(a,b);
        else if(c==7)
        {
            clear();
            d=prime(a);
            e=prime(b);
            if(d==1&&e==1)
            System.out.println("Both the numbers are prime");
            else if(d==1)
            System.out.println(a+" is prime");
            else if(e==1)
            System.out.println(b+" is prime");
            else
            System.out.println("Both are not prime");
        }
        else if(c==8)
        {
            clear();
            factors(a);
            System.out.println();
            factors(b);
        }
    }
}