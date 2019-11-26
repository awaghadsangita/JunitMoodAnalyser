package com.moodAnalyser;

import org.junit.Assert;
import org.junit.Test;

public class TestCasesMoodAnalyser {

    @Test
    public void givenMessage_WhenSAD_ReturnSad() {
        AnalyseMood mood = new AnalyseMood("I am in SAD Mood");
        Assert.assertEquals("SAD",mood.analyseMood());
    }
    @Test
    public void givenMessage_WithAnyMood_ShouldReturnHappy() {
        AnalyseMood mood = new AnalyseMood("i am in any mood");
        Assert.assertEquals("HAPPY",mood.analyseMood());
    }
    @Test
    public void givenMessage_WithHappyMood_ShouldReturnHappy() {
        AnalyseMood mood = new AnalyseMood("i am in HAPPY mood");
        Assert.assertEquals("HAPPY",mood.analyseMood());
    }

    @Test
    public void givenMessage_WithNull_ShouldReturnHappy() {
        AnalyseMood mood = new AnalyseMood(null);
        Assert.assertEquals("HAPPY",mood.analyseMood());
    }

    @Test
    public void givenMessage_WithHappyMood_ShouldReturnSad() {
        AnalyseMood mood = new AnalyseMood("i am in HAPPY mood");
        Assert.assertEquals("SAD",mood.analyseMood());
    }
}
