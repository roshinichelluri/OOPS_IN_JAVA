package package_a;

/* Note : Instance variables declared as static are, essentially, global variables. When objects of its class are declared, no copy of a static variable is made. Instead, all instances of the class share the same static variable. */

public class Human{
	String name;
	public long nonstaticPopulation;
	public static long staticPopulation;
	
	public static void greeting(){
    System.out.println("Hello from static method");
    //System.out.println(this.name);
    //the above line of code gives a compilation error because "Non-static stuff cannot be referenced from Static stuff"
    //In this case, the name variable belongs to specific object and the greeting method is static 
  }
	public Human(String name){	
		this.name = name;
		
		nonstaticPopulation += 1;
		staticPopulation += 1;
		
		Human.greeting();
		
	}
	
}
	
