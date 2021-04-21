
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalysisTest {

    @Test
    public void MoodAnalysisSad() throws MoodAnalysisException {
        MoodAnalysis moodAnalyzer=new MoodAnalysis();
        String mood = moodAnalyzer.MoodAnalyser("I am in sad mood");
        Assert.assertEquals("SAD",mood);
    }
    @Test
    public void MoodAnalysisHappyMood() throws MoodAnalysisException {
        MoodAnalysis moodAnalyzer=new MoodAnalysis();
        String mood = moodAnalyzer.MoodAnalyser("I am in happy mood");
        Assert.assertEquals("HAPPY",mood);
    }
    @Test
    public void moodAnalysisNUllMood() throws MoodAnalysisException {
        MoodAnalysis moodAnalyzer=new MoodAnalysis();
        String mood = moodAnalyzer.MoodAnalyser(null);
        Assert.assertEquals("HAPPY",mood);
    }
}
