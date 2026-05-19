interface Computer{
	public void code();
}
class Laptop implements Computer{
	public void code(){
		System.out.println("Coding in Laptop");
	}
}
class Desktop implements Computer{
	public void code(){
		System.out.println("Coding in Desktop");
	}
}
class Developer{
	public void developApp(Computer comp){
		System.out.println("Developing process Started");
		comp.code();
	}
}
class Demo{
	public static void main(String[] args){
		Developer roshini = new Developer();
		
		Computer lap = new Laptop();
		roshini.developApp(lap);
		
		Computer desk = new Desktop();
		roshini.developApp(desk);
	}
}
