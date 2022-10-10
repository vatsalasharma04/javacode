//addition program using constructor with parameter
class addition{

int a,b,c;
    addition(int x,int y){
        a=x;
        b=y;
    }
 

void display(){

    c=a+b;
    System.out.println("additon is "+c);
}
class parasum{
    public static void main (String args []){
        addition obj1 =new addition(50,50);
        obj1.display();
}
}
}