abstract class Car{
	public abstract void drive();
	public abstract void playMusic();
}

//Unnecesary to create a seperate class for only to provide a new implementation of methods
//class Porsche extends Car{
//  public void drive(){
//    System.out.println("In Porsche's Drive");
//  }
//}

class Abstract_AnonymousClass{
	public static void main(String[] args){
		//the following object belongs to an anonymous class not to the mentioned abstract class
		Car obj = new Car(){
			public void drive(){
				System.out.println("Porsche's Driving");
			}
			public void playMusic(){
			  System.out.println("Porsche's Music Playing");
			}
		};
		obj.drive();
		obj.playMusic();
	}
}
