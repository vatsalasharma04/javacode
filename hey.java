class hey{
int a,b,c;
 hey(){
a=10;
b=5;
c=a+b;
}
void display(){
System.out.println("the sum is:" +c);
}
public static void main (String args[]){
hey obj1= new hey();
obj1.display();
}
}