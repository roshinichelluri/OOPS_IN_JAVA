//Defining a Nested Classes
public class Library{
  private String libName = "Page Haven";
  static String libLocation = "India";
  
  //Static Inner Class
  static class Genre{
    void displayInfo(){
      System.out.println("Location: " + libLocation);
    }
  }
  
  //Non Static Inner Class
  class Librarian{
    String name;
    
    Librarian(String name){
      this.name = name;
    }
    
    void introduce(){
      System.out.println("I am " + name + ", a librarian at Library " + libName + " located in " + libLocation + ".");
    }
  }
}

//Implementing a Nested Class
public class ImplNestedClass{
  public static void main(String[] args){
      //Instantiating static nested class
      Library.Genre genre = new Library.Genre();
      genre.displayInfo();
      
      //Instantiating non-static nested class      
      Library obj = new Library();
      
      //Use the outer class instance to create the inner class instance
      Library.Librarian librarian = obj.new Librarian("Aadhya");
      librarian.introduce();
    }
}
