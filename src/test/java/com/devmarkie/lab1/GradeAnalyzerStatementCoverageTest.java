package com.devmarkie.lab1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class GradeAnalyzerStatementCoverageTest {

    @Test
    void shouldReturnInvalidWhenScoresIsNull() {
        assertEquals("INVALID", GradeAnalyzer.evaluateSemester(null));
    }

    @Test
    void shouldReturnInvalidWhenScoresIsEmpty() {
        assertEquals("INVALID", GradeAnalyzer.evaluateSemester(new int[]{}));
    }

    @Test
    void shouldReturnRetakeWhenAnyScoreBelowFive() {
        assertEquals("RETAKE", GradeAnalyzer.evaluateSemester(new int[]{9, 4, 8}));
    }

    @Test
    void shouldReturnHonorWhenAverageAtLeastEightAndNoFail() {
        assertEquals("HONOR", GradeAnalyzer.evaluateSemester(new int[]{8, 8, 8, 8}));
    }

    @Test
    void shouldReturnPassWhenAverageAtLeastSixPointFiveAndBelowEight() {
        assertEquals("PASS", GradeAnalyzer.evaluateSemester(new int[]{7, 7, 6, 6}));
    }

    @Test
    void shouldReturnConditionalWhenAverageBelowSixPointFiveAndNoFail() {
        assertEquals("CONDITIONAL", GradeAnalyzer.evaluateSemester(new int[]{5, 6, 5, 6}));
    }
}
