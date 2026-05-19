package miscellaneous;

import java.util.ArrayList;

class Alien{}
public class LVTI {
    //var num = 10; //var is not applicable for global variables
    public static void main(String[] args){
        //LVTI - Local Variable Type Inference
        //var num; //produces error because we need to initialise at the time of declaration.
        var num = 10;
        var d = 10.9;
        var obj = new Alien();
        var arr = new int[10];
        var al = new ArrayList();
    }
}
