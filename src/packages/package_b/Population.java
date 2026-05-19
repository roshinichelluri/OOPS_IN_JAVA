package package_b;
import package_a.Human;
/*Instance variables declared as static are, essentially, global variables. When objects of its class are declared, no copy of a static variable is made. Instead, all instances of the class share the same static variable.*/
class Population{
	public static void main(String[] args){
	  //In the folder package_a, a .java file is created named Human which defines the class and it's behaviour and we are creating it's objects in here by importing it in the first line of the code
	  //Therefore, this implements the Static variable and basic Packages Implementation
		Human a = new Human("Roy");
		Human b = new Human("Chris");
		Human c = new Human("Katherine");
		
		//Non static variable belongs to specific object, since katherine object owns the "nonstaticPopulation" variable, it will print 1
		System.out.println("---Non-static variable Implementation---");
		System.out.println("A's Non-static population: " + a.nonstaticPopulation);
		System.out.println("B's Non-static population: " + b.nonstaticPopulation);
		System.out.println("C's Non-static population: " + c.nonstaticPopulation);
		System.out.println();
				
		//Static variable belongs to the Class "Human". the variable as defined in that class will be modified as many times as that class objects are created.
		//since in this case 3 objects are created, the variable will be incremented 3 times and will be printed here. This demonstrates that the class tracks the Total
		//Best Practice is to access the static variable with it's class name.
		System.out.println("---Static Variable Implementation---");
		System.out.println("Static variable accesed using Class Name: " + Human.staticPopulation);
		
		//The variable can be accessed with any object and it's behaviour won't be dependent on which object you are using to access the variable with.
		System.out.println("Static variable accesed using Object: " +c.staticPopulation);
		System.out.println();
		
	}
}
