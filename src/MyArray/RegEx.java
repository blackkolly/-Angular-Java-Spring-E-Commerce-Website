package MyArray;

import java.io.Console;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegEx {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your zipcode here:");
        String zipCode = in.nextLine();
        //my code here
        if (zipCode.matches("\\d{5}")){
            System.out.println("This is a valid zipcode:" + zipCode);

        }else{
            System.out.println("This is not a valid zipcode:" + zipCode);
        }

    }
}
