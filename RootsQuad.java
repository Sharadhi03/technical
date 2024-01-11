import static java.lang.Math.sqrt;
import java.util.Scanner;
public class RootsQuad {
    static int a;
    static int b;
    static int c;
    static double d;
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=Math.sqrt(b*b-4*a*c);
        if(d>0)
        {
            System.out.println("roots are greater than zero,but not equal");
        }
        else if (d==0)
        {
            System.out.println("equal roots");
        }
        else{
            System.out.println("imaginary roots");
        }
        System.out.println("value of d="+d);
    }
}
