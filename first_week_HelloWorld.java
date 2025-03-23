import java.util.Scanner;
public class first_week_HelloWorld {
    public static void main(String[] args) {

        //Print world "Hello world"
        System.out.println("Hello world");

        System.out.println("\n");

        //Print list of integer numbers from small to larg
        for(int i = 0; i <= 10; i++){
            System.out.printf("So thu %d: " +i+ "\n", i);
        }

        System.out.println("\n");

        //basic math
        int num1 = 10;
        int num2 = 5;
        int add = num1+num2;
        int subtraction = num1 - num2;
        int multiplication = num1*num2;
        int division = num1/num2;

        System.out.println("Add = " + add);
        System.out.println("Subtraction = " + subtraction);
        System.out.println("Multiplication = " + multiplication);
        System.out.println("Division = " + division);

        System.out.println("\n");

        //calculate circumference and area of ​​circle
        double radius  = 3.5;
        double Pi = 3.14159; 
        System.out.println("Circumference = " + 2*Pi*radius);
        System.out.println("Area = " + Pi*Math.pow(radius, 2));

        System.out.println("\n");

        //Enter data
        Scanner scanner = new Scanner(System.in);
        System.out.print("What's your name:");
        String name = scanner.nextLine();

        System.out.print("How old are you:");
        int age = scanner.nextInt();

        System.out.println("=========================");
        System.out.println("Your name is: " + name);
        System.out.print("Your age is: " + age);

    }
}
