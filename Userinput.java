import java.util.Scanner;

public class Userinput{
    public static void main(String[] args) {
        //TO table input import Scanner class at the top of the file
        //Omport java.util.scanner
        //Make an object of the scanner and take input form object
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("Enter your address");
        String address = sc.nextLine();
        System.out.println("Enter your phone number");
        String phone = sc.nextLine();
        System.out.println("Enter your email");
        String email = sc.nextLine();
        System.out.println("Your details are:");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    
}
 