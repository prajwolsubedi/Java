public class time {
    public static void main(String args[]){
        System.out.println(getDurationString(-1, 20));
        System.out.println(getDurationString(-11));
    }
    public static String getDurationString(int seconds){
        if(seconds < 0)
            return"Invalid time";
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return (getDurationString(minutes, remainingSeconds));
    }

    public static String getDurationString(int minutes, int seconds){
        if(minutes < 0 || (seconds < 0 || seconds > 59))
            return "Invalid time";
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        return hours + "h " + remainingMinutes + "m " + seconds + "s ";
    }
}
