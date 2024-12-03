package org.vanier;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ScoreManagerTest {

    @Test
    void testScoreBelowPassing() {
        ScoreManager scoreManager = new ScoreManager(5);
        assertFalse(scoreManager.checkScore(), "Score of 5 should not be passing.");
    }

    @Test
    void testScoreEqualToPassing() {
        ScoreManager scoreManager = new ScoreManager(6);
        assertTrue(scoreManager.checkScore(), "Score of 6 should be passing.");
    }

    @Test
    void testScoreAbovePassing() {
        ScoreManager scoreManager = new ScoreManager(7);
        assertTrue(scoreManager.checkScore(), "Score of 7 should be passing.");
    }

    @Test
    void testNegativeScore() {
        ScoreManager scoreManager = new ScoreManager(-1);
        assertFalse(scoreManager.checkScore(), "Negative score should not be passing.");
    }

    @Test
    void testZeroScore() {
        ScoreManager scoreManager = new ScoreManager(0);
        assertFalse(scoreManager.checkScore(), "Score of 0 should not be passing.");
    }
}
