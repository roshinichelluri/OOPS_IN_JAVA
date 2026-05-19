package Interfaces;

@FunctionalInterface
interface A{
    void show();
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args){
        A obj = new A(){
            public void show(){
                System.out.println("In a method from Functional Interface");
            }
        };
        obj.show();
    }
}
