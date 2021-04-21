public class MoodAnalysis {
    public String message;

    public String MoodAnalyser(String message) throws MoodAnalysisException {

        this.message = message;
        return analyzeMood();
    }

    private String analyzeMood() throws MoodAnalysisException {

        try {

            if (message.contains("sad")) {
                return "SAD";

            } else if (message.contains("happy")) {
                return "HAPPY";
            }
            else{
                throw new MoodAnalysisException("invalid entry");
            }
        } catch ( Exception ex) {
          System.out.println("Exception occurred: "+ex);

        }

        return "HAPPY";
    }
}






