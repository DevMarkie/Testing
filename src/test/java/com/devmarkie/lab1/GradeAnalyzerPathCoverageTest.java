package com.devmarkie.lab1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class GradeAnalyzerPathCoverageTest {

    @Test
    void pathInvalidNullInput() {
        assertEquals("INVALID", GradeAnalyzer.evaluateSemester(null));
    }

    @Test
    void pathInvalidEmptyInput() {
        assertEquals("INVALID", GradeAnalyzer.evaluateSemester(new int[]{}));
    }

    @Test
    void pathRetakeWhenAtLeastOneFailedSubjectExists() {
        assertEquals("RETAKE", GradeAnalyzer.evaluateSemester(new int[]{10, 9, 4, 8}));
    }

    @Test
    void pathHonorAtBoundaryAverageEight() {
        assertEquals("HONOR", GradeAnalyzer.evaluateSemester(new int[]{8, 8, 8, 8}));
    }

    @Test
    void pathPassAtBoundaryAverageSixPointFive() {
        assertEquals("PASS", GradeAnalyzer.evaluateSemester(new int[]{6, 7, 6, 7}));
    }

    @Test
    void pathConditionalWhenAverageBelowSixPointFiveWithoutFailedSubject() {
        assertEquals("CONDITIONAL", GradeAnalyzer.evaluateSemester(new int[]{5, 6, 6, 5}));
    }
}
