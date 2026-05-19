abstract class Car{
	public abstract void drive();
	public abstract void playMusic();
}

abstract class Porsche extends Car{
	public void drive(){
		System.out.println("Porsche Driving");
	}
}

class PorscheGT extends Porsche{

  //Overriding Method
  //public void drive(){
  //  System.out.println("PorscheGT Driving");
  //}
  
  public void playMusic(){
		System.out.println("PorscheGT playing Music");
	}
	
}

class AbstractKeyword{
	public static void main(String[] args){
	
	  //Object cannot be created for an abstract class
		//Car obj = new Car();
		//Porsche obj = new Porsche();
		
		PorscheGT obj = new PorscheGT();
    obj.drive();
    obj.playMusic();
	}
}

	
