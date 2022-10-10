class addition
{
int a,b,c;
void addn(int x, int y){
a=x;
b=y;
c=a+b;
System.out.println("addition of two number is:  "+c);
}
}
class pro {

public static void main (String args[])
{
addition obj1=new addition();
obj1.addn(10,20);
}
}