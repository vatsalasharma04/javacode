//STORE PRICE AND QUANTITY AND DISPLAY DISCOUNT AND TOTAL BILL
import java.util.Scanner;
class discount
{
    public static void main (String args[])
    {
        int p,q,t,d;
        Scanner sc = new Scanner(System.in);
    System.out.println("enter price");
    p=sc.nextInt();

    System.out.println("enter quantity");
    q=sc.nextInt();

    t=q*p;
    System.out.println("your total bill is " +t);

        if (t>=1000) 
        {
        System.out.println("sorry no discount available for you ");
    }
        if (t>1000 && t<=2000)
         {
        System.out.println("Congratulations you got 7%discount");
        d=t-(7/100*t);
        System.out.println("net payable amount is now "+d);
    }
    if (t>2000 && t<=5000)
         {
        System.out.println("Congratulations you got 10%discount");
        d=t-(10/100*t);
        System.out.println("net payable amount is now "+d);
         }
        else 
         {
        System.out.println("Congratulations you got 12%discount ");
        d=t-(12/100*t);
        System.out.println("net payable amount is now "+d);
    }
    }
}