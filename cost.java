//weight of parsal and cost
import java.util.Scanner;
class cost

{
    public static void main (String args[])
    {
        int w,c;
        Scanner sc = new Scanner(System.in);
    System.out.println("enter weight of your parsal");
    w=sc.nextInt();

    System.out.println("weight stored");

     
        if (w<=100) 
        {
        System.out.println("your cost  will be  2.3Rs ");
    }
    if (w>=100 && w<200) 
    {
    System.out.println("your cost  will be  3.1Rs ");
}
if (w>=200 && w<500) 
{
System.out.println("your cost  will be  3.4Rs ");
}       else 
         {
        System.out.println("your cost will be 4.00Rs ");
        System.out.println("thanks for checking your cost ");
    }
    }
}