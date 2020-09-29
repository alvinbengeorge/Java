import java.util.*;
public class vowel extends qwertyuiop
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\u000C");
        System.out.println("Enter a String");
        String a=sc.nextLine();int b=0,d=0;
        int l=a.length();char c='\u000C';
        for(int i=0;i<l;i++)
        {
            c=a.charAt(i);
            b=vowel(c);
            if(b==1)
            d++;
        }   
        System.out.println(d);  
    }
}
