// Parent Class
class GrandMother {
    int assetsVal;
    // PRIVATE: Visible ONLY inside the GrandMother class curly braces.
    private String secretVault; 

    public GrandMother() {
        this.assetsVal = 0;
        this.secretVault = "Old Jewelry";
    }

    public GrandMother(int assetsVal) {
        this.assetsVal = assetsVal;
        this.secretVault = "Family Heirloom";
    }

    // Public getter to allow children to see the private value indirectly
    public String getSecret() {
        return this.secretVault;
    }

    public void showIdentity() {
        System.out.println("I am the GrandMother.");
    }
}

// Intermediate Class
class Mother extends GrandMother {
    int noOfCars;

    public Mother() {
        super(); // Calls GrandMother()
        this.noOfCars = 0;
    }

    public Mother(int cars, int assets) {
        super(assets); // Calls GrandMother(int assetsVal)
        this.noOfCars = cars;
    }

    @Override
    public void showIdentity() {
        System.out.println("I am the Mother.");
    }
}

// Main Child Class
public class BasicInheritance extends Mother {
    int investments;

    public BasicInheritance(int investments, int cars, int assets) {
        // super used to pass data up to Mother, who passes assets up to GrandMother
        super(cars, assets); 
        this.investments = investments;
    }

    @Override
    public void showIdentity() {
        super.showIdentity(); // Calls Mother's version
        System.out.println("...and I am the Child.");
    }

    public static void main(String[] args) {
        // --- 1. THE PRIVATE ACCESS TRAP ---
        GrandMother gm = new GrandMother(50000);
        // System.out.println(gm.secretVault); // COMPILER ERROR: secretVault is private
        System.out.println("Accessing private via Getter: " + gm.getSecret());

        // --- 2. SUPER KEYWORD & INHERITANCE ---
        BasicInheritance child = new BasicInheritance(5000, 2, 800000);
        System.out.println("\n___CHILD DATA___");
        System.out.println("Inherited Assets: " + child.assetsVal);
        System.out.println("Inherited Cars: " + child.noOfCars);
        System.out.println("Own Investments: " + child.investments);

        // --- 3. POLYMORPHISM (UPCASTING) ---
        // Reference type is GrandMother, but Object type is Mother
        GrandMother gm1 = new Mother(3, 150000); 
        
        System.out.println("\n___POLYMORPHIC TEST___");
        // Java executes the Mother's version of the method because the object is a Mother
        gm1.showIdentity(); 
        
        // Note: gm1.noOfCars would fail because the GrandMother reference can't "see" variables added in the Mother class.
        
        //Downcasting - Unsafe
        //Mother m1 = new GrandMother(10000);
        
    }
}
