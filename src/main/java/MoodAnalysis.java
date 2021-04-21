public class MoodAnalysis {
    public String message;

    public String MoodAnalyser(String message) {

        if (message.contains("sad")) {
            return "SAD";

        } else {
            return "HAPPY";
        }

    }
}







