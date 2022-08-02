public class Main {

    public static String getDurationString(int minutes, int seconds) {
        if(minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid value";
        }
        int hours = minutes / 60;
        minutes %= 60;
        String hoursString = (hours/10 >= 1? hours : "0" + hours) + "h";
        String minutesString = (minutes/10 >= 1? minutes : "0" + minutes) + "m";
        String secondsString = (seconds/10 >= 1? seconds : "0" + seconds) + "s";
        return hoursString + " " + minutesString + " " + secondsString;
    }

    public static String getDurationString(int seconds) {
        if(seconds < 0) {
            return "Invalid value";
        }
        int minutes = seconds / 60;
        seconds %= 60;
        return getDurationString(minutes, seconds);
    }

    public static void main(String[] args) {
        System.out.println(getDurationString(0, 60));
        System.out.println(getDurationString(-1));
        System.out.println(getDurationString(61, -1));
        System.out.println(getDurationString(-1,40));
        System.out.println(getDurationString(0, 0));
        System.out.println(getDurationString(0));
        System.out.println(getDurationString(61, 0));
        System.out.println(getDurationString(61 * 60));
        System.out.println(getDurationString(65, 45));
    }
}
