package com.moodAnalyser;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MoodAnalyserFactory {
    public static AnalyseMood createMoodAnalyser() throws MoodAnalysisException {
        try {
            Class<?> moodAnalyserClass = Class.forName("com.moodAnalyser.AnalyseMood1");
            Constructor<?> moodConstructor = moodAnalyserClass.getConstructor();
            Object moodObject = moodConstructor.newInstance();
            return (AnalyseMood) moodObject;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
           throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.NO_SUCH_CLASS);
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static AnalyseMood createMoodAnalyser(String message) throws MoodAnalysisException {
        try {
            Class<?> moodAnalyserClass = Class.forName("com.moodAnalyser.AnalyseMood");
            Constructor<?> moodConstructor = moodAnalyserClass.getConstructor(String.class);
            Object moodObject = moodConstructor.newInstance(message);
            return (AnalyseMood) moodObject;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.NO_SUCH_CLASS);
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }
}
