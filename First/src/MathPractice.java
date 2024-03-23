import java.util.Scanner;

public class MathPractice {
    public static void main (String[] args){
        double x,y,z;
        String name;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of base of triangle");
        x = scanner.nextDouble();
        System.out.println("Enter the value of perpendicular of triangle");
        y = scanner.nextDouble();
        scanner.nextLine();
        z = Math.sqrt(x*x + y*y);


        System.out.println("The hypotenuse of the triangle is " + z);




        System.out.println("What is your name ");
        name = scanner.nextLine();

        System.out.println("So your name is " + name);



    }
}
