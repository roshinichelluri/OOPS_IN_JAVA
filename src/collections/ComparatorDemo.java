import java.util.*;

public class ComparatorDemo{
    public static void main(String[] args){
        List<String> hs = new ArrayList<>();
        hs.add("roshini");
        hs.add("devi");
        hs.add("chelluri");

        Comparator<String> com = new Comparator<String>(){
            public int compare(String s1, String s2){
                if(s1.length() > s2.length()) return 1;
                if(s1.length() < s2.length()) return -1;
                else return 0;
            }
        };

        Collections.sort(hs, com);
        System.out.println(hs);
    }
}