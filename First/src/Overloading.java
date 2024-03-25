public class Overloading {
    public static void main(String args[]){
        System.out.print("Your height in cm " + convertToCentimeters(5,12));
    }
    public static double convertToCentimeters(int heightInInches){
        return heightInInches * 2.54;
    }

    public static double convertToCentimeters(int heightInFeet, int heightInInches){
        int totalInches = heightInFeet * 12 + heightInInches;
        return convertToCentimeters(totalInches);
    }
}
