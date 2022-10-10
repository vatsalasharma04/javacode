    importjava.io.*;
class simpleintrest
{
public static void main(String args[])throwsIOException
{
    int p,r,t,s;
    BufferedReader br=new BufferedReader(new InputStramReader(System.in));
    System.out.println("enter principle amount");
    p=Integer.ParseInt(br.readLine());
    System.out.println("enter rate of intrest");
    r=Integer.ParseInt(br.readLine());
    System.out.println("enter time ");
    t=Integer.ParseInt(br.readLine());
    s=p*r*t/100;
    System.out.println(""+s);
}
}