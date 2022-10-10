import java.util.Scanner;
class mymenu{
    int a,b,z;
    void add(int x, int y){
        a=x;
        b=y;
        z=a+b;
        
    }
    void sub(int x, int y){
        a=x;
        b=y;
        z=a-b;
        
    }
    void mul(int x, int y){
        a=x;
        b=y;
        z=a*b;
        
    }
    void div(int x, int y){
        a=x;
        b=y;
        z=a/b;
        
    }
    void display(){
        System.out.println("YOUR ANSWER IS "+z);
    }

    public static void main (String args []){
        int a,b, g,h,z,d,ans;
        Scanner sc=new Scanner(System.in);
        do{
        System.out.println("*****MENUE*****");
        System.out.println("1. add");
        System.out.println("2. subtract");
        System.out.println("3.multiply");
        System.out.println("4. divide");
        System.out.println("ENTER NUMBER 1");
        g=sc.nextInt();
        System.out.println("ENTER NUMBER 2");
        h=sc.nextInt();
        System.out.println("ENTER YOUR CHOICE FROM MENU"); 
        d=sc.nextInt();
        mymenu obj=new mymenu();

        switch(d)
{
    case 1: 
    obj.add(g,h);
    obj.display();

    break;

    case 2: 
    obj.sub(g,h);
    obj.display();
    break;
    case 3:
    obj.mul(g,h);
    obj.display();
      break;
      case 4:
      obj.div(g,h);
     obj.display();
    break;
    default:
    System.out.println("INVALID CHOICE");
}
System.out.println(" press 0 to continue");
 ans=sc.nextInt();
        }while(ans==0);

    }
}
