importjava.io.*;
class additionn
{
public static void main(String args[])throwsIOException
{
    int a,b,c;
    BufferedReader br=new BufferedReader(new InputStramReader(System.in));
    System.out.println("enter first number");
    a=Integer.ParseInt(br.readLine());
    System.out.println("enter second number");
    b=Integer.ParseInt(br.readLine());
    c=a+b;
    System.out.println("total"+c);
}
}