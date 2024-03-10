public class FirstClass {
    public static void main(String[] args) {
        System.out.println("Main function working alright");
        displayHighScorePosition("prajwol", 1);
        int calculatedPlayerScore = calculateHighScorePosition(1000);
        System.out.println("Your Score is " + calculatedPlayerScore);

    }
    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore){
        int result = playerScore >= 1000 ? 1 : playerScore >= 500  ? 2 : playerScore >= 100 ? 3 : 4;
        return result;
    }
}
