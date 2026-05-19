//Implementing Singleton class
public class ImplSingletonClass{
  public static void main(String[] args){
    //Creating an object of the class 
    Singleton obj1;
    
    //Singleton obj = new Singleton();
    //The above line will show error, because we cannot access the Private constructor in the Singleton class
    obj1 = Singleton.getInstance();
    
    //No matter how many objects, we will only be able to access the only one Instance of Singleton Class
    Singleton obj2 = Singleton.getInstance();
    
    //both obj1 and obj2 point to same instance
    if(obj1 == obj2) 
      System.out.println("Obj1 and Obj2 point to the same Instance");
  }
}
    
    
