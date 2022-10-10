//maximum of three numbers
class max
{
    public static void main (String args[])
    {
        int a,b,c;
        a=5;
        b=500;
        c=5000;
        if (a>b && a>c) 
        {
        System.out.println("Maximum Number Is " +a);
    }
        if (b>a && b>c)
         {
        System.out.println("Maximum Number Is " +b);
    }
        else 
         {
        System.out.println("Maximum Number Is "  +c);
    }
    }
}