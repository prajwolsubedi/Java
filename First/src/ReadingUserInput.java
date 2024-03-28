import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String args[]){
        System.out.println(getInputFromScanner());
    }
    public static String getInputFromScanner(){
        boolean isValid = false;
        double number = 0;
        int count = 0;
        double sum = 0;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Enter any " + (5 - count) + " numbers");
            try{
                number = Double.parseDouble(scanner.nextLine());
                isValid = number > 0 ? true : false;
                if(!isValid) System.out.println("Please enter a valid number");
                else {
                    sum += number;
                    count++;
                    System.out.println("Entered number #" + count);
                }
            } catch (NumberFormatException badUserInput){
                System.out.println("Enter a number");
            }

        } while(count < 5);
    return "The total sum is " + sum;
    }


}
