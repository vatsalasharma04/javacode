//WAP to store details of an account holder and define deposit() , withdraw(), checkbalance(), and display() functions
import java.util.Scanner;
class account{
int d,u,p;
String n;
void deposit(int x){

d=x;

}

void checkbalance(){
System.out.println("YOUR BALANCE IS:" +d );

}
void withdraw(int z){
u=z;
if(u>d){
System.out.println("SORRY!! AMOUNT EXCEEDS THE EXISTING LIMIT OF THIS ACCOUNT" );}
else{
System.out.println("AMOUNT WITHDRAWN SUCCESSFUL!!" );
System.out.println("AMOUNT WITHDRAWN IS: "+u );
}
}

void display(String i, int y){
n=i;
p=y;

    System.out.println("name of the account holder =" +n );
    System.out.println("age of the account holder =" +p);
   
}
}
class manage{
public static void main(String args[]){

    int d,u,p;
    String n,i;
    
    Scanner sc=new Scanner (System.in);
    System.out.println("enter account holder's name");
    n=sc.next();
    System.out.println("Enter age");
    p=sc.nextInt();
    System.out.println("enter the amount you want to deposit: ");
    d=sc.nextInt();
   account obj1= new account();
    obj1.display(n,p);
    obj1.deposit(d);
    obj1.checkbalance();
    System.out.println("enter the amount you want to withdraw");
    u=sc.nextInt();
    obj1.withdraw(u);

}
}