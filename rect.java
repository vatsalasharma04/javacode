import java.util.Scanner;
class rect
{
        int l,b,a,p;
        void are (int x,int y){
        
            l=x;
            b=y;
            a=l*b;
            System.out.println("Area Of Rectangle Is =" +a);
        }
        void peri (int x,int y){
          
            l=x;
            b=y;
            p=2*(l+b);
            System.out.println("perimeter Of Rectangle Is =" +p);
        }
    public static void main (String args[]){
  int l,b,a,p;
    
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter Length Of Rectangle");
    l=sc.nextInt();
    System.out.println("Enter Breath Of Rectangle");
    b=sc.nextInt();

    rect obj1= new rect();
    rect obj2= new rect();
    obj1.are(l,b);
    obj2.peri(l,b);
}
}