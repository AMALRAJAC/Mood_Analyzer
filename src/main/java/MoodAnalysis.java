public class MoodAnalysis {
    public String message;

    public String MoodAnalyser(String message) throws MoodAnalysisException {

        this.message = message;
        return analyzeMood();
    }

    private String analyzeMood() throws MoodAnalysisException {

        try {
            if(message==null){
                throw new MoodAnalysisException("Error occurred ,error type = "+MoodAnalysisException.errorType.NULL_VALUE);
            }
            else if(message.length()==0){
                throw new MoodAnalysisException("Error occurred ,error type = "+MoodAnalysisException.errorType.EMPTY_VALUE);
            }
            else if (message.contains("sad")) {
                return "SAD";

            } else if (message.contains("happy")) {
                return "HAPPY";
            }
            else{
                throw new MoodAnalysisException("given mood is invalid");
            }
        } catch ( Exception ex) {
          System.out.println("Exception occurred: "+ex);

        }

        return "HAPPY";
    }
}






