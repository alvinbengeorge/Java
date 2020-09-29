public class animation extends qwertyuiop
{
    public static void main()
    {
        int a=741,b=742,c=743,d=744,e=745,g=0;
        char f;
        for(int i=1;i<3;)
        {
            System.out.println("\u000C");
            f=convertor(a);
            System.out.println(f);
            f=convertor(b);
            System.out.println(f);
            f=convertor(c);
            System.out.println(f);
            f=convertor(d);
            System.out.println(f);
            f=convertor(e);
            System.out.println(f);
            sleep(200);
            g=a;
            a=b;
            b=c;
            c=d;
            d=e;
            e=g;
        }
    }
}
        