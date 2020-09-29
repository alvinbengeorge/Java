import java.util.*;
public class binary_search extends qwertyuiop
{
    public static void main()
    {
        clear();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
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
        int u=9,l=0,mid=0,d=0;
        System.out.println("Enter a number to be searched");
        int c=sc.nextInt();
        for(int i=0;i<10;i++)
        {
            mid=(int)((l+u)/2);
            if(a[mid]==c)
            {
                d=1;
                break;
            }
            else if(a[mid]<c)
            l=l+1;
            else if(a[mid]>c)
            u=u-1;        
        }
        if(d==1)
        System.out.println("Search successful");
        else
        System.out.println("Search unsuccessfull");
    }
}