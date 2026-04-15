package com.devmarkie.lab1;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] sampleScores = {9, 8, 7, 10};
        String result = GradeAnalyzer.evaluateSemester(sampleScores);
        System.out.println("Input scores: " + Arrays.toString(sampleScores));
        System.out.println("Evaluation: " + result);
    }
}
