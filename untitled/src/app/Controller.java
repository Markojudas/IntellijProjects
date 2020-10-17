package app;
import people.Men;

import java.util.Scanner;

public class Controller {

    public static void main(String[] args) {

        System.out.println("THIS IS THE MAIN CLASS!!!!");

        Scanner in = new Scanner(System.in);


        System.out.println("What is your gender");
        String gender = in.nextLine();

        if(gender.substring(0,1).equalsIgnoreCase("m")){
            beMan();
        }else {
            Men man2 = new Men();
        }
    }

    public static void beMan(){

        Scanner in = new Scanner(System.in);
        boolean hasMustache;

        System.out.println("How big is your dick?");
        int dickSize = in.nextInt();
        in.nextLine();
        System.out.println("Do you have a mustache?");
        String mustache = in.nextLine();

        if(mustache.substring(0,1).equalsIgnoreCase("y")){
            hasMustache = true;
        }else{
            hasMustache = false;
        }
        Men man = new Men(dickSize, hasMustache);
    }
}
