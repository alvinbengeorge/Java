import java.util.*;
public  class String_equal extends qwertyuiop
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 Strings: ");
        String a[]=new String[10];
        String b="";
        for(int i=0;i<10;i++)
        a[i]=sc.nextLine();
        System.out.println("Enter String to be searched: ");
        b=sc.nextLine();int c=0;
        for(int i=0;i<10;i++)
        {
            if(b==a[i])
            {                
                c=1;
                break;                
            }
        }
        if(c==1)
        System.out.println("Found");
        else
        System.out.println("Not found");
    }
}