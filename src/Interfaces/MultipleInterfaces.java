interface A{
	void show1();
	void config();
}
interface B{
	void show2();
}
abstract class C implements A, B{
	public void show1(){
		System.out.println("In A's Show");
	}
	public void show2(){
		System.out.println("In B's Show");
	}
}
class D extends C{
  public void config(){
    System.out.println("A's Config");
  }
}
class MultipleInterfaces{
	public static void main(String[] args){
		A obj1 = new D();
		obj1.show1();
		obj1.config();
		
		B obj2 = new D();
		obj2.show2();
	
	}

}

