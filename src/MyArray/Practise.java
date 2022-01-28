package MyArray;

import java.awt.*;
import java.util.ArrayList;

public class Practise {
    public static void main(String[] args){
     /**   System.out.println(Practise.addValue(3,4));
        System.out.println(Practise.mutiplyValue(7,90));
        System.out.println(Practise.divideValue(100,5));
    }
    public static int addValue(int x,int y){
        return x + y;
    }
    public static int mutiplyValue(int x,int y) {
        return x * y;
    } public static int divideValue(int x,int y) {
        return x / y;

     ArrayList<String> myMonth = new ArrayList<String>();
     int month = 8;
     switch (month){
         case 1: myMonth.add("January");
         case 2: myMonth.add("Feburary");
         case 3: myMonth.add("March");
         case 4: myMonth.add("April");
         case 5: myMonth.add("May");
         case 6: myMonth.add("June");
         case 7: myMonth.add("July");
         case 8: myMonth.add("August");
         case 9: myMonth.add("September");
         case 10:myMonth.add("October");
         case 11:myMonth.add("November");
         break;
     }
     if(myMonth.isEmpty()){
         System.out.println("Invalid month");
        }
     else{
           for(String monthName: myMonth){
               System.out.println(monthName);
           }
        } */
     Rectangle myrect = new Rectangle(200,100);
     myrect.width = 200;
     myrect.height = 100;
     System.out.println(myrect.getWidth());
    }

}
