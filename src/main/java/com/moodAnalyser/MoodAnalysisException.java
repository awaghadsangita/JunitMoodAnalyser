package com.moodAnalyser;

public class MoodAnalysisException extends Exception{
    public MoodAnalysisException(ExceptionType noSuchClass) {
        super(noSuchClass.toString());
        this.type=noSuchClass;
    }

    enum ExceptionType{
        ENTERED_NULL,ENTERED_EMPTY,NO_SUCH_CLASS
    }

    ExceptionType type;

    public MoodAnalysisException(ExceptionType type,String message) {
        super(message);
        this.type = type;
    }
}

