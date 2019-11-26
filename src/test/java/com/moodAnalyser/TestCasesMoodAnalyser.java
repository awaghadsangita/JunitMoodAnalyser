package com.moodAnalyser;

import org.junit.Assert;
import org.junit.Test;

public class TestCasesMoodAnalyser {

    @Test
    public void givenMessage_WhenProper_ReturnSad() {
        AnalyseMood mood = new AnalyseMood();
        String sadMood = mood.analyseMood("I am in Sad Mood");
        Assert.assertEquals("SAD",sadMood);
    }
}
