import java.util.scanner;
class perimeter
{
public static void main (String args[])
{
    int a,b,c;
    scaner sc=new scanner(system.in);
    System.out.println("enter length");
    a=sc.nextInt();
    System.out.println("enter width");
    b=sc.nextInt();
    c=2*(a+b);
    System.out.println("perimeter"+c);
}
}