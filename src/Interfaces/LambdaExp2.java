package Interfaces;

@FunctionalInterface
//Functional Interface is an interface which has only one abstract method.
//It can have multiple default and static methods.
interface Calculator{
    int add(int i, int j);
}

public class LambdaExp2 {
    // public static void main(String[] args){
    //     Calculator obj = new Calculator(){
    //         public int add(int i, int j){
    //             int sum = i + j;
    //             return sum;
    //         }
    //     };
    //     System.out.println("Sum : " + obj.add(10, 10));
    // }

    public static void main(String[] args){
        Calculator obj = (i, j) -> i + j;
        System.out.println("Sum : " + obj.add(10, 20));
    }
}
