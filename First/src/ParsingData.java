import java.util.Scanner;

public class ParsingData {
    public static void main(String args[]){
        int currentYear = 2024;
        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e){
            System.out.println(getInputFromScanner(currentYear));
        }


    }

    public static String getInputFromConsole(int currentYear){
        String name = System.console().readLine("Hi what's your name?");
        System.out.println("Hi " + name + "!");

        String dob = System.console().readLine("What year were you born?");
        int birthYear = 2024 - Integer.parseInt(dob);
        return "So you are " + birthYear + " years old";
    }
    public static String getInputFromScanner(int currentYear){
        Scanner scanner = new Scanner(System.in);
        int age = 0;
//        System.out.println("Hi what's your name?");
//        String name = scanner.nextLine();
//        System.out.println("Hi " + name + "!");
//
//
//        System.out.println("What year were you born??");
//        String dob = scanner.nextLine();
        boolean isValidBirthYear = false;
            System.out.println("What year were you born??");
        do {
            System.out.println("Enter the age between >= " + (currentYear - 125)+ " to" + "<= " + currentYear );
            try{
                age = checkData(currentYear, scanner.nextLine());
                isValidBirthYear = age > 0 ? true : false;
            }catch(NumberFormatException badUserData){
                System.out.println("Please enter a number!");
            }
        } while(!isValidBirthYear);

        return "So you are " + age + " years old";
    }

    public static int checkData(int currentYear, String dateOfBirth){
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;
        if(dob < minimumYear || dob > currentYear)
            return -1;
        return currentYear - dob;
    }
}
