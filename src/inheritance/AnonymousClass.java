class Car{
	public void drive(){
		System.out.println("In Car's Drive");
	}
	public void playMusic(){
		System.out.println("In Car's Music");
	}
}

//Unnecesary to create a seperate class for only to provide a new implementation of methods
//class Porsche extends Car{
//  public void drive(){
//    System.out.println("In Porsche's Drive");
//  }
//}

class AnonymousClass{
	public static void main(String[] args){
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
