package exceptions;

class OutOfMilkException extends Exception{
    public OutOfMilkException(String msg){
        super(msg);
    }
}

class CoffeeMachine{
    public static void makeLatte(int milkInML) throws OutOfMilkException{
        if(milkInML == 0){
            throw new OutOfMilkException("Insufficient Milk");
        } 
        System.out.println("Latte Ready!");
    }
}
public class ThrowsKeyword {
    public static void main(String[] args){
        CoffeeMachine cm = new CoffeeMachine();

        System.out.println("Person 1's Order: ");
        try{
            cm.makeLatte(0);
        }
        catch(OutOfMilkException e){
            System.out.println("Error : " + e);
        }

        System.out.println("Person 2's Order: ");
        try{
            cm.makeLatte(100);
        }
        catch(OutOfMilkException e){
            System.out.println("Error : " + e);
        }
    }
}
