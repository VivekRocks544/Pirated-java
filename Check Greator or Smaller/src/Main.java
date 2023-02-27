import java.util.*;
public class Main {
    public static void main(String[] args) {

        math();
        grades(70);
        weeks(1);
    }
    public static  void math(){
        System.out.println(Math.abs(-123));
        System.out.println(Math.floor(23.4));
        System.out.println(Math.ceil(34.3));
        System.out.println(Math.max(10,11));
        System.out.println(Math.min(12,11));

    }
    public static void grades(int marks){
        char result = 'F';
        if(marks<30){
            result= 'F';
        }
        else if(marks > 30 && marks<40){
            result='D';
        }
        else if(marks > 40 && marks<50){
            result='C';
        }
        else if(marks > 50 && marks<60){
            result='B';
        }
        else if(marks > 60){
            result='A';
        }
        System.out.println(result);
    }

    public static void weeks(int day){
        String week= new String(" ");
       switch (day){
           case 1:
               week="Monday";
               break;
           case 2:
               week="Tuesday";
               break;
           case 3:
               week="Wednesday";
               break;
           case 4:
               week="Thursday";
               break;
           case 5:
               week="Friday";
               break;
           case 6:
               week="Saturday";
               break;
           case 7:
               week="Sunday";
               break;
       }
       System.out.println(week);
    }

}