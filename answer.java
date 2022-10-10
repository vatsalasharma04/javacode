class addition{
int a,b,c;

int add(int x, int y){
a=x;
b=y;
c=a+b;
return (c);

}
System.out.println("addition is "+c);
}
class answer{
public static void main (String args[]){
addition obj1=new addition ();
obj1.add(2000,3000);
}
}