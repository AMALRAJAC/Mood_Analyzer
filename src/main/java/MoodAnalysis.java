public class MoodAnalysis {
    public String message;

    public String MoodAnalyser(String message) {

        this.message = message;
        return analyzeMood();
    }

    private String analyzeMood(){

        if (message.contains("sad")) {
            return "SAD";

        } else {
            return "HAPPY";
        }

    }
}







