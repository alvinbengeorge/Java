import java.util.*;
public class double_dimension_adder extends qwertyuiop
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows and column");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c[][]=new int[a][b];
        int d=0,e=0;
        System.out.println("Enter the numbers:");
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            c[i][j]=sc.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            System.out.print(c[i][j]+" ");
            System.out.println();
        }
        for(int i=0;i<a;i++)
        {
            d=0;
            for(int j=0;j<b;j++)
            d=d+c[i][j];
            System.out.println("ROWS "+(i+1)+" :"+d);
        }
        for(int j=0;j<b;j++)
        {
            e=0;
            for(int i=0;i<a;i++)
            e=e+c[i][j];
            System.out.println("COLUMNS "+(j+1)+" :"+e);
        }
    }
}