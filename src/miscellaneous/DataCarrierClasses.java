package miscellaneous;

record User(String name, int age){
    //Canonical Constructor
    // public User(String name, int age){
    //     if(age < 0) throw new IllegalArgumentException("Age Cannot be Negative");
    //     this.name = name.trim();
    //     this.age = age;
    // }

    //compact constructor
    public User{
        if(age < 0) throw new IllegalArgumentException("Age cannot be Negative");
        name = name.trim();
        //automatic this.name = name and this.age = age lines executed.
    }
}

public class DataCarrierClasses {
    public static void main(String[] args){
        User u1 = new User("Roshini", 19);
        User u2 = new User("Sanjay", 20);

    }
}
