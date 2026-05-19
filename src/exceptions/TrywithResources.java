package exceptions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class TrywithResources {
    public static void main(String[] args){
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Enter your name");
            String str = br.readLine();
            System.out.println("Learning Java ft." + str);
        }
        catch(IOException e){
            System.out.println("IO Exception: " + e.getMessage());
        }
        //No finally block is needed, automatically the resoursces are closed.
    }
}
