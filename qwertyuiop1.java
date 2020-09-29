import java.util.*;
public class qwertyuiop1
{   
    public static void finder(String a,char b)
    {
        int l=a.length();
        a=a.toLowerCase();int c=0;
        for(int i=0;i<l;i++)
        {
            char d=a.charAt(i);
            sleep(100);
            if(b==d)            
            System.out.println(i);
        }
    }
    public static void words(String a)
    {
        String b="";char d;       
        int l=a.length();
        for(int i=0;i<l;i++)
        {
            d=a.charAt(i);
            System.out.print(d);
            if(d==' ')
            System.out.println();            
        }
    }
    public static int prime(int a)
    {
        int b=a;
        int c=0;
        for(int i=2;i<b;i++)
        {
            if(b%i==0)
            {
                c=1;
                break;
            }            
        }
        return(c);
    }
    public static String combine(String a,String b)
    {
        String c=a.concat(b);
        return(c);
    }
    public static void clear()
    {
        System.out.println("\u000C");
    }
    public static void multiples(int a,int b)
    {
        int c=0;
        for(int i=1;i<=b;i++)
        {
            c=c+a;
            System.out.println(c);
        }
    }
    public static void factors(int a)
    {
        for(int i=1;i<=a;i++)
        {            
            if(a%i==0)
            System.out.print(i+",");
        }
    }
    public static int divisibility(int a,int b)
    {
        if(a%b==0)
        return(1);
        else
        return(0);
    }
    public static void tables(int a,int b,int d)
    {
        int c=multiply(a,b);
        if(d==1)
        System.out.print(a+"x"+b+"="+c);
        else if(d==2)
        System.out.println(a+"x"+b+"="+c);
    }
    public static int vowel(char a)
    {
        int c=0;
        if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
        c=1;
        return(c);
    }
    public static void sleep(int time)
    {
        try
        {
            Thread.sleep(time);
        }catch(Exception e) {}
    }
    public static int add(int a,int b)
    {
        int c=a+b;
        return(c);
    }
    public static int subtract(int a,int b)
    {
        int c=a-b;
        return(c);
    }
    public static int multiply(int a,int b)
    {
        int c=a*b;
        return(c);
    }
    public static int divide(int a,int b)
    {
        int c=a*b;
        return(c);
    }
    public static int power(int a,int b)
    {
        int c=(int)(Math.pow(a,b));
        return(c);
    }
    public static double sqrt(int a)
    {
        double b=Math.sqrt(a);
        return(b);
    }
    public static double cbrt(int a)
    {
        double b=Math.sqrt(a);
        return(b);
    }
    public static int icalculator(int a,int b,int c)
    {
        if(c==1)
        {
            c=add(a,b);
            return(c);
        }
        else if(c==2)
        {
            c=subtract(a,b);
            return(c);
        }
        else if(c==3)
        {
            c=multiply(a,b);
            return(c);
        }
        else if(c==4)
        {
            c=divide(a,b);
            return(c);
        }
        else if(c==5)
        {
            c=power(a,b);
            return(c);
        }
        else 
        return(0);
    }
    public static double dcalculator(int a,int b)
    {
        if(b==1)
        {
            double c=sqrt(a);
            return(c);
        }
        else if(b==2)
        {
            double c=cbrt(a);
            return (c);
        }
        else 
        return(0);
    }
    public static void print(String a,int b)
    {
        int l=a.length();b=b*1000;
        char c[]=new char[l];
        for(int i=0;i<l;i++)
        {
            sleep(b);
            System.out.print(c[i]);
        }        
    } 
    public static void hdivide(int a,int b)
    {
        int c=0,d=0,e=0;
        d=a/b;
        e=a%b;        
        System.out.print(d+".");
        for(int i=0;i<3;)
        {
            sleep(300);
            if(e<b)
            e=e*10;
            d=e/b;
            e=e/10;
            System.out.print(d);
            if (e==0)
            break;
        }        
    }
    public static void h_divide(int a,int b)
    {
        int c=0,d=0,e=0;
        for(int i=0;i<3;)
        {
            sleep(200);
            if(a==0)
            break;
            d=a/b;
            System.out.print(d);
            a=a-(d*b);
            if(a<b)
            {
                a*=10;c++;
                if(c==1)
                System.out.print(".");
            }
        }
    }
    public static char convertor(int a)
    {
        char c=(char)a;
        return(c);
    }
    public static int metronome(int tempo,int numerator,int denominator)
    {
        int t=(int)((60*4*1000)/(tempo*denominator));
        return(t);
    }
    public static String replace(String a, char b,char c)
    {
        a=a.replace(b,c);
        return(a);
    }
}        