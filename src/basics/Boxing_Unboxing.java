class Boxing_Unboxing{
	public static void main(String[] args){
		int num = 10;
		// Depricated syntax - Integer ob = new Integer(num); //boxing
		Integer obj = num; //auto-boxing
		int nu = obj.intValue(); //unboxing
		int n = obj; //auto-unboxing
		System.out.println(obj);
		System.out.println(n);
		System.out.println(nu);
	}
}
