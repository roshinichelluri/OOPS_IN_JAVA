class StaticBlock{
	static int a = 4;
	static int b;
  
  //Static block only runs once i.e when the class first gets loaded
	static{
		System.out.println("Running static Block");
		b += a;
	}
	
	public static void main(String[] args){
	  //Loading the class for the first time
	  StaticBlock b1 = new StaticBlock();
	  System.out.println("a: " + b1.a + " b: " + b1.b);
	  
	  StaticBlock.b = 10;
	  
	  //The static block didn't run the second time the class is loaded
	  StaticBlock b2 = new StaticBlock();
	  System.out.println("a: " + b2.a + " b: " + b2.b);
  }
}
	
	
