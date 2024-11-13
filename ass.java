import java.util.Scanner;

public class ass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number (1-7) to get the corresponding day of the week: ");
        int dayNumber = scanner.nextInt();
        
        if (dayNumber == 1) {
            System.out.println("Sunday");
        } else if (dayNumber == 2) {
            System.out.println("Monday");
        } else if (dayNumber == 3) {
            System.out.println("Tuesday");
        } else if (dayNumber == 4) {
            System.out.println("Wednesday");
        } else if (dayNumber == 5) {
            System.out.println("Thursday");
        } else if (dayNumber == 6) {
            System.out.println("Friday");
        } else if (dayNumber == 7) {
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid input! Please enter a number between 1 and 7.");
        }
        
        

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                
        System.out.println("Enter a number (1-7) for the day of the week:");
        int day = scanner.nextInt();
                
        String dayName;
                
         switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                 break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                 dayName = "Saturday";
                 break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day! Please enter a number between 1 and 7.";
                 break;
        }
                
        System.out.println(dayName);
        scanner.close();
    }
}

