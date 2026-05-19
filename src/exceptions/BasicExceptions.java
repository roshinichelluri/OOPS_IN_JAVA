package exceptions;

class MyException extends Exception{
    public MyException(String str){
        super(str);
    }
}

public class BasicExceptions {
    public static void main(String[] args){
        int arr[] = {10, 0, 30, 40, 50};
        try{
            int res = arr[4] / arr[4];
            if(res > 0) throw new MyException("Result is successfully retrieved");
            if(res == 0) throw new ArithmeticException("Arithematic Exception");
            res = res * arr[6];
        }
        catch(ArithmeticException e){
            System.out.println("Error : " + e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error : Array index is Out of limits");
        }
        catch(Exception e){
            System.out.println("Something went wrong " + e);
        }
    }
}
