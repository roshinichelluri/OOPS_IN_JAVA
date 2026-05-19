//Inner class Implementation
class A{
  int age;
  public void show(){
    System.out.println("in Outer class");
  }
  class B1{
    public void show1(){
      System.out.println("In non-static inner class");
    }
  }
  static class B2{
    public void show2(){
      System.out.println("In static inner class");
    }
  }
}
class InnerClassDemo{
  public static void main(String[] args){
    //Outer class
    A obj = new A();
    obj.show();
    
    //Non-static inner class    
    A.B1 obj1 = obj.new B1();
    obj1.show1();
    
    //Static inner class
    A.B2 obj2 = new A.B2();
    obj2.show2();
  }
}
    
