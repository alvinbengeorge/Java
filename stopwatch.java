public class stopwatch extends qwertyuiop
{
    public static void main()
    {
        int h=0;
        int m=0;
        int s=1;
        for(int i=0;i<2;)
        {
            sleep(1000);s++;
            System.out.println("\u000C");
            System.out.println(h+"h "+m+"m "+s+"s ");
            if(s==60)
            {
                s=0;
                m++;
            }
            if(m==60)
            {
                m=0;
                h++;
            }
        }
    }
}
            