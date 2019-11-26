package com.moodAnalyser;

public class AnalyseMood {
    String message;
    public AnalyseMood() {

    }

    public AnalyseMood(String message) {
        this.message = message;
    }

    public String analyseMood() {
        try{
            if(this.message.contains("SAD"))
            {
                return "SAD";
            }else{
                return "HAPPY";
            }
        }catch(NullPointerException e)
                return "HAPPY";
        }
    }
}
