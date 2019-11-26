package com.moodAnalyser;

public class AnalyseMood {
    String message;
    public AnalyseMood() {

    }

    public AnalyseMood(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalysisException {
        try {
            if(this.message.length()==0){
                return "Please enter proper message (mood can not be empty)";

            }else if (this.message.contains("SAD")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (NullPointerException e) {
            return "HAPPY";
        }
    }
}
