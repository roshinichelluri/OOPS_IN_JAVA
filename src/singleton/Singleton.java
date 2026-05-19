//A singleton class in java restricts the class instantiation to only one object throughout the application's lifecycle.
public class Singleton{
	//To initalise a class, a constructor is always needed
	//We make the constructor private, so nobody can access this and create their objects of the singleton class.
	private Singleton() {}
	
	//The instance is created in this class itself 
	//Any outer classes can access only this instance;
	private static Singleton instance;
	
	//Acessing the one instance is possible through this method.
	public static Singleton getInstance(){
		if(instance == null)
			instance = new Singleton();
		return instance;
	}
}
