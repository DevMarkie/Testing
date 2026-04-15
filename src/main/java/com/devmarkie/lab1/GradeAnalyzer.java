package com.devmarkie.lab1;

public final class GradeAnalyzer {
    private GradeAnalyzer() {
    }

    public static String evaluateSemester(int[] scores) {
        if (scores == null || scores.length == 0) {
            return "INVALID";
        }

        int total = 0;
        int failedSubjects = 0;

        for (int score : scores) {
            total += score;
            if (score < 5) {
                failedSubjects++;
            }
        }

        double average = (double) total / scores.length;

        if (failedSubjects > 0) {
            return "RETAKE";
        }
        if (average >= 8.0) {
            return "HONOR";
        }
        if (average >= 6.5) {
            return "PASS";
        }
        return "CONDITIONAL";
    }
}
