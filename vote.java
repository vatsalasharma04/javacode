import java.util.Scanner;
class vote{
vote(int a)
{
if(a<18){

System.out.println("SORRY!! YOU CANNOT VOTE");
}
else
{
System.out.println("HURRAY!! YOU CAN VOTE");
}
}
public static void main (String args[]){
int a;
Scanner sc = new Scanner(System.in);
System.out.println("ENTER YOUR AGE TO CHECK YOUR ELIGIBILITY TO VOTE");
a=sc.nextInt();
vote obj2 = new vote(a);
}
}