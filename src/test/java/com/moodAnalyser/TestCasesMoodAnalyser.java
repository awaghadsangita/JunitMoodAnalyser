package com.moodAnalyser;

import org.junit.Assert;
import org.junit.Test;

public class TestCasesMoodAnalyser {

    @Test
    public void givenMessage_WhenSAD_ReturnSad() {
        AnalyseMood mood = new AnalyseMood("I am in SAD Mood");
        try {
            Assert.assertEquals("SAD",mood.analyseMood());
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenMessage_WithAnyMood_ShouldReturnHappy() {
        AnalyseMood mood = new AnalyseMood("i am in any mood");
        try {
            Assert.assertEquals("HAPPY",mood.analyseMood());
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenMessage_WithHappyMood_ShouldReturnHappy() {
        AnalyseMood mood = new AnalyseMood("i am in HAPPY mood");
        try {
            Assert.assertEquals("HAPPY",mood.analyseMood());
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenMessage_WithNull_ShouldReturnHappy() {
        AnalyseMood mood = new AnalyseMood(null);
        try {
          mood.analyseMood(null);

        } catch (MoodAnalysisException e) {
            Assert.assertEquals("Please enter proper message",e.getMessage());
        }
    }

    @Test
    public void givenMessage_WithHappyMood_ShouldReturnSad() {
        AnalyseMood mood = new AnalyseMood("i am in HAPPY mood");
        try {
            Assert.assertEquals("HAPPY",mood.analyseMood());
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenNullMood_Should_throwMoodAnalysisException() {

        AnalyseMood analyseMood = new AnalyseMood(null);
        try {
            analyseMood.analyseMood();
        } catch (MoodAnalysisException e) {
            Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL,e.type);
        }
    }
    @Test
    public void givenEmptyMood_Should_throwMoodAnalysisException() {
        AnalyseMood analyseMood = new AnalyseMood("");
        try {
            analyseMood.analyseMood();
        } catch (MoodAnalysisException e) {
            Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_EMPTY,e.type);
        }
    }

    @Test
    public void GivenAnalyseMoodClass_ShouldReturnMoodAnalyserObject() {
        AnalyseMood moodAnalyser = MoodAnalyserFactory.createMoodAnalyser("I am in Happy mood");
        Assert.assertEquals(new AnalyseMood("I am in Happy mood"),moodAnalyser);
    }
}
