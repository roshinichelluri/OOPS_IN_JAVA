class A{
	public void showA(){
		System.out.println("In A Show");
	}
}
class B extends A{
	public void showB(){
		System.out.println("In B show");
	}
}
class Casting{
	public static void main(String[] args){
		//Up-casting : Implicit
		A obj = (A) new B();    //Same as : A obj = new B();
		obj.showA();
		//obj.showB();
		
		//Down-casting: Explicit
		B obj1 = (B) obj;
		obj1.showB();
	}
}
