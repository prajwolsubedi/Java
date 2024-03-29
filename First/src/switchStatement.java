public class switchStatement {
    public static void main(String args[]){
        printDayOfWeek(3);
    }
    public static void printDayOfWeek(int day){

        String weekDay = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };
        System.out.print("Today is " + weekDay);
    }

}
