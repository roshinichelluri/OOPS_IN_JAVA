interface Car{
	//All variables are final and static
	String brand = "Unknown";
	int minCost = 1000000;
	
	//All methods in an interface are public & abstract
	void drive();
	void playMusic();
}
abstract class Porsche implements Car, bike{
	public void drive(){
		System.out.println("Porsche Driving");
	}
}
class PorscheGT extends Porsche{
  public void playMusic(){
    System.out.println("Porsche GT Playing Music");
  }
}
class InterfaceDemo{
	public static void main(String[] args){
		Car obj = new PorscheGT();
		obj.drive();
		obj.playMusic();
	}
}
