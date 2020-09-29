import java.util.*;
public class extension
{    
    public static void sleep(int time)
    {
        try
        {
            Thread.sleep(time);
        }catch(Exception e) {}
    }
    public static void time()
    {
        Date d=new Date();
        System.out.println(d);
    }
    public static void add(int a,int b)
    {
        System.out.println("Sum: "+(a+b));
    }        
    public static void subtract(int a,int b)
    {
        System.out.println("Remainder: "+(a-b));
    }
    public static void multiply(int a,int b)
    {
        System.out.println("Product: "+(a*b));
    }
    public static void divide(int a,int b)
    {
        System.out.println("Quotient: "+(a/b));
        System.out.println("Remainder: "+(a%b));
    }
    public static void calculator()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter 1 to add");
        System.out.println("Enter 2 to subtract");
        System.out.println("Enter 3 to multiply");
        System.out.println("Enter 4 to divide");
        int c=sc.nextInt();
        if(c==1)
        add(a,b);
        else if(c==2)
        subtract(a,b);
        else if(c==3)
        multiply(a,b);
        else if(c==4)
        divide(a,b);
    }
    public static void timer()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the time to be counted: ");
        int s=sc.nextInt();
        for(int i=s;i>=0;i--)
        {
            sleep(1000);
            System.out.println("\u000C");
            System.out.println(i);
        }
    }
    public static void tictactoe()
    {
        System.out.println("\u000C");
        Scanner sc=new Scanner(System.in);
        int a,b,d=0,e=0;char xo='\u000C';
        char c[][]=new char[3][3];
        for(int y=0;y<3;y++)
        {
            for(int z=0;z<3;z++)
            c[y][z]=' ';
        }
        for(int i=0;i<9;i++)
        {            
            for(int y=0;y<3;y++)
            {
                for(int z=0;z<3;z++)
                System.out.print(c[y][z]+"\t");
                System.out.println();
                System.out.println();
                System.out.println();
            }
            sleep(5000);
            System.out.println("\u000C");d++;
            if(d%2!=0)
            {
                System.out.println("1st player");
                xo='x';
            }
            else 
            {
                System.out.println("2nd player");
                xo='o';
            }
            System.out.println("Enter coordinates x&y: ");
            if(i==8)
            e=1;            
            a=sc.nextInt();
            b=sc.nextInt();
            if(c[a-1][b-1]==' ')
            c[a-1][b-1]=xo;
            else
            {
                System.out.println("Already assigned");
                d--;i--;
            }     
            if(c[0][0]=='x'&&c[1][1]=='x'&&c[2][2]=='x')
            {
                System.out.println("1st player wins");
                break;
            }       
            else if(c[0][1]=='x'&&c[1][1]=='x'&&c[2][1]=='x')
            {
                System.out.println("1st player wins");
                break;
            }
            else if(c[2][0]=='x'&&c[1][1]=='x'&&c[0][2]=='x')
            {
                System.out.println("1st player wins");
                break;
            }
            else if(c[0][1]=='x'&&c[1][1]=='x'&&c[2][1]=='x')
            {
                System.out.println("1st player wins");
                break;
            }
            else if(c[2][0]=='x'&&c[2][1]=='x'&&c[2][2]=='x')
            {
                System.out.println("1st player wins");
                break;
            }
            else if(c[0][0]=='x'&&c[0][1]=='x'&&c[0][2]=='x')
            {
                System.out.println("1st player wins");
                break;
            }
            else if(c[0][0]=='x'&&c[1][0]=='x'&&c[2][0]=='x')
            {
                System.out.println("1st player wins");
                break;
            }
            else if(c[0][2]=='x'&&c[1][2]=='x'&&c[2][2]=='x')
            {
                System.out.println("1st player wins");
                break;
            }
            if(c[0][0]=='o'&&c[1][1]=='o'&&c[2][2]=='o')
            {
                System.out.println("2nd player wins");
                break;
            }       
            else if(c[0][1]=='o'&&c[1][1]=='o'&&c[2][1]=='o')
            {
                System.out.println("2nd player wins");
                break;
            }
            else if(c[2][0]=='o'&&c[1][1]=='o'&&c[0][2]=='o')
            {
                System.out.println("2nd player wins");
                break;
            }
            else if(c[0][1]=='o'&&c[1][1]=='o'&&c[2][1]=='o')
            {
                System.out.println("2nd player wins");
                break;
            }
            else if(c[2][0]=='o'&&c[2][1]=='o'&&c[2][2]=='o')
            {
                System.out.println("2nd player wins");
                break;
            }
            else if(c[0][0]=='o'&&c[0][1]=='o'&&c[0][2]=='o')
            {
                System.out.println("2nd player wins");
                break;
            }
            else if(c[0][0]=='o'&&c[1][0]=='o'&&c[2][0]=='o')
            {
                System.out.println("2nd player wins");
                break;
            }
            else if(c[0][2]=='o'&&c[1][2]=='o'&&c[2][2]=='o')
            {
                System.out.println("2nd player wins");
                break;
            }
        }
        System.out.println();
        for(int y=0;y<3;y++)
        {
            for(int z=0;z<3;z++)
            System.out.print(c[y][z]+"\t");
            System.out.println("\n\n");
        }
        if(e==1)
        System.out.println("TIE GAME");
    }
    public static void clear()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Are you sure?");
        String a=sc.next();
        if(a.equals("yes"))
        System.out.println("\u000C");           
    }
    public static void metronome()
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
    public static void palindrome(int a)
    {
        int b=a,c=0,d=0;
        while(b!=0)
        {
            c=b%10;
            b=b/10;
            d=d*10+c;
        }
        if(d==a)
        System.out.println("Palindrome");
        else 
        System.out.println("Not palindrome");
    }
    public static void palindromecheck()
    {
        System.out.println("\u000C");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check if it is a palindrome: ");
        int a=sc.nextInt();
        palindrome(a);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<3;)
        {
            System.out.println("Enter 1 for checking time");
            System.out.println("Enter 2 for calculator ");
            System.out.println("Enter 3 for timer");
            System.out.println("Enter 4 for exit");
            System.out.println("Enter 5 for tictactoe");
            System.out.println("Enter 6 for clear screen");
            System.out.println("Enter 7 for metronome");
            System.out.println("Enter 8 for palindrome checker");
            int a=sc.nextInt();
            if(a==1)
            time();
            else if(a==2)
            calculator();
            else if(a==3)
            timer();
            else if(a==4)
            break;
            else if(a==5)
            tictactoe();
            else if(a==6)
            clear();
            else if(a==7)
            metronome();
            else if(a==8)
            palindromecheck();
        }
        System.out.println("\u000C");
        System.out.println("Thank you");
    }
}