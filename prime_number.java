import java.util.Scanner;
public class prime_number extends qwertyuiop
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a=sc.nextInt();
        int b=prime(a);
        if(b==0)
        System.out.println("Prime number");
        else 
        System.out.println("Not Prime number");
    }
}