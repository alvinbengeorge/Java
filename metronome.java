import java.util.*;
public class metronome extends qwertyuiop
{    
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter tempo: ");
        int t=sc.nextInt();
        System.out.println("Enter the numerator and denominator: ");
        int n=sc.nextInt();
        int d=sc.nextInt();
        int met=0,c=1;
        for(int i=1;i<3;)
        {
            met=(int)((60*4*1000)/(t*d));
            sleep(met);
            c++;
            if(c==n+1)
            c=1;
            System.out.println("\u000C");
            System.out.println(c);
        }
    }
}