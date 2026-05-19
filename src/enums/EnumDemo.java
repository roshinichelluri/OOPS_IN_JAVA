package enums;
enum Status {
    Success, Failure, Running, Pending;
}

class EnumDemo{
    public static void main(String[] args){
        Status s = Status.Success;
        System.out.println(s);
        System.out.println(s.ordinal());

        //For loop to print all the values of the enum
        System.out.println("For loop to print all the values of the enum");
        Status[] ss = Status.values();
        for(Status stat : ss) System.out.println(stat);

        //Switch case with enum
        System.out.print("Switch case with enum : " + s + " - Message:");
        switch(s){
            case Success:
                System.out.println("Operation Success");
                break;
            case Failure:
                System.out.println("Try Again");
                break;
            case Running:
                System.out.println("Operation in Progress");
                break;
            case Pending:
                System.out.println("Operation Pending");
                break;
            default:
                System.out.println("Invalid Status");
                break;
        }

        //package of enum
        System.out.println("Package of enum : " + s.getClass().getSuperclass());
    }
}