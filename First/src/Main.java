import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        /***Polymorphism
         * Car car = new Car();
         *         Bicycle bicycle = new Bicycle();
         *         Boat boat = new Boat();
         *         Vehicle[] transport = {car, bicycle,boat};
         *
         *         for(Vehicle x : transport){
         *             x.go();
         *         }
         *
         *
         *
         */


        /*
        //Audio
                Scanner scanner = new Scanner(System.in);

        File file = new File("example.wav");
        AudioInputStream audioInput = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioInput);
        String response = "";

        while (!response.equals("Q")){
            System.out.println("P = Play, Q = Quit, S = Stop, R = Reset");
            System.out.println("Enter your choice: ");
            response = scanner.next();
            response = response.toUpperCase();
            switch (response){
                case "P": clip.start();
                    break;
                case ("Q"): clip.stop();
                    break;
                case ("S"): clip.close();
                    break;
                case ("R"): clip.setMicrosecondPosition(0);
                    break;
                default: System.out.println("Not a valid response");
            }
        }
        System.out.println("Out of the loop Byeee!!");

         */





    }
}
