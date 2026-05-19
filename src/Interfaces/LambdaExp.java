package Interfaces;

@FunctionalInterface
interface A{
    void show();
}

public class LambdaExp {
    public static void main(String[] args){
        A obj = () -> System.out.println("In a method from Functional Interface");
        obj.show();
    }
}
