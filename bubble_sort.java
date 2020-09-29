import java.util.*;
public class bubble_sort extends qwertyuiop
{
    public static void main()
    {
        clear();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        int a[]=new int[10];
        for(int i=0;i<10;i++)
        a[i]=sc.nextInt();
        int t=0;
        for(int i=0;i<10;i++)
        {
            for(int j=i-1;j>=0;j--)
            {
                if(a[j]>a[j+1])
                {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        for(int i=0;i<10;i++)
        System.out.println(a[i]);
    }
}