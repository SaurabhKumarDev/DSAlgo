import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get a number from the user and print whether it is positive or negative.
        System.out.print("Number : ");
        int num = sc.nextInt();
        System.out.println("+ve / -ve : "+((num>0)? "Positive" : "Negative"));

        // You have a fever if your temperature is above 100 and otherwise prints You don't have a fever.
        double temp = 100.2;
        System.out.println((temp>100)? "Fever":"normalTemperature");

        // Input week number(1-7) and print the day of week name
        System.out.print("Week number : ");
        int week = sc.nextInt();
        switch (week) {
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Didn't recognise");
        }

        // Whether that year is leap year or not
        int year = 1999;
        if (year%4 == 0) {
            if (year%100 == 0) {
                if (year%400 == 0) {
                    System.out.println("Leap Year");
                } else {
                    System.out.println("Not Leap Year");
                }
            } else {
                System.out.println("Leap Year");
            }
        } else {
            System.out.println("Not a Leap Year");
        }
    }
}