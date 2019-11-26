package com.moodAnalyser;

public class AnalyseMood {
    String message;
    public AnalyseMood() {

    }

    public AnalyseMood(String message) {
        this.message = message;
    }
    public String analyseMood(String message) throws MoodAnalysisException {
        this.message=message;
        return  analyseMood();
    }
    public String analyseMood() throws MoodAnalysisException {
        try {
            if(this.message.length()==0){
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY,"Please enter proper message");

            }else if (this.message.contains("SAD")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (NullPointerException e) {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL,"Please enter proper message");
        }
    }

    public boolean equals(Object another)
    {
        if (this.message.equals(((AnalyseMood)another).message))
            return true;
        return false;

    }
}
