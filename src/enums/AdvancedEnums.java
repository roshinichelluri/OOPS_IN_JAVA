package enums;

enum TrafficLight{
    Red("Stop"),
    Yellow("Caution"),
    Green("Go");

    private final String action;

    private TrafficLight(String action){
        this.action = action;
    }

    public String getAction(){
        return this.action;
    }
}

public class AdvancedEnums {
    public static void main(String[] args){
        TrafficLight light = TrafficLight.Red;

        System.out.println("Light: " + light + " - Action : " + light.getAction());
    }
}
