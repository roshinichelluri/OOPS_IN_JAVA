package exceptions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ReadingIPwithExceptions {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            System.out.println("Enter your name: ");
            String line = br.readLine();
            System.out.println("Enter Your age: ");
            int age = Integer.parseInt(br.readLine());
            System.out.println("Learning Core Java ft." + line + ", " + age + " years old.");
        }catch(IOException e){
            System.out.println("Error : " + e.getMessage());
        }finally{
            try{
                if(br != null) br.close();
            }
            catch(IOException e){
                System.out.println("Error closing the BufferedReader");
            }
        }
    }
}
