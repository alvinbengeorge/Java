import java.util.*;
public class case_switch extends qwertyuiop
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter 1 for addition and 2 for subtraction");
        System.out.println("Enter 3 for multiplication and 4 for division");        
        int c=sc.nextInt();
        int d=0;
        switch(c)
        {
            case 1:
            d=add(a,b);
            break;
            case 2:
            d=subtract(a,b);
            case 3:
            d=multiply(a,b);
            break;
            case 4: 
            d=divide(a,b);            
        }
        System.out.println(d);
    }
}