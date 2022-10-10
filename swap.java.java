importjava.io.*;
class swap
{
public static void main(String args[])throwsIOException
{
    int a,b,c;
    BufferedReader br=new BufferedReader(new InputStramReader(System.in));
    System.out.println("enter first number");
    a=Integer.ParseInt(br.readLine());
    System.out.println("enter second number");
    b=Integer.ParseInt(br.readLine());
    a=c;
    b=a;
    a=c;
    System.out.println("after swap"+a);
    System.out.println("after swap"+b);
}
}