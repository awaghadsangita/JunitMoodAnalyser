package com.moodAnalyser;

public class AnalyseMood {
    public String analyseMood(String message) {
        if(message.contains("HAPPY"))
        {
            return "HAPPY";
        }else{
            return "SAD";
        }
    }
}
