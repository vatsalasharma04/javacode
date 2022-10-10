class animal{
    void eat(){
        System.out.println("animals eat");
    }
    void breathe(){
        System.out.println("animals breathe");
    }
}
class dog extends animal{
    dog(){
        System.out.println("DOGS HAVE PUPPY");
    }
    
}
class inheri{
    public static void main(String args[]){
        dog obj1=new dog();
        obj1.eat();
        obj1.breathe();
    }
}