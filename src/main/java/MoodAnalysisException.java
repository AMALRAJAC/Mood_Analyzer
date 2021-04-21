class MoodAnalysisException extends Exception {

    private static final String message =null ;
    public enum errorType {
        NULL_VALUE,
        EMPTY_VALUE;
    }
    public MoodAnalysisException(String message) {

        super(message);

    }

    }


