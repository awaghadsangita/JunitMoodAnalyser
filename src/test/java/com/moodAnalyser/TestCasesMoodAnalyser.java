package com.moodAnalyser;

import org.junit.Test;

public class TestCasesMoodAnalyser {

    @Test
    public void givenMessage_WhenProper_ReturnHappy() {
        AnalyseMood mood = new AnalyseMood();
        mood.analyseMood("I am in Happy Mood");
    }
}
