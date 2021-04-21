
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalysisTest {

    @Test
    public void MoodAnalysisSad() {
        MoodAnalysis moodAnalyzer=new MoodAnalysis();
        String mood = moodAnalyzer.MoodAnalyser("I am in sad mood");
        Assert.assertEquals("SAD",mood);
    }
    @Test
    public void MoodAnalysisHappyMood() {
        MoodAnalysis moodAnalyzer=new MoodAnalysis();
        String mood = moodAnalyzer.MoodAnalyser("I am in happy mood");
        Assert.assertEquals("HAPPY",mood);
    }

}
