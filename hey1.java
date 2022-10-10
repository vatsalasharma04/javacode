class hey1{
int a,b,c;
 hey1(int x, int y){
a=x;
b=y;
c=a+b;
}
void display(){
System.out.println("the sum is:" +c);
}
public static void main (String args[]){
hey1 obj1= new hey1(10,20);
obj1.display();
}
}