package com.moodAnalyser;

public class AnalyseMood {
    String message;
    public AnalyseMood() {

    }

    public AnalyseMood(String message) {
        this.message = message;
    }

    public String analyseMood() {
        if(this.message.contains("SAD"))
        {
            return "SAD";
        }else{
            return "HAPPY";
        }
    }
}
