class Test{
	int a; //Default access
	public int b; //public access
	private int c; //Private access
	
	//The variable 'c' cannot be accessed by any members outside of this class
	//The methods are public inorder for us to access them outside of this class
	public void setc(int value){
		c = value;
	}
	
	public int getc(){
		return c;
	}
}
class BasicAccessControl{
	public static void main(String[] args){
	  //creating an object of the test class 
		Test obj = new Test();
		
		obj.a = 30;
		obj.b = 20;
	  //obj.c = 15; //Illegal statement since 'c' cannot be accessed
	  //To still access c, use the methods defined in the Test class which are declared public.
	  obj.setc(50);
	  int valC = obj.getc();
	      	
	  System.out.println("a (Default): " + obj.a);
    System.out.println("b (Public):  " + obj.b);
    System.out.println("c (Private): " + valC);
	}
}
