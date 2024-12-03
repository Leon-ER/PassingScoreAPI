package org.vanier;

public class ScoreManager {
    int score;
    public ScoreManager() {
    }
    public ScoreManager(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean checkScore(){
        return score >= 6;
    }
}
